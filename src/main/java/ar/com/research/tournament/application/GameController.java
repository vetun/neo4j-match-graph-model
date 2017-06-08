package ar.com.research.tournament.application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Agustin Sequeira on 6/6/2017.
 * Game API
 */
@RestController("/games")
public class GameController {

    @RequestMapping("/")
    public ResponseEntity addPlayer() {

        return ResponseEntity.ok("");
    }

}
