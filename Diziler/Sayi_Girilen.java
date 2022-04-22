package Diziler;

import java.util.Scanner;
import java.util.Arrays;

public class Sayi_Girilen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Büyüklüğü : ");
        int n = input.nextInt();
        int[] matrix = new int[n];

        for(int i = 0; i < matrix.length; i++){
            System.out.print((i + 1) + ". Sayıyı Giriniz : ");
            matrix[i] = input.nextInt();
        }
        Arrays.sort(matrix);
        System.out.println("Sıralama = " + Arrays.toString(matrix));
    }

}

