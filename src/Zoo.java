import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.ZooFullException;


public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages=3;
    private int animalCount;
    private Aquatic[] aquaticAnimals;
    private final int nbrAquatic=10;
    private int aquaticAnimalCount;

    Zoo(String name, String city) {
        this.animals = new Animal[25];
        this.aquaticAnimals = new Aquatic[this.nbrAquatic];
        if (name!=null && !name.isEmpty())
            this.name = name;
        else {
            this.name = "Zoo";
            this.city = city;
            this.animalCount=0;
            this.aquaticAnimalCount=0;
            }
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (isZooFull()) {
            throw new ZooFullException("Zoo full");
        }

        if (searchAnimal(animal) == -1) {
            this.animals[this.animalCount] = animal;
            this.animalCount++;
        }
    }




    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for(int i=0; i<this.aquaticAnimalCount; i++){
            if(this.aquaticAnimals[i] instanceof Penguin){
                Penguin p1 = (Penguin) this.aquaticAnimals[i];
                Penguin p2 = (Penguin) this.aquaticAnimals[i+1];
                if(p1.swimmingDepth>p2.swimmingDepth){
                    maxDepth = p1.swimmingDepth;
                }
                else{
                    maxDepth = p2.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if(this.aquaticAnimalCount<this.aquaticAnimals.length) {
            this.aquaticAnimals[this.aquaticAnimalCount]=aquatic;
            this.aquaticAnimalCount++;
        }
        else {
            System.out.println("Zoo is full!");
        }
    }

    public void setName(String name){
        if (name!=null && !name.isEmpty())
            this.name=name;
    }

    void displayZoo(){
        System.out.println("Name: " + this.name+"\nNbre cage :" + this.nbrCages + "\nCity: " + this.city);
    }

    int searchAnimal(Animal animal) {
        for(int i=0;i<this.animalCount;i++) {
            if(this.animals[i].getName()==animal.getName()) {
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal) {
        int index = this.searchAnimal(animal);
        if(index>-1) {
            for(int i=index;i<this.animalCount;i++) {
                this.animals[i]=this.animals[i+1];
            }
            this.animals[this.animalCount-1]=null;
            this.animalCount--;
            return true;
        }
        return false;
    }

    public void showSwim() {
        for (int i=0;i<this.aquaticAnimalCount;i++) {
            this.aquaticAnimals[i].swim();
        }
    }

    boolean isZooFull(){
        return this.nbrCages==this.animalCount;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if(z1.animalCount==z2.animalCount) {
            return z1;
        }
        return z2;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Name: " + this.name + "\nNbr cage: " + this.nbrCages + "\nCity: " + this.city + "\nAnimals: ");
        for (int i = 0; i < this.animalCount; i++) {
            str.append("\n").append(this.animals[i].toString());
        }
        return str.toString();
    }

    public void displayNumberOfAquaticsByType(){
        int dolphin=0;
        int penguin=0;
        for (int i = 0; i < this.aquaticAnimalCount; i++) {
            if (this.aquaticAnimals[i] instanceof Dolphin){
                dolphin++;
            }
            if (this.aquaticAnimals[i] instanceof Penguin){
                penguin++;
            }
        }
        System.out.println();
    }

}
