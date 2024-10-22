package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.*;

public class Animal {
    private String family ;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {

    }


    public int getAge(){
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public Animal(String family, String name, int age, boolean isMammal) throws InvalidAgeException {
        this.family = family;
        this.name = name;
        this.isMammal = isMammal;

        if (age < 0) {
            throw new InvalidAgeException("age ne peut pas être négatif : " + age);
        }
        this.age = age;
    }

    public String toString(){
        return "Name :" + this.name + " \nAge :" + this.age + " \nfamily :" + this.family + " \nisMammal :" + this.isMammal;
    }
}

