package Diziler;

public class harmonik_Ortalama {

    static double Harmonik(int[] dizi){
        double sum = 0;
        for ( int i = 0; i < dizi.length; i++){
            sum = sum + (1.0 / dizi[i]);
        }
            return sum;
    }

    public static void main(String[] args) {

        int[] dizi = {1,2,3,4,5};
        System.out.print("Harmonik toplam = " + Harmonik(dizi));


  }
}