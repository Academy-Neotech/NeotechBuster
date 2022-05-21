package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Movie_KeywordEntity")
@Table(name = "movie_keywords")
public class MovieKeyword implements Serializable {
    private static final long serialVersionUID = 1245960295668665518L;
    private MovieKeywordId id;

    private Movie movie;

    private Keyword keyword;

    @EmbeddedId
    public MovieKeywordId getId() {
        return id;
    }

    public void setId(MovieKeywordId id) {
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

    @MapsId("keywordId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "keyword_id", nullable = false)
    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

}