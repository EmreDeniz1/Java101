import java.util.Scanner;

public class recursive {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
       int n = input.nextInt();

       System.out.print(fibo(n));
    }

    static int fibo(int n){
        if (n == 1 || n == 2){
            return 2;
        }
            return fibo(n-1) + fibo(n-2);
    }
}

