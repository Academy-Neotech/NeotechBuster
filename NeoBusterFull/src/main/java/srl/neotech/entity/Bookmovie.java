package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "BookmovieEntity")
@Table(name = "bookmovie")
public class Bookmovie implements Serializable {
    private static final long serialVersionUID = -6321104843858695042L;
    private Integer id;

    private Movie movie;

    private User username;

    private LocalDate dateFrom;

    private LocalDate dateTo;

    private LocalDate dateReturn;

    private String price;

    @Id
    @Column(name = "bookmovie_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username")
    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    @Column(name = "date_from")
    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    @Column(name = "date_to")
    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    @Column(name = "date_return")
    public LocalDate getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(LocalDate dateReturn) {
        this.dateReturn = dateReturn;
    }

    @Column(name = "price", length = 45)
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}