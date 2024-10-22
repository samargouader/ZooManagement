package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family ;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {

    }

    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }
    }

    public String getName() {
        return this.name;
    }

    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if (age>0)
            setAge(age);
        else
            this.age = 0;
        this.isMammal = isMammal;
    }

    public String toString(){
        return "Name :" + this.name + " \nAge :" + this.age + " \nfamily :" + this.family + " \nisMammal :" + this.isMammal;
    }
}

