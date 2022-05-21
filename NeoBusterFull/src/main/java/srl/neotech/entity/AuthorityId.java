package srl.neotech.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AuthorityId implements Serializable {
    private static final long serialVersionUID = -3512135229846917242L;
    private String username;

    private String authority;

    @Column(name = "username", nullable = false, length = 200)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "authority", nullable = false, length = 50)
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AuthorityId entity = (AuthorityId) o;
        return Objects.equals(this.authority, entity.authority) &&
                Objects.equals(this.username, entity.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authority, username);
    }

}