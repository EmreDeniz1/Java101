import java.util.Scanner;

public class sıralama {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayınız = ");
        double sayi1 = input.nextDouble();

        System.out.print("2. Sayınız = ");
        double sayi2 = input.nextDouble();

        System.out.print("3. Sayınız = ");
        double sayi3 = input.nextDouble();

        if ((sayi1 > sayi2) && (sayi1 > sayi3)){
            if (sayi2 > sayi3)
                System.out.println("1.sayı > 2.sayı > 3.sayı");
            else if (sayi3 > sayi2)
                System.out.println("1.sayı > 3.sayı > 2.sayı");
            else
                System.out.println("1.sayı > 2.sayı = 3.sayı");
        }
        else if((sayi2 > sayi1) && (sayi2 > sayi3)){
            if (sayi1 > sayi3)
                System.out.println("2.sayı > 1.sayı > 3.sayı");
            else if (sayi3 > sayi1)
                System.out.println("2.sayı > 3.sayı > 1.sayı");
            else
                System.out.println("2.sayı > 1.sayı = 3.sayı");
        }
        else if((sayi3 > sayi1) && (sayi3 > sayi2)){
            if (sayi1 > sayi2)
                System.out.println("3.sayı > 1.sayı > 2.sayı");
            else if (sayi2 > sayi1)
                System.out.println("3.sayı > 2.sayı > 1.sayı");
            else
                System.out.println("3.sayı > 1.sayı = 2.sayı");
        }
        else
            System.out.println("1.sayı = 2.sayı = 3.sayıı");
    }
}
        
    

