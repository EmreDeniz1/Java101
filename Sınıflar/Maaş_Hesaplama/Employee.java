package Maaþ_Hesaplayýcý;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void toString1(){
        System.out.println("Adý : " + this.name);
        System.out.println("Maaþý : " + this.salary);
        System.out.println("Çalýþma Saati : " + this.workHours);
        System.out.println("Baþlangýç Yýlý : " + this.hireYear);
    }
}
