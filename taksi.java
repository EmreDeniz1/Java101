import java.util.Scanner;

public class taksi {
    public static void main(String[] args)       
    {
        double mesafe;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yolculuk Mesafesi = ");
         mesafe = input.nextInt();
         
         mesafe = mesafe *2.20;
         double sonuc = 10 + mesafe;

        double tutar = (sonuc <= 20) ? 20 : sonuc ;
        System.out.println("Tutar = " +tutar);
        
    }
}
