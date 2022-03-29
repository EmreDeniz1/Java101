import java.util.Scanner;

public class maNav {

    public static void main(String[] args) 
    {
    
    Scanner input = new Scanner(System.in);
        
    double armut = 2.14 , elma = 3.67 , domates = 1.11, muz = 0.95, patlican = 5, toplam ;
    double armutkilo, elmakilo, domateskilo, muzkilo, patlicankilo;

    System.out.print("Armut kac kilo?:");
        armutkilo=input.nextDouble();
        System.out.print("Elma kac kilo?:");
        elmakilo=input.nextDouble();
        System.out.print("Domates kac kilo?:");
        domateskilo=input.nextDouble();
        System.out.print("Muz kac kilo?:");
        muzkilo=input.nextDouble();
        System.out.print("Patlican kac kilo?:");
        patlicankilo=input.nextDouble();
        

        toplam=(elma*elmakilo)+(armut*armutkilo)+(domates*domateskilo)+(muz*muzkilo)+(patlican*patlicankilo);
        System.out.print("Toplam Tutar: "+toplam);


    }
    
}
