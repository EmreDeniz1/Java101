import java.util.Scanner;

public class öneri {
    
    public static void main(String[] args) {
        
        int sıcaklık;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz : ");
        heat = input.nextInt();

        if (sıcaklık < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if(sıcaklık <= 25){ 
            if (sıcaklık <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (sıcaklık >= 10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}


