package srl.neotech.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "username", nullable = false, length = 45)
    private String id;

    @Column(name = "password", nullable = false, length = 45)
    private String password;

    @Column(name = "enabled")
    private Boolean enabled;


    @OneToMany(mappedBy = "username")
    private Set<Bookmovie> bookmovies = new LinkedHashSet<>();

    @OneToMany(mappedBy = "username")
    private Set<Card> cards = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

  

    public Set<Bookmovie> getBookmovies() {
        return bookmovies;
    }

    public void setBookmovies(Set<Bookmovie> bookmovies) {
        this.bookmovies = bookmovies;
    }

    public Set<Card> getCards() {
        return cards;
    }

    public void setCards(Set<Card> cards) {
        this.cards = cards;
    }

}