package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "LanguageEntity")
@Table(name = "language")
public class Language implements Serializable {
    private static final long serialVersionUID = -4865279539515557253L;
    private Integer id;

    private String languageCode;

    private String languageName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "language_code", length = 10)
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Column(name = "language_name", length = 500)
    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

}