package com.example.jpa2Assignment.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="employeeTable")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="empId")
    private int id;
    @Column(name="empFirstName")
    private String firstName;
    @Column(name="empLastName")
    private String lastName;

    @Column(name="empSalary")
    private int salary;

    @Column(name="empAge")
    private int age;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int salary, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.example.jpa2Assignment.Employees.Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
