import java.util.Scanner;

public class recursiveust {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int b = input.nextInt();
        System.out.print(us(n , b));
    }

    static int us(int n, int b){

        if (n == 0){
            return 1;
        }

        return b * us(n - 1, b);
        
        
    }
}
