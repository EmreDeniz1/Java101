import java.util.Scanner;

public class elmas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

         System.out.print("elmas kaç katlı olsun (tek sayılar) = ");
            int n = input.nextInt();

        for (int i = 0; i < n; i++){
               for (int j = (n - 2); j >= i; j--){
                      System.out.print(" ");         
                    }
                    for (int k = 1; k <= (2*i + 1); k++){
                        System.out.print("*");    
                    } 
            System.out.print("\n"); 
                 
            }  
        
            for (int i = 0; i < n; i++){
                 for (int j = 0; j <= i; j++){
                       System.out.print(" ");         
                     }
                     for (int k = (n - 1); k > (2*i - 1); k--){
                         System.out.print("*");    
                     } 
             System.out.print("\n"); 
                  
             }
                
    }
}
