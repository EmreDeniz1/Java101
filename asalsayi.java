import java.util.Scanner;

public class asalsayi {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

            int s;

            s = input.nextInt();

            if (s == 2){
                System.out.print("2");
            } else if (s == 3){
                System.out.print("2 3");
            } else { System.out.print ("2 " + "3 ");

        for (int i = 2; i < s; i++){
            

            if ( i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0){

                System.out.print(i +" ");
            }

        }
       
    }
  }
} 

