package Diziler;

import java.awt.desktop.SystemSleepEvent;

public class B {

    public static void main(String[] args) {

        String[][] b = new String[6][4];

        for(int i = 0; i <= b.length; i++){
            if(i % 3 == 0){
                System.out.println("* * * * * *");
            } else {
            System.out.println("*          *");}
        }
    }
}
