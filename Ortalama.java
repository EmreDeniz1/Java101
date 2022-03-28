import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args)       
    {
        int turk,mat,fizik,kimya,tar,muz;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Türkçe Notunuzu Giriniz = ");
         turk = input.nextInt();
        
        System.out.print("Matematik Notunuzu Giriniz = ");
         mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz = ");
         fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz = ");
         kimya = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz = ");
         tar = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz = ");
         muz = input.nextInt();

        double ort = (turk+mat+fizik+kimya+tar+mat) / 6.0 ;
        String sonuc = (ort >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı.";
        
        System.out.println("Ortalamanız = " + ort);
        System.out.print(sonuc);
        
    }
}
