import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args)       
    {
        double kN1,kN2,kN3,alan,cevre;
        Scanner input = new Scanner(System.in);
        
        System.out.print("1.Kenar = ");
         kN1 = input.nextInt();

        System.out.print("2.Kenar = ");
         kN2 = input.nextInt();

        System.out.print("3.Kenar = ");
         kN3 = input.nextInt();
        

        String hata1 = (kN3 < 1) ? "Negatif Sayı" : " " ;
        System.out.println (hata1);

        String hata2 = (kN2 < 1) ? "Negatif Sayı" : " " ;
        System.out.println (hata2);

        String hata3 = (kN1 < 1) ? "Negatif Sayı" : " " ;
        System.out.println (hata3);
    

        cevre = (kN1+kN2+kN3) / 2 ;
        alan = Math.sqrt( cevre * (cevre - kN1)* (cevre - kN2) * (cevre - kN3)) ;
        
        System.out.println("Alan = " + alan);
    }
}