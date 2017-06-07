package ar.com.research.tournament.domain.game;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;

/**
 * Created by Agustin Sequeira on 6/6/2017.
 * Domain class represents a Game
 */
@NodeEntity
public class Game {

    @GraphId
    private Long id;

    @Relationship(type = "HAVE", direction = Relationship.UNDIRECTED)
    private java.util.Set<Set> sets = new HashSet<>();
}
