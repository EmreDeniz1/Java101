import java.util.Scanner;

public class faktöriyel {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int car = 1, pim = 1;

        System.out.print("N' i  giriniz = ");
           int n = input.nextInt();
        
        System.out.print("R' yi giriniz = ");
           int r = input.nextInt();

        for (int i = n; i > (n-r) ; i--){
            car = car*i;
        }   

        for (int j = r ; j > 1 ; j--){
            pim = pim *j;
        }

        System.out.print("kombinasyon = " + (car/pim));

    }
}
