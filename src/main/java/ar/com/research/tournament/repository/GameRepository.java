package ar.com.research.tournament.repository;

import ar.com.research.tournament.domain.game.Game;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Melina Garcia on 6/6/2017.
 * Retrieve and persist Game instances
 */
@Repository
public interface GameRepository extends GraphRepository<Game> {

}
