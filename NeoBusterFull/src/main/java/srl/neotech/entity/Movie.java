package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "MovieEntity")
@Table(name = "movie")
public class Movie implements Serializable {
    private static final long serialVersionUID = -4635243282854885823L;
    private Integer id;

    private String title;

    private Integer budget;

    private String homepage;

    private String overview;

    private BigDecimal popularity;

    private LocalDate releaseDate;

    private Long revenue;

    private Integer runtime;

    private String movieStatus;

    private String tagline;

    private BigDecimal voteAverage;

    private Integer voteCount;

    private String urlImage;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "title", nullable = false, length = 1000)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "budget")
    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    @Column(name = "homepage", length = 1000)
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @Column(name = "overview", length = 1000)
    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Column(name = "popularity", precision = 12, scale = 6)
    public BigDecimal getPopularity() {
        return popularity;
    }

    public void setPopularity(BigDecimal popularity) {
        this.popularity = popularity;
    }

    @Column(name = "release_date")
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Column(name = "revenue")
    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    @Column(name = "runtime")
    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    @Column(name = "movie_status", length = 50)
    public String getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(String movieStatus) {
        this.movieStatus = movieStatus;
    }

    @Column(name = "tagline", length = 1000)
    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    @Column(name = "vote_average", precision = 4, scale = 2)
    public BigDecimal getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(BigDecimal voteAverage) {
        this.voteAverage = voteAverage;
    }

    @Column(name = "vote_count")
    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Column(name = "url_image", length = 200)
    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

}