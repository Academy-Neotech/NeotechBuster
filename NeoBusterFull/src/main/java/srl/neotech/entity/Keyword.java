package srl.neotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "KeywordEntity")
@Table(name = "keyword")
public class Keyword implements Serializable {
    private static final long serialVersionUID = -5077459201052123081L;
    private Integer id;

    private String keywordName;

    @Id
    @Column(name = "keyword_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "keyword_name", length = 100)
    public String getKeywordName() {
        return keywordName;
    }

    public void setKeywordName(String keywordName) {
        this.keywordName = keywordName;
    }

}