package ar.com.research.tournament.factory;

import ar.com.research.tournament.domain.game.Player;
import ar.com.research.tournament.dto.PlayerDto;
import org.springframework.stereotype.Component;

/**
 * Created by Agustin Sequeira on 6/6/2017.
 * Responsible of instance all the domain objects
 */
@Component
public class DomainObjectFactory {

    /**
     * Instance a Player
     *
     * @param dto of the player
     * @return new valid Player instance
     */
    public Player instancePlayer(PlayerDto dto) {
        return new Player(dto.getName());
    }
}
