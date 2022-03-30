import java.util.Scanner;

public class şifre {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String sifre,kulAdı;
        int secim;

        System.out.print("Kullanıcı Adınız = ");
            kulAdı = input.nextLine();
        System.out.print("Şifreniz = ");
            sifre = input.nextLine();

        if (kulAdı.equals("patika") && sifre.equals("java123"))
         { 
             System.out.print("Hoşgeldin");
         } else {
             System.out.println("Şifre yanlış");
             System.out.print("Şifrenizi sıfırlamak ister misiniz ?\nEvet için 1 tuşlayınız.\n");
             secim = input.nextInt();
             input.nextLine(); // int den sonra string okumak için.
                
                if (secim == 1 ) {
                    System.out.print("Yeni şifrenizi Giriniz = ");
                       String yeni = input.nextLine(); 
                            if(yeni.equals("java123")){
                                while(yeni.equals("java123")){
                                    System.out.print("Lütfen güncel şifre kullanınız\nŞifre = ");
                                    yeni = input.nextLine(); } 
                                    System.out.print("Değişim başarılı");
                                 }
                             else {
                                 System.out.print("Değişim başarılı");
                                }               
        }
    
    }
}
}