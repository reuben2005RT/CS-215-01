package project;

public class Weapon {

    public String name;
    public String type;
    public int price;
    public double fireRate;
    public double damage;   // using HDMG_0 as the main damage stat

    public Weapon(String name, String type, int price, double fireRate, double damage) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.fireRate = fireRate;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name + " | " + type + " | Price: " + price +
               " | Fire Rate: " + fireRate + " | Damage: " + damage;
    }
}
