package Boksör;

public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Kamil",20,100,90,0);
        Fighter f2 = new Fighter("Cemil",10,95,100,0);

        Ring r = new Ring(f1,f2,89,101);
        r.match();

    }

    }



