package srl.neotech.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovieCastId implements Serializable {
    private static final long serialVersionUID = -5256805335263649369L;
    private Integer movieId;

    private Integer personId;

    private Integer castOrder;

    @Column(name = "movie_id", nullable = false)
    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    @Column(name = "person_id", nullable = false)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Column(name = "cast_order", nullable = false)
    public Integer getCastOrder() {
        return castOrder;
    }

    public void setCastOrder(Integer castOrder) {
        this.castOrder = castOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MovieCastId entity = (MovieCastId) o;
        return Objects.equals(this.castOrder, entity.castOrder) &&
                Objects.equals(this.movieId, entity.movieId) &&
                Objects.equals(this.personId, entity.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(castOrder, movieId, personId);
    }

}