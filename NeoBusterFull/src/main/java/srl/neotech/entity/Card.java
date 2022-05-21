package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "CardEntity")
@Table(name = "card")
public class Card implements Serializable {
    private static final long serialVersionUID = -8384126447129176946L;
    private Integer id;

    private User username;

    private Integer balance;

    private LocalDate expirationDate;

    @Id
    @Column(name = "card_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "username", nullable = false)
    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    @Column(name = "balance")
    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Column(name = "expiration_date")
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

}