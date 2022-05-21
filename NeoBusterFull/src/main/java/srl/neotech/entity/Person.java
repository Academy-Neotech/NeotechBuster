package srl.neotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "PersonEntity")
@Table(name = "person")
public class Person implements Serializable {
    private static final long serialVersionUID = 4687458337145817502L;
    private Integer id;

    private String personName;

    @Id
    @Column(name = "person_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "person_name", nullable = false, length = 500)
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

}