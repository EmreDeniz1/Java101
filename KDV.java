import java.util.Scanner;

public class KDV {
    public static void main(String[] args)       
    {
        int tutar;
        Scanner input = new Scanner(System.in);
        
        System.out.print("İşlem Tutarınız = ");
         tutar = input.nextInt();

        double KDV = (tutar >= 1001) ? 0.08 : 0.18 ;

        double sonuc = tutar * KDV ;
        
        System.out.println("KDV = " + sonuc);
        
        
    }
}