import java.util.Scanner;

public class KitleEndeksi {
    public static void main(String[] args)       
    {
        double boy, kilo, endeks;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Boyunuz (cm) = ");
         boy = input.nextDouble();

        System.out.print("Kilonuz (kg) = ");
         kilo = input.nextDouble();
         
         endeks = kilo / (boy * boy);
        System.out.println("Endeksiniz = " + endeks);
        
    }
}
