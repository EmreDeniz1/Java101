package Maa�_Hesaplay�c�;

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
        System.out.println("Ad� : " + this.name);
        System.out.println("Maa�� : " + this.salary);
        System.out.println("�al��ma Saati : " + this.workHours);
        System.out.println("Ba�lang�� Y�l� : " + this.hireYear);
    }
}
