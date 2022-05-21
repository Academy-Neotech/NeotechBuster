package srl.neotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "Language_RoleEntity")
@Table(name = "language_role")
public class LanguageRole implements Serializable {
    private static final long serialVersionUID = -7770263213373857404L;
    private Integer id;

    private String languageRole;

    @Id
    @Column(name = "role_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "language_role", length = 20)
    public String getLanguageRole() {
        return languageRole;
    }

    public void setLanguageRole(String languageRole) {
        this.languageRole = languageRole;
    }

}