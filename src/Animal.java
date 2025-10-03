public class Animal {
    private String name;
    private String family;

    public Animal(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", family='" + family + '\'' + '}';
    }

    // Pour tester unicité
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // même référence
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal other = (Animal) obj;
        return this.name.equals(other.name) && this.family.equals(other.family);
    }
}
