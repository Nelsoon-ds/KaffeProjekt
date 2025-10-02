package CoffeeProject;

// ChocolateDrink subklasse – polymorfi
class ChocolateDrink extends Drink {
    public ChocolateDrink(String name) {
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
        // TODO: ChocolateDrink kan tilføje flødeskum
        // TODO: Returner en Cup med navnet, størrelse og flødeskum
        return null;
    }
}
