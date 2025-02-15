package com.deva.employeemanager.employee.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long id;
    private String name;

    private String email;
    private String phone;
    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(updatable = false, nullable = false)
    private String EmployeeCode;

    public Employee(Long id, String name, String email, String phone, String imageUrl, String employeeCode) {
        this.id = id;
        this.name = name;

        this.email = email;
        this.phone = phone;
        this.imageUrl = imageUrl;
        EmployeeCode = employeeCode;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        EmployeeCode = employeeCode;
    }
}
