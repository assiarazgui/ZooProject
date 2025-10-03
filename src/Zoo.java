public class Zoo {
    private final int NBR_CAGES = 25; // ✅ Instruction 14 : constante
    private Animal[] animals;
    private int animalCount; // compteur

    public Zoo() {
        animals = new Animal[NBR_CAGES];
        animalCount = 0;
    }

    // ✅ Instruction 10 : Ajouter animal
    public boolean addAnimal(Animal a) {
        if (isFull()) { // zoo plein
            return false;
        }
        // ✅ Instruction 12 : vérifier unicité
        if (findAnimalByName(a.getName()) != -1) {
            return false;
        }
        animals[animalCount] = a;
        animalCount++;
        return true;
    }

    // ✅ Instruction 11.1 : Afficher animaux
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Le zoo est vide.");
        } else {
            for (int i = 0; i < animalCount; i++) {
                System.out.println(animals[i]);
            }
        }
    }

    // ✅ Instruction 11.2 : Recherche par nom
    public int findAnimalByName(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // ✅ Instruction 13 : Supprimer un animal
    public boolean removeAnimal(String name) {
        int index = findAnimalByName(name);
        if (index == -1) return false;

        // Décaler les animaux vers la gauche
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null; // dernière case à null
        animalCount--;
        return true;
    }

    // ✅ Instruction 15.1 : Vérifier si zoo est plein
    public boolean isFull() {
        return animalCount >= NBR_CAGES;
    }

    // ✅ Instruction 15.2 : Comparer deux zoos
    public Zoo compareZoo(Zoo other) {
        if (this.animalCount >= other.animalCount) {
            return this;
        } else {
            return other;
        }
    }

    // Getter pour tests
    public int getAnimalCount() {
        return animalCount;
    }
}
