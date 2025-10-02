package CoffeeProject;

// ChocolateDrink subklasse – polymorfi
class ChocolateDrink extends Drink {

    public ChocolateDrink(String name, boolean whippedCream) {
        super(name, whippedCream); // TODO: kald super constructor
    }

    @Override
    public Cup serve(Size size, boolean whippedCream) {
        Cup chocolateDrink = new Cup(name, size);
        return chocolateDrink;
        // TODO: ChocolateDrink kan tilføje
        // TODO: Returner en Cup med navnet, størrelse og flødeskum
    }
}
