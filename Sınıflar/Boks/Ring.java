package Boksör;

public class Ring {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public boolean checkWeight() {
        return (f1.weight >= this.minWeight && f1.weight <= this.maxWeight ) && (f2.weight >= this.minWeight && f2.weight <= this.maxWeight);
    }

    public boolean isWin(){
        if (f1.health == 0) {
            System.out.println("Kazanan > " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Kazanan > " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------");
        System.out.println(f1.name + " Kalan caný = " + Math.round(f1.health));
        System.out.println(f2.name + " Kalan caný = " + Math.round(f2.health));
    }

    public void match() {
        if (checkWeight()) {
            System.out.println(" ===== BAÞLA ====");
            if(f2.chance()){
                f2.health = f1.hit(f2);
                System.out.println("ilk " + f1.name + " baþlýyor");
                 } else {
                f1.health = f2.hit(f1);
                System.out.println("ilk " + f2.name + " baþlýyor");
                } printScore();
            while (f1.health > 0 && f2.health > 0){
            f2.health = f1.hit(f2);
            if (isWin()){
                break; }
            f1.health = f2.hit(f1);
            if(isWin()){
                break; }}
            printScore();
        } else {
            System.out.print("Sporcu aðýrlýklarý uyuþmuyor");
              }
    }
}

