package org.example.Creatures;

public class Fish implements Creature {
    protected String movement = "floats in the water.";
    protected String breath = " breathes oxygen dissolved in water using gills";
    protected String fishName;

    String uniqueAbility;

    public Fish(String fishName, String uniqueAbility) {
        this.uniqueAbility = uniqueAbility;
        this.fishName = fishName;
    }

    @Override
    public String GetIformationAboutACreature() {
        String info = "You have chosen the " + fishName + ". " + fishName + breath + " and " + movement + ". " + uniqueAbility;
        return info;
    }
}

