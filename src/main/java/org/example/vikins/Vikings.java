package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    public String name;
    public String msg;

    public Vikings(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
        this.msg = "msg";
    }

    public int attack() {
        return getStrength();
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);

        if (health > 0) {
            this.msg = this.name + "has received" + damage + "points of damage";
        } else {
            msg = this.name + "has died in combat";
        }
    }

    public String getMsg(){
        return this.msg;
    }

    public String battleCry(){
        return "Odin Owns You All!";
    }
}