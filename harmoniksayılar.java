import java.util.Scanner;

public class harmoniksayılar {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz = ");
           int n = input.nextInt();

           double toplam = 0;

           for (int i = 1; i <= n; i++){

                toplam = (1.0 / i) + toplam; 
                System.out.print("1/" + i);
                System.out.print(" + ");
           }

            System.out.print(" = " + toplam);
    }
    
}
