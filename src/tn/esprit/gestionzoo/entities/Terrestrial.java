package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Terrestrial extends Animal {
    protected int nbrLegs;
    public Terrestrial() {

    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

}
