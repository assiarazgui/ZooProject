package tn.esprit.gestion.entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Zoo {
    private String name;
    private int capacity;
    private List<Animal> animals;

    public Zoo(String name, int capacity) {
        setName(name);
        this.capacity = capacity;
        animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.name = name;
    }

    public boolean isZooFull() {
        return animals.size() >= capacity;
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if(isZooFull()) {
            throw new ZooFullException("Le zoo est plein ! Impossible d'ajouter l'animal : " + animal.getName());
        }
        animals.add(animal);
        System.out.println(animal.getName() + " a été ajouté au zoo.");
    }

    public void removeAnimal(String name) {
        Animal toRemove = findAnimal(name);
        if(toRemove != null) {
            animals.remove(toRemove);
            System.out.println(name + " a été retiré du zoo.");
        } else {
            System.out.println("Aucun animal nommé " + name + " trouvé.");
        }
    }

    public Animal findAnimal(String name) {
        for(Animal a : animals) {
            if(a.getName().equalsIgnoreCase(name)) {
                return a;
            }
        }
        return null;
    }

    public void displayAnimals() {
        if(animals.isEmpty()) {
            System.out.println("Aucun animal dans le zoo.");
            return;
        }
        System.out.println("Liste des animaux du zoo :");
        for(Animal a : animals) {
            System.out.println(a);
        }
    }

    public void displayZooInfo() {
        System.out.println("Zoo: " + name + ", Capacité: " + capacity + ", Animaux actuels: " + animals.size());
    }

    public void sortAnimalsByAge() {
        animals.sort(Comparator.comparingInt(Animal::getAge));
        System.out.println("Animaux triés par âge :");
        displayAnimals();
    }
}
