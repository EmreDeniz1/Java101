package Diziler;

import java.util.Arrays;

public class Tekrarlayan_Sayýlar {

    public static void main(String[] args) {

        int s;
        int[] sayilar = {2,2,4,6,8,6,10,10,4,5,7,11,13,13,14,14};
        Arrays.sort(sayilar);


        for(int i = 0; i < sayilar.length; i++){
             if(sayilar[i] % 2 == 0) {
                 s = sayilar[i];
                 if(sayilar[i + 1] == s){
                         System.out.println("Tekrar " + s);
                 }
             }
        }
    }
}

