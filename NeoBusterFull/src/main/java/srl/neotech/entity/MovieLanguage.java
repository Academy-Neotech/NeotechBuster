package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Movie_LanguageEntity")
@Table(name = "movie_languages")
public class MovieLanguage implements Serializable {
    private static final long serialVersionUID = -1280953142613988002L;
    private MovieLanguageId id;

    private Movie movie;

    private Language language;

    private LanguageRole languageRole;

    @EmbeddedId
    public MovieLanguageId getId() {
        return id;
    }

    public void setId(MovieLanguageId id) {
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

    @MapsId("languageId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "language_id", nullable = false)
    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @MapsId("languageRoleId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "language_role_id", nullable = false)
    public LanguageRole getLanguageRole() {
        return languageRole;
    }

    public void setLanguageRole(LanguageRole languageRole) {
        this.languageRole = languageRole;
    }

}