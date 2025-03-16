package com.poc.liquibasedemo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee", schema = "ats")
public class Employee {
    @Id
    @Column(name = "empId")
    private int empId;

    @Column(name = "empName")
    private String name;

    @Column(name = "empCompany")
    private String company;

    @Column(name = "empEmail")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "emp", orphanRemoval = true)
    @JsonManagedReference
    private Sample sam;
}
