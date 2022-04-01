import java.util.Scanner;

public class zodyak {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        String hayvan = "";

        System.out.print("Doğum yılınızı giriniz = ");
            int yıl = input.nextInt();

        int mod = yıl % 12;

        switch(mod)
        {   

            case 0:
                hayvan = "maymun"; break;
            case 1:
                hayvan = "Horoz"; break;
            case 2:
                hayvan = "Köpek"; break;
            case 3:
                hayvan = "Domuz"; break;

                /*
                 .
                 .
                 .
                 .
                 .
                 */
        }

        System.out.print("Çin Zodyapınız = " + hayvan);
        
    }
    
}
