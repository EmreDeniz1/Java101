import java.util.Scanner;

public class mükemmelsayı {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int toplam = 0;

        System.out.print("Sayınız = ");
            int sayi = input.nextInt();

        for ( int i = 1; i < sayi; i++){

            if (sayi % i == 0){
                toplam += i;
            }

        }

        if (toplam == sayi){
            System.out.print(sayi +" bir mükemmel sayıdır.");
        } else {
            System.out.print(sayi +" bir mükemmel sayı değildir.");
        }
    }
}
