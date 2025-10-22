package tn.esprit.gestion.entities;

public class Animal {
    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species) {
        setName(name);
        setAge(age);
        setSpecies(species);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    // Setters avec validation
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'animal ne peut pas être vide.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif.");
        }
        this.age = age;
    }

    public void setSpecies(String species) {
        if(species == null || species.isEmpty()) {
            throw new IllegalArgumentException("L'espèce ne peut pas être vide.");
        }
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal [Nom=" + name + ", Age=" + age + ", Espèce=" + species + "]";
    }
}
