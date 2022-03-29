import java.util.Scanner;

public class Dilim {
    public static void main(String[] args)       
    {
        double r, aci, pi = 3.14, alan;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yarı Çap = ");
         r = input.nextInt();

        System.out.println("Dilim Açısı = ");
         aci = input.nextInt();
         
         alan = (pi*r*r)*(aci / 360);
        System.out.println("Alan = " + alan);
        
    }
}
