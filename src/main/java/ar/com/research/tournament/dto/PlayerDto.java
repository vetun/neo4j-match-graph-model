package ar.com.research.tournament.dto;

/**
 * Created by Agustin Sequeira on 6/6/2017.
 * Dto to transport player information from front end to back end
 */
public class PlayerDto {
    private String name;

    public PlayerDto() {
    }

    public PlayerDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PlayerDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
