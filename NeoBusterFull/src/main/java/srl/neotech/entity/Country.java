package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "CountryEntity")
@Table(name = "country")
public class Country implements Serializable {
    private static final long serialVersionUID = -5178430828292014742L;
    private Integer id;

    private String countryIsoCode;

    private String countryName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "country_iso_code", length = 10)
    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }

    @Column(name = "country_name", length = 200)
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}