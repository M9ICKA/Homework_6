package org.example.Creatures;

public class Bird implements Creature {
    protected String movement = "flies on wings and walks on legs";
    protected String breath = " breathes oxygen which is part of the surrounding air";
    protected String birdName;

    String uniqueAbility;

    public Bird(String birdName, String uniqueAbility) {
        this.uniqueAbility = uniqueAbility;
        this.birdName = birdName;
    }

    ;

    @Override
    public String GetIformationAboutACreature() {
        String info = "You have chosen the " + birdName + ". " + birdName + breath + " and " + movement + ". " + uniqueAbility;
        return info;
    }
}

