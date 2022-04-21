package Diziler;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Min_Max {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k = 0;
        int s = 0;
        double[] dizi = new double[5];
        double[] sira = new double[5];
        double[] sira2 = new double[5];

        System.out.print("Deðerinizi giriniz : ");
        double deger = input.nextInt();


        for(int i = 0; i < dizi.length; i++) {
            dizi[i] = Math.floor(Math.random()*100);
            System.out.print(dizi[i] + " ");
            sira[i] = dizi[i] - deger;
            if (sira[i] < 0){
            s++;} }
            double[] sira1 = new double[s]; // yeni dizi uzunluðu belirlenir
            System.out.println(" ");
            Arrays.sort(sira);


        for (int j = 0; j < sira.length; j++){
            if(sira[j] < 0){
                s++;
                sira1[j] = sira[j] * -1;
            } else if (sira[j] > 0) {
                sira2[k] = sira[j];
                k++;
            }
        }
        Arrays.sort(sira1);
        System.out.println(" ");
        System.out.println("Min : " + (deger - sira1[0]) + " Max : " + (sira2[0]+deger));
    }
}
