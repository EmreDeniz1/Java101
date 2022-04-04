import java.util.Scanner;

public class basamaktoplam {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

            int basamak = 0, toplam = 0;

        System.out.print("Sayınız = ");
            int sayi = input.nextInt();
            int deger = sayi ;

            while ( sayi != 0){

                deger = sayi % 10;
                sayi = sayi / 10;
                toplam = toplam + deger; }
               
                System.out.print("toplam = " +toplam);     
    }
    
}
