package com.company.ComporatorTest;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Employee emp1 = new Employee(200, "Ivan", "Petrov", 15000);
        Employee emp2 = new Employee(100, "Sergey", "Ivanov", 45000);
        Employee emp3 = new Employee(30, "Ivan", "Abramova", 30000);
        List<Employee> listEmp = new ArrayList<Employee>();
        listEmp.add(emp1);
        listEmp.add(emp2);
        listEmp.add(emp3);
        System.out.println("До сортировки " + listEmp);
        Collections.sort(listEmp, new NameComparator());
     //   Collections.sort(listEmp);
        System.out.println("После сортировки " + listEmp);
    }

}

class Employee
                implements Comparable<Employee>
{

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
     //   return this.name.compareTo(o.name);
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.name.compareTo(o2.name) == 0)
            return o1.surname.compareTo(o2.surname);
        else
        return o1.name.compareTo(o2.name);
    }
}
