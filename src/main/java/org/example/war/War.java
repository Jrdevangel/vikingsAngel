package org.example.war;

import org.example.saxon.Saxon;
import org.example.vikins.Vikings;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class War {

    private final List<Vikings> vikingArmy;
    private final List<Saxon> saxonArmy;
    private final Random random = new Random();

    public War() {
        this.vikingArmy = new ArrayList<>();
        this.saxonArmy = new ArrayList<>();
    }

    public void addViking(Vikings viking) {
        this.vikingArmy.add(viking);
    }

    public void addSaxon(Saxon saxon) {
        this.saxonArmy.add(saxon);
    }

    public int vikingAttack() {
        if (vikingArmy.isEmpty() || saxonArmy.isEmpty()) {
            return 0;
        }
        Vikings randomViking = vikingArmy.get(random.nextInt(vikingArmy.size()));
        Saxon randomSaxon = saxonArmy.get(random.nextInt(saxonArmy.size()));

        int damageViking = randomViking.attack();
        randomSaxon.receiveDamage(damageViking);
        System.out.println(randomSaxon.getMsg());
        if (randomSaxon.health <= 0) {
            saxonArmy.remove(randomSaxon);
        }
        System.out.println("Saxon has a health of " + randomSaxon.health);
        return randomSaxon.health;
    }

    public int saxonAttack() {
        if (vikingArmy.isEmpty() || saxonArmy.isEmpty()) {
            return 0;
        }
        Vikings randomViking = vikingArmy.get(random.nextInt(vikingArmy.size()));
        Saxon randomSaxon = saxonArmy.get(random.nextInt(saxonArmy.size()));

        int damageSaxon = randomSaxon.attack();
        randomViking.receiveDamage(damageSaxon);
        System.out.println(randomViking.msg);
        if (randomViking.health <= 0) {
            vikingArmy.remove(randomViking);
        }
        System.out.println(randomViking.name + " has health of " + randomViking.health);
        return randomViking.health;
    }

    public String showStatus() {
        if (saxonArmy.isEmpty()) {
            return "Vikings have won the war of the century!";
        }
        if (vikingArmy.isEmpty()) {
            return "Saxons have fought for their lives and survive another day...";
        }
        return "Vikings and Saxons are still in the thick of battle.";
    }
}
