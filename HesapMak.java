import java.util.Scanner;

import javax.swing.plaf.synth.SynthDesktopIconUI;


public class HesapMak {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        double say1,say2,sonuc;

        System.out.print("1. Sayı = ");
            say1 = input.nextDouble(); 
        
        System.out.print("2. Sayı = ");
            say2 = input.nextDouble();
        
        System.out.println("************************************");
        
        System.out.print("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\nYapılacak işlemi seçiniz = ");
        int secim = input.nextInt();
            if (secim > 4)
                {
                   System.out.print("Lütfen 1 ile 4 arasında seçim yapınız");
                }

        switch(secim)
        {
            case 1:
               System.out.print("Toplam = " + (say1+say2));
               break;
            case 2:
                System.out.print("Sonuç = " + (say1-say2));
                break;
            case 3:
                System.out.print("Çarpım = " + (say1*say2));
                    break;
            case 4:
                if (say2 == 0){
                    System.out.print("Sıfır ile Bölünmez");
                } else {
                    System.out.print("Sonuç = " + (say1/say2));
                }
                    break;

        }
    


    }

    
}
