import java.util.Scanner;

public class ebob {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz = ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz = ");
        int n2 = input.nextInt();

        int ebob = 1;
        int ekok = 1;

        for( int i = 1; i < n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                ekok = (n1 * n2) / ebob;
            }


        }
        System.out.println(" Ebob : " + ebob + " Ekok : " + ekok);


    }
}
