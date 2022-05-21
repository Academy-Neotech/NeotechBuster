package srl.neotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "Production_CompanyEntity")
@Table(name = "production_company")
public class ProductionCompany implements Serializable {
    private static final long serialVersionUID = 9222017754251942820L;
    private Integer id;

    private String companyName;

    @Id
    @Column(name = "company_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "company_name", length = 200)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}