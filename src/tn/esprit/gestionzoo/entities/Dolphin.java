package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin() {
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSwimming speed: " + this.swimmingSpeed;
    }

    @Override
    public void swim(){
        System.out.println("This Dolphin is swimming");
    }
}
