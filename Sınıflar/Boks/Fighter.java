package Boksör;

public class Fighter {

    String name;
    int maxDamage;
    double health;
    int weight;
    double dodge;
    double chance;



    public Fighter(String name, int damage, double health, int weight, double dodge){
        this.name = name;
        this.maxDamage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.chance = 0;
    }

    public double hit(Fighter dusman) {
        System.out.println("==========");
        double hasar = Math.round(Math.random()*this.maxDamage);
        System.out.println(this.name + " -> " + dusman.name + " " + hasar + " hasar vurdu");

        if (dusman.dodge()) {
            System.out.print(dusman.name + "Hasar almaktan kaçındı.");
            return dusman.health;
        }
        if (dusman.health - hasar < 0) {
            return 0;
        }
        return dusman.health - hasar;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }

    public boolean chance() {
        double random = Math.round(Math.random() * 100);
        return random > 50;

    }
}
