public class Animal {
    String family ;
    String name;
    int age;
    boolean isMammal;

    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString(){
        return "Name :" + this.name + " \nAge :" + this.age + " \nfamily :" + this.family + " \nisMammal :" + this.isMammal;
    }
}
