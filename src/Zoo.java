public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages=25;
    int animalCount;

    Zoo(String name, String city) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.animalCount=0;
    }

    boolean addAnimal(Animal animal) {
        if(this.animalCount<25){
            if(searchAnimal(animal)==-1){
                this.animals[this.animalCount]=animal;
                this.animalCount++;
                return true;
            }
        }
        return false;
    }

    void displayZoo(){
        System.out.println("Name: " + this.name+"\nNbre cage :" + this.nbrCages + "\nCity: " + this.city);
    }
    int searchAnimal(Animal animal) {
        for(int i=0;i<this.animalCount;i++) {
            if(this.animals[i].name==animal.name) {
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
            this.animalCount--;
            return true;
        }
        return false;
    }

    boolean isFull(){
        return this.nbrCages==this.animalCount;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if(z1.animalCount==z2.animalCount) {
            return z1;
        }
        return z2;
    }

    @Override
    public String toString(){
        String str = "\n Animals:\n";
        for (int i=0; i<this.animalCount; i++){
            str += this.animals[i].toString();
        }
        return "Name: " + this.name+"\nNbre cage :" + this.nbrCages + "\nCity: " + this.city + "\n" + str;
    }
}
