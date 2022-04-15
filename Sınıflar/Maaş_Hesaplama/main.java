package Maaþ_Hesaplayýcý;

public class main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Kemal",2000,45,1985);
        Muhasebe m = new Muhasebe(2021,e1);

        m.total();

    }
}
