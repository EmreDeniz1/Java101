import java.util.Scanner;       

public class artık {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Yılı giriniz = ");
        int yil = input.nextInt();

        if ( yil % 100 == 0)
        {
            if ( yil % 400 == 0) {
                System.out.print( yil + " Artık yıldır");
            } else {
                System.out.print( yil + " Artık yıl değildir"); 
            }
        }
        
        if ( yil % 100 !=0 && yil % 4 == 0){
            System.out.print( yil + " Artık yıldır");
        }
            else if ( yil % 4 !=0) {
                System.out.print( yil + " Artık yıl değildir");
            }
    
}
}
