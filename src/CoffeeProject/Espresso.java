package CoffeeProject;

// Espresso subklasse – polymorfi
class Espresso extends Drink {
    public Espresso(String name, boolean whippedCream) {

        super(name); // TODO: kald super constructor
    }

    @Override
    public Cup serve(Size size, boolean whippedCream) {
        // TODO: Espresso har fast størrelse – size ignoreres
        // TODO: Returner en Cup med navn, ingen size og uden flødeskum
        return new Cup("Espresso", null, false);
    }
}
