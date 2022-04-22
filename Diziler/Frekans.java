package Diziler;

import java.util.Arrays;

public class Frekans {

    public static void main(String[] args) {

        int s = 0;
        int n = 0;
        int[] sayilar = {2,2,2,4, 6, 6, 8,8 ,7,5,5};
        Arrays.sort(sayilar);


        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar.length; j++){
                 if(sayilar[i] == sayilar[j]) {
                     s++;
                 }
           }
            System.out.println(sayilar[i] + " " + s +" kere tekrar edildi");
            i = i + s - 1;
            s = 0;
        }
    }
}
