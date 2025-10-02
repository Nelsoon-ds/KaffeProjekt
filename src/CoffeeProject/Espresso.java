package CoffeeProject;

// Espresso subklasse – polymorfi
class Espresso extends Drink {
    public Espresso(String name) {
        super(name); // TODO: kald super constructor
    }
    // compareTo implementeres her i superklassen
    @Override
    public int compareTo(Drink other) {
        // TODO: Sammenlign navne alfabetisk
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public Cup serve(Size size, boolean whippedCream) {
        // TODO: Espresso har fast størrelse – size ignoreres
        // TODO: Returner en Cup med navn, ingen size og uden flødeskum
        return null;
    }
}
