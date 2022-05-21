package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "AuthorityEntity")
@Table(name = "authorities")
public class Authority implements Serializable {
    private static final long serialVersionUID = 1383204645433899469L;
    private AuthorityId id;

    private User username;

    @EmbeddedId
    public AuthorityId getId() {
        return id;
    }

    public void setId(AuthorityId id) {
        this.id = id;
    }

    @MapsId("username")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "username", nullable = false)
    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

}