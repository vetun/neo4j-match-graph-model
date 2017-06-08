package ar.com.research.tournament.application;

import ar.com.research.tournament.domain.game.Player;
import ar.com.research.tournament.dto.PlayerDto;
import ar.com.research.tournament.factory.DomainObjectFactory;
import ar.com.research.tournament.factory.DtoFactory;
import ar.com.research.tournament.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Agustin Sequeira on 6/6/2017.
 * Player API
 */
@RestController("/players")
public class PlayerController {

    private final PlayerRepository playerRepository;
    private final DomainObjectFactory domainObjectFactory;
    private final DtoFactory dtoFactory;

    @Autowired
    public PlayerController(PlayerRepository playerRepository, DomainObjectFactory domainObjectFactory, DtoFactory dtoFactory) {
        this.playerRepository = playerRepository;
        this.domainObjectFactory = domainObjectFactory;
        this.dtoFactory = dtoFactory;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @Transactional()
    ResponseEntity player(@RequestBody PlayerDto dto) {

        Player aPlayer = this.domainObjectFactory.instancePlayer(dto);
        this.playerRepository.save(aPlayer);

        return ResponseEntity.ok("the resource was added successfully");
    }

    @RequestMapping(method = RequestMethod.GET)
    @Transactional(readOnly = true)
    ResponseEntity player() {
        List<PlayerDto> dtos = this.dtoFactory.toDto(this.playerRepository.findAll());
        return ResponseEntity.ok(dtos);
    }
}
