package Maaþ_Hesaplayýcý;

public class Muhasebe {

    Employee e1;
    int year;
    double tax;
    int overTime;
    double raise;

    public Muhasebe(int year, Employee e1){
        this.year = year;
        this.e1 = e1;
        this.tax = 0;
        this.overTime = 0;
        this.raise = 0;
    }

    public double tax(Employee salary){
        if( salary.salary >= 1000){
            this.tax = salary.salary * 0.03;
            System.out.println("Vergi : " + this.tax);
            return this.tax;
        } else {
            return 0;
        }
    }

    public int bonus(Employee workHours){
        if(workHours.workHours >= 40){
            this.overTime = (workHours.workHours-40)*30;
            System.out.println("Bonus : " + this.overTime);
            return this.overTime;
        } else return 0;
    }

    public double raiseSalary(Employee hireYear){
        if((this.year - hireYear.hireYear) <=10){
            this.raise = hireYear.salary * 0.05;
            System.out.println("Maaþ artýþý : " + this.raise);
            return this.raise;
        } else if ((this.year - hireYear.hireYear) >= 9 && (this.year - hireYear.hireYear) <=20){
            this.raise =hireYear.salary * 0.1;
            System.out.println("Maaþ artýþý : " + this.raise);
            return this.raise;
        } else {
            this.raise = hireYear.salary * 0.15;
            System.out.println("Maaþ artýþý : " + this.raise);
            return this.raise;
        }
    }

    public void total(){
        e1.toString1();
       System.out.println("Vergi ve bonuslar ile birlikte maaþ : " + (e1.salary + bonus(e1) - tax(e1)));
       System.out.println("Toplam maaþ : " + (e1.salary + bonus(e1) - tax(e1) + raiseSalary(e1)));
    }





}
