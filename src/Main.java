import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;

/*public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo", "Tunis");
        int nbr_animal= 0;

        try {
            Animal lion = new Animal("Feline", "Lion", 5, true);
            Animal tiger = new Animal("Feline", "Tiger", 3, true);
            Animal elephant = new Animal("Elephant", "Elephant", 10, true);
            Animal giraffe = new Animal("Giraffe", "Giraffe", 7, true);

            zoo.addAnimal(lion);
            nbr_animal++;
            System.out.println("Animal ajouté. Nombre d'animaux: " + nbr_animal);

            zoo.addAnimal(tiger);
            nbr_animal++;
            System.out.println("Animal ajouté. Nombre d'animaux: " + nbr_animal);

            zoo.addAnimal(elephant);
            nbr_animal++;
            System.out.println("Animal ajouté. Nombre d'animaux: " + nbr_animal);

            zoo.addAnimal(giraffe);
            nbr_animal++;
            System.out.println("Animal ajouté. Nombre d'animaux: " + nbr_animal);

        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }
    }
}*/



public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo", "Tunis");
        int nbr_animal = 0;

        try {
            try {
                Animal lion = new Animal("Feline", "Lion", 5, true);
                zoo.addAnimal(lion);
                nbr_animal++;
                System.out.println("Animal ajouté, nombre d'animaux: " + nbr_animal);
            } catch (InvalidAgeException e) {
                System.out.println("Erreur d'ajout de l'animal : " + e.getMessage());
            }

            try {
                Animal tiger = new Animal("Feline", "Tiger", 3, true);
                zoo.addAnimal(tiger);
                nbr_animal++;
                System.out.println("Animal ajouté, nombre d'animaux: " + nbr_animal);
            } catch (InvalidAgeException e) {
                System.out.println("Erreur d'ajout de l'animal : " + e.getMessage());
            }

            try {
                Animal elephant = new Animal("Elephant", "Elephant", 10, true);
                zoo.addAnimal(elephant);
                nbr_animal++;
                System.out.println("Animal ajouté, nombre d'animaux: " + nbr_animal);
            } catch (InvalidAgeException e) {
                System.out.println("Erreur d'ajout de l'animal : " + e.getMessage());
            }

            try {
                Animal giraffe = new Animal("Giraffe", "Giraffe", -7, true);
                zoo.addAnimal(giraffe);
                nbr_animal++;
                System.out.println("Animal ajouté, nombre d'animaux: " + nbr_animal);
            } catch (InvalidAgeException e) {
                System.out.println("Erreur d'ajout de l'animal : " + e.getMessage());
            }

        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }
    }
}


