package com.pyramid;

import java.util.Random;

public class Humans implements Players {

    private int health;
    private String name;
    private final String symbol = "\uD83D\uDC68";
    Random random = new Random();

    public Humans(String name) {
        this.health = random.nextInt(100)+1;;
        this.name = name;
    }

    public boolean isAlive() {
        if (this.health > 0)
            return true;
        else
            return false;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damage){
        this.health = this.health - damage;
    }

    public void attack(Goblins goblin){
        if (goblin.getHealth() > this.getHealth())
            takeDamage(this.getHealth()-goblin.getHealth());
        else if (goblin.getHealth() <= this.getHealth())
            goblin.takeDamage(goblin.getHealth()-this.getHealth());

    }

    @Override
    public String toString() {
        return " "+symbol+ " ";
    }
}
