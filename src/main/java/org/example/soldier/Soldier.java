package org.example.soldier;

public class Soldier {
    public int strength;
    public int health;

    public Soldier(int health, int strength){
        this.strength = strength;
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public int getStrength(){
        return this.strength;
    }

        public int attack(){
            return this.strength;
        }

        public void receiveDamage(int damage){
            this.health -= damage;
        }
}