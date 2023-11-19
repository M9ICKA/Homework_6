package org.example.Creatures;

public class Beast implements Creature {
    protected String movement = "walks on legs/paws";
    protected String breath = " breathes oxygen which is part of the surrounding air";
    protected String beastName;

    String uniqueAbility;

    public Beast(String beastName, String uniqueAbility) {
        this.uniqueAbility = uniqueAbility;
        this.beastName = beastName;
    }

    @Override
    public String GetIformationAboutACreature() {
        String info = "You have chosen the " + beastName + ". " + beastName + breath + " and " + movement + ". " + uniqueAbility;
        return info;
    }
}
