package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Movie_GenreEntity")
@Table(name = "movie_genres")
public class MovieGenre implements Serializable {
    private static final long serialVersionUID = 2613743841672062376L;
    private MovieGenreId id;

    private Movie movie;

    private Genre genre;

    @EmbeddedId
    public MovieGenreId getId() {
        return id;
    }

    public void setId(MovieGenreId id) {
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

    @MapsId("genreId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "genre_id", nullable = false)
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}