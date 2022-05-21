package srl.neotech.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovieCompanyId implements Serializable {
    private static final long serialVersionUID = 8966590159860723643L;
    private Integer movieId;

    private Integer companyId;

    @Column(name = "movie_id", nullable = false)
    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    @Column(name = "company_id", nullable = false)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MovieCompanyId entity = (MovieCompanyId) o;
        return Objects.equals(this.companyId, entity.companyId) &&
                Objects.equals(this.movieId, entity.movieId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, movieId);
    }

}