package org.example.rpg;

public  abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, double damage, int hitPoints) {
        this.name = name;
        this.damage = damage;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public abstract double attack();
}
