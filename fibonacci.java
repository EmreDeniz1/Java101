import java.util.Scanner;

public class fibonacci {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int toplam = 0, i = 1, j = 0, toplam1 = 0;

        System.out.print("n = ");
         int n = input.nextInt();

         while (0 < n){

            toplam = i + j;
            System.out.print(toplam + " ");
            toplam1 = toplam + i;
            System.out.print(toplam1 + " ");
            j = toplam1 + toplam;
            System.out.print(j + " ");
            i = j + toplam1;
            System.out.print(i + " ");
            n--;
        }

    }

}