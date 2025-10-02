package CoffeeProject;

// Espresso subklasse – polymorfi
class DobbleEspresso extends Drink {
    public DobbleEspresso(String name, boolean whippedCream) {

        super(name); // TODO: kald super constructor
    }

    @Override
    public Cup serve(Size size, boolean whippedCream) {
        // TODO: Espresso har fast størrelse – size ignoreres
        // TODO: Returner en Cup med navn, ingen size og uden flødeskum
        return new Cup("Dobble Espresso", null, false);
    }
}