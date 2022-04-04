import java.util.Scanner;

public class üslü {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

            int hesap = 1;

            System.out.print("Temel Sayınız = ");
                int b = input.nextInt();
            
            System.out.print("Üssünüz = ");
                int u = input.nextInt();

            for (int i = 0; i < u; i++){
                hesap=hesap*b;
            }

            System.out.print(b +"^" +u +" = " +hesap);
    }
    
}
