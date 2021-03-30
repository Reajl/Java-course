package com.company;

public class Employee implements Comparable<Employee> {
    String name;
    Integer Salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public Employee(String name, Integer salary) {
        this.name = name;
        Salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    @Override
    public int compareTo(Employee o) {

        if (Salary> o.Salary){
            return 1;
        }
        else if (Salary.equals((o.Salary)))
        {
            if (name.compareTo(o.name)>0){

                return 1;
            }
            else if(this.name.equals(o.name)) return 0;

            else {
                return -1;
            }

        }

        else return -1;
    }




}
