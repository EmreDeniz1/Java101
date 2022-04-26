package Diziler;

import java.util.Scanner;
import java.util.Arrays;

public class Transpoze {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Satýrlar : ");
        int b = s.nextInt();
        System.out.print("Sütünlar : ");
        int a = s.nextInt();
        int[][] pos = new int[a][b];
        int[][] mat = new int[b][a];


        for (int i = 0; i < mat.length; i++ ){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(i +". Satýr" +" " + j +". Sütün :");
                mat[i][j] = s.nextInt();
                pos[j][i] = mat[i][j];
            }
        }

        System.out.println("\n");
        for( int i = 0; i < mat.length; i++){
            for (int j = 0 ; j < mat[0].length; j++){
                System.out.print(mat[i][j]);
                System.out.print(" ");}
            System.out.println(" "); }

            System.out.println("\nTranspoze\n");

        for( int i = 0; i < pos.length; i++){
            for (int j = 0 ; j < pos[0].length; j++){
                System.out.print(pos[i][j]);
                System.out.print(" ");}
            System.out.println(" "); }
    }
}

