package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Movie_CastEntity")
@Table(name = "movie_cast")
public class MovieCast implements Serializable {
    private static final long serialVersionUID = -180517458855928461L;
    private MovieCastId id;

    private String characterName;

    private Gender gender;

    private Integer mcPk;

    @EmbeddedId
    public MovieCastId getId() {
        return id;
    }

    public void setId(MovieCastId id) {
        this.id = id;
    }

    @Column(name = "character_name", length = 400)
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gender_id")
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Column(name = "mc_pk")
    public Integer getMcPk() {
        return mcPk;
    }

    public void setMcPk(Integer mcPk) {
        this.mcPk = mcPk;
    }

}