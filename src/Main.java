package tn.esprit.gestion.main;

import tn.esprit.gestion.entities.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Esprit", 5);
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit) {
            System.out.println("\n=== Menu du Zoo ===");
            System.out.println("1. Ajouter un animal");
            System.out.println("2. Supprimer un animal");
            System.out.println("3. Afficher tous les animaux");
            System.out.println("4. Trier les animaux par âge");
            System.out.println("5. Afficher les infos du zoo");
            System.out.println("6. Quitter");
            System.out.print("Choix : ");
            int choice = sc.nextInt();
            sc.nextLine(); // consommer le \n

            switch(choice) {
                case 1:
                    try {
                        System.out.print("Nom de l'animal: ");
                        String name = sc.nextLine();
                        System.out.print("Âge de l'animal: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Espèce de l'animal: ");
                        String species = sc.nextLine();
                        Animal a = new Animal(name, age, species);
                        zoo.addAnimal(a);
                    } catch(Exception e) {
                        System.out.println("Erreur: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Nom de l'animal à supprimer: ");
                    String name = sc.nextLine();
                    zoo.removeAnimal(name);
                    break;
                case 3:
                    zoo.displayAnimals();
                    break;
                case 4:
                    zoo.sortAnimalsByAge();
                    break;
                case 5:
                    zoo.displayZooInfo();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        sc.close();
    }
}
