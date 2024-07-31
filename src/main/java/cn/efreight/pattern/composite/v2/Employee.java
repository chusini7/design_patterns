package cn.efreight.pattern.composite.v2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libiao
 */
@Getter
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subEmployee = new ArrayList<>();

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
    }

    public void add(Employee e) {
        subEmployee.add(e);
    }

    public void remove(Employee e) {
        subEmployee.remove(e);
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
    }
}