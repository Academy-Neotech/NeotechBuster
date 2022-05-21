package srl.neotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "GenreEntity")
@Table(name = "genre")
public class Genre implements Serializable {
    private static final long serialVersionUID = 5268829837982542177L;
    private Integer id;

    private String genreName;

    @Id
    @Column(name = "genre_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "genre_name", length = 100)
    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

}