package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Penguin extends Aquatic {
    public float swimmingDepth;

    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSwimming Depth: " + swimmingDepth + " m";
    }

    @Override
    public void swim(){
        System.out.println("This Penguin is swimming");
    }
}
