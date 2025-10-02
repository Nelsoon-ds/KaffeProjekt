package CoffeeProject;

// Espresso subklasse – polymorfi
class Espresso extends Drink {
    public Espresso(String name, boolean whippedCream) {

        super(name, whippedCream); // TODO: kald super constructor
    }

    @Override
    public Cup serve(Size size) {
        // TODO: Espresso har fast størrelse – size ignoreres
        // TODO: Returner en Cup med navn, ingen size og uden flødeskum
        return name, whippedCream;
    }

}
