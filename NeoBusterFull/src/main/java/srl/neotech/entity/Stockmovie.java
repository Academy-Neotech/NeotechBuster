package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "StockmovieEntity")
@Table(name = "stockmovie")
public class Stockmovie implements Serializable {
    private static final long serialVersionUID = 4339306067396712693L;
    private Integer id;

    private Movie movie;

    private Integer quantity;

    private Integer price;

    private Integer specialoffer;

    private String dateArrived;

    @Id
    @Column(name = "movie_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "movie_id", nullable = false)
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Column(name = "specialoffer")
    public Integer getSpecialoffer() {
        return specialoffer;
    }

    public void setSpecialoffer(Integer specialoffer) {
        this.specialoffer = specialoffer;
    }

    @Column(name = "date_arrived", length = 45)
    public String getDateArrived() {
        return dateArrived;
    }

    public void setDateArrived(String dateArrived) {
        this.dateArrived = dateArrived;
    }

}