package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Movie_CompanyEntity")
@Table(name = "movie_company")
public class MovieCompany implements Serializable {
    private static final long serialVersionUID = -6489851447135819200L;
    private MovieCompanyId id;

    private Movie movie;

    private ProductionCompany company;

    @EmbeddedId
    public MovieCompanyId getId() {
        return id;
    }

    public void setId(MovieCompanyId id) {
        this.id = id;
    }

    @MapsId("movieId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "movie_id", nullable = false)
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @MapsId("companyId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    public ProductionCompany getCompany() {
        return company;
    }

    public void setCompany(ProductionCompany company) {
        this.company = company;
    }

}