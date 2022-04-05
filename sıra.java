import java.util.Scanner;

public class sıra {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String don;
        int buy = 0 , kuc = 0 , k = 0, i = 1;

        System.out.println("Seri bitince çıkmak için 'q' ya basınız");
        System.out.println("Bir sayı giriniz = ");
                don = input.next();
                

                while (!don.equals("q")) {
                
                k = Integer.parseInt(don);
                
                if (i == 1){
                    kuc = k ;
                    buy = k ;
                    i++;
                }
                
                if (k > buy){
                    buy = k;
                } else if (k < kuc)  {
                    kuc = k;
                }
                System.out.println("Bir sayı giriniz = ");
                don = input.next();

        } 
        System.out.print("Serinin en büyüğü = " +buy +"\n" +"serinin en küçüğü = " +kuc );  
    }
    
}
