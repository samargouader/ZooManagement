public class Main {
    public static void main(String[] args) {
        Animal lion= new Animal("Carnivore", "Symba", 2, true);

        Zoo myZoo = new Zoo("Belvedere", "Tunis");



        myZoo.displayZoo();


        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion);
        System.out.println(myZoo);
        System.out.println("Index :" + myZoo.searchAnimal(lion));

    }
}
