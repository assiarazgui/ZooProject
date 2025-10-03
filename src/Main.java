public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo();

        // ✅ Instruction 10 : Ajout
        zoo1.addAnimal(new Animal("Lion", "Félins"));
        zoo1.addAnimal(new Animal("Tigre", "Félins"));
        zoo1.addAnimal(new Animal("Elephant", "Mammifères"));

        // Tentative doublon
        boolean added = zoo1.addAnimal(new Animal("Lion", "Félins"));
        System.out.println("Ajout doublon Lion ? " + added);

        // ✅ Instruction 11 : Affichage
        System.out.println("Animaux du zoo1 :");
        zoo1.displayAnimals();

        // ✅ Recherche
        int index = zoo1.findAnimalByName("Tigre");
        System.out.println("Index du Tigre : " + index);

        int index2 = zoo1.findAnimalByName("Girafe");
        System.out.println("Index de la Girafe : " + index2);

        // ✅ Instruction 13 : Suppression
        boolean removed = zoo1.removeAnimal("Elephant");
        System.out.println("Suppression Elephant ? " + removed);

        System.out.println("Animaux après suppression :");
        zoo1.displayAnimals();

        // ✅ Instruction 15 : Comparaison
        zoo2.addAnimal(new Animal("Girafe", "Herbivores"));
        zoo2.addAnimal(new Animal("Zèbre", "Herbivores"));

        Zoo plusGrand = zoo1.compareZoo(zoo2);
        System.out.println("Le zoo avec plus d’animaux est celui avec " + plusGrand.getAnimalCount() + " animaux.");
    }
}
