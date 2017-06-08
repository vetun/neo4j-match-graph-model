package ar.com.research.tournament.repository;

import ar.com.research.tournament.domain.game.Player;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Agustin Sequeira on 6/6/2017.
 * Retrieve and persist Player instances
 */
@Repository
public interface PlayerRepository extends GraphRepository<Player> {
    List<Player> findAll();
}
