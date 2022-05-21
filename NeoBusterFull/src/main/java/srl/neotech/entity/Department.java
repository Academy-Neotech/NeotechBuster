package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "DepartmentEntity")
@Table(name = "department")
public class Department implements Serializable {
    private static final long serialVersionUID = 2035250689667308917L;
    private Integer id;

    private String departmentName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "department_name", length = 200)
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}