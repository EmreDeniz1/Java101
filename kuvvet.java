import java.util.Scanner;

public class kuvvet {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Üst sınır = ");
            int sin = input.nextInt();

            for ( int i = 1 ; i<= sin; i*=4) {
                System.out.print(i + ",");
            }System.out.println(" (4'ün Katları)  ");
    
    
            for ( int i = 1 ; i<= sin; i*=5){
                System.out.print(i + ",");
            }System.out.println(" (5 in Katları)  ");
    }
    
}
