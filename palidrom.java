import java.util.Scanner;
public class palidrom { 
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        int a = 0, ilk,f,ters = 0, b = 0;
        
        int n = input.nextInt();
        int say = n;
        int deneme = n;
        int yaz = n;
        while (n != 0){
            n = n / 10;
            a++;
         }
        while ( deneme != 0){
            f = deneme % 10;
            if (a/2 > b){
                ters = ters * 10 + f;
            }
            deneme = deneme /10;
            b++;
        }
       
        if (a % 2 == 0){
            a = a / 2;
        }else {
            a = (a / 2) + 1;
        }
        ilk = say / (int) Math.pow(10 , a);  


        if (ilk == ters){
            System.out.print(yaz + " palidrom sayıdır.");
        }else {
            System.out.print(yaz + " palidrom sayı değildir.");
        }
    }
        
   

}
