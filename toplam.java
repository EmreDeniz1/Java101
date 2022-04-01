import java.util.Scanner;

public class toplam {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    int i,toplam = 0;

        do{
            System.out.print("Sayınızı giriniz = ");
                i = input.nextInt();

        } while( i % 2 == 0);

        for ( int j = 0; j <= i ; j++ ) {

            if ( j % 4 == 0) {
                toplam = toplam +j;

            }
        }
            System.out.print("Çift ve 4 e bölünebilen sayılar toplamı = " + toplam);
    }
    
}
