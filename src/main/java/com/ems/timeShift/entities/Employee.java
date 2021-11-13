package com.ems.timeShift.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @OneToMany
    @JoinColumn(name="employee_id", referencedColumnName = "id")
    List<Shift> shifts;

    public Employee(){

    }

    public Employee(List<Shift> shifts) {
        this.shifts = shifts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
