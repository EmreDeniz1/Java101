import java.util.Scanner;

public class cift {
     
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

       int toplam = 0 , sayac = 0 ;
       double ort;

        System.out.print("Üst limiti giriniz = ");
            int ust = input.nextInt();

        for ( int i = 1; i <= ust ; i++){

                if( i % 3 == 0 && i % 4 == 0){
                    toplam = toplam + i ;
                    sayac++;
                } 
        }
            ort = toplam / sayac ;
            System.out.print("Ortalama = " +ort);
    }
    
}
