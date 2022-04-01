import java.util.Scanner;

public class uçak {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);

        double toplam, mesafe = 0;

        while ( mesafe < 1) {
            System.out.print("Mesafenizi giriniz = ");
             mesafe = input.nextDouble ();
                if (mesafe < 1){
                    System.out.print("Mesafeyi Doğru Giriniz.\n");
                }
                mesafe = mesafe * 0.10;
        }
        

        System.out.print("Yaşınız = ");
            int yas = input.nextInt();
        
        System.out.print("Yolculuk Tipiniz (1= Tek Yön, 2 = Gidiş Dönş)");
            int tip = input.nextInt();

        if ( yas < 12){
            toplam = mesafe*0.5;
        }
            else if (yas >= 12 && yas <= 24){
                toplam = mesafe * 0.9;
            }
                else if ( yas >= 65){
                    toplam = mesafe * 0.7;
                }
                    else {
                        toplam = mesafe;
                    }
        
        switch (tip)
        {
            case 1:
                toplam = mesafe;
                    break;
            
            case 2:
                toplam = (toplam*0.8)*2;
                    break;

        }

        System.out.print("Toplam = " + toplam);


        

    }
}
