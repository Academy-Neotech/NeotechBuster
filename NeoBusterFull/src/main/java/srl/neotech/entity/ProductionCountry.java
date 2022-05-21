package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Production_CountryEntity")
@Table(name = "production_country")
public class ProductionCountry implements Serializable {
    private static final long serialVersionUID = -2568855127486343680L;
    private ProductionCountryId id;

    private Movie movie;

    private Country country;

    @EmbeddedId
    public ProductionCountryId getId() {
        return id;
    }

    public void setId(ProductionCountryId id) {
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

    @MapsId("countryId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", nullable = false)
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}