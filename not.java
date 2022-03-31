import java.util.Scanner;

public class not {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int mat,fizik,turkce,kimya,muzik,ortalama = 0 ,toplam = 0;

        System.out.print("Matematik Notunuz = ");
        mat = input.nextInt();
            if( mat > 0 && mat < 100) {
                ortalama += mat;
                toplam++;
            } 
        
            System.out.print("Türkçe Notunuz = ");
        turkce = input.nextInt();
            if( turkce > 0 && turkce < 100) {
                ortalama += turkce;
                toplam++;
            } 

            System.out.print("Kimya Notunuz = ");
            kimya = input.nextInt();
                if( kimya > 0 && kimya < 100) {
                    ortalama += kimya;
                    toplam++;
                }

            // devamı da diğer dersler için devam edecek.

            System.out.print("Ortalamanız = " + (ortalama / toplam));

    }
    
}
