package ar.com.research.tournament.domain.game;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Agustin Sequeira on 6/6/2017.
 * Domain class represents a Player
 */
@NodeEntity
public class Player {

    @GraphId
    private Long id;

    private String name;

    @Relationship(type = "PLAY", direction = Relationship.UNDIRECTED)
    private Set<Game> games = new HashSet<>();

    private Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
