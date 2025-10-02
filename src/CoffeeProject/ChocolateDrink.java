package CoffeeProject;

// ChocolateDrink subklasse – polymorfi
class ChocolateDrink extends Drink {
    private boolean whippedCream;

    public ChocolateDrink(String name, boolean whippedCream) {
        super(name); // TODO: kald super constructor
        this.whippedCream = whippedCream;
    }


    // compareTo implementeres her i superklassen
    @Override
    public int compareTo(Drink other) {
        // TODO: Sammenlign navne alfabetisk
        return this.name.compareToIgnoreCase(other.name);
    }
    @Override
    public Cup serve(Size size, boolean whippedCream) {
        return "drink type: " + name + size + (whippedCream? "yes" : "no");
        // TODO: ChocolateDrink kan tilføje
        // TODO: Returner en Cup med navnet, størrelse og flødeskum
    }
}
