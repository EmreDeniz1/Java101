import java.util.Scanner;

public class ebob {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        int ebob = 1, ekok = 1;
        
        System.out.print("n1 sayısını giriniz = ");
        int n1 = input.nextInt();
        int k = n1;
        
        System.out.print("n2 sayısını giriniz = ");
        int n2 = input.nextInt();

        while (k > 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                ekok = (n1 * n2) / ebob;
                break;
            }
            k--;


        }
        System.out.println(" Ebob : " + ebob + " Ekok : " + ekok);


    }
}
