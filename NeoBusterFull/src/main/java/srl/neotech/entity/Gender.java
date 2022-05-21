package srl.neotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "GenderEntity")
@Table(name = "gender")
public class Gender implements Serializable {
    private static final long serialVersionUID = 7868782929339624215L;
    private Integer id;

    private String gender;

    @Id
    @Column(name = "gender_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "gender", length = 20)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}