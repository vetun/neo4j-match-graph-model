package ar.com.research.tournament.domain.game;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by Agustin Sequeira on 6/6/2017.
 * Domain class representing a Set
 */
@NodeEntity
class Set {

    @GraphId
    private Long id;
}
