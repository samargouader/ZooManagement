package tn.esprit.gestionzoo.main;

import java.util.Scanner;


public class ZooManagement {
    public static void main(String[] args) {
        // int nbrCages=20;
        // String zooName = "my zoo";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le nom du zoo: ");
        String zooName = scanner.nextLine();


        System.out.print("Entrer le nombre des cages: ");
        int nbrCages = scanner.nextInt();

        System.out.println(zooName + " comporte " + nbrCages + " cages");


    }
}
