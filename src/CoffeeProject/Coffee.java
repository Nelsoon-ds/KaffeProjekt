package CoffeeProject;

// Coffee subklasse – polymorfi
class Coffee extends Drink {
    public Coffee(String name) {
        super(name);
        // TODO: kald super constructor
    }

    @Override
    public Cup serve(Size size, boolean whippedCream) {

        return new Cup(name, size, false);
        // TODO: Returner en Cup med navnet, størrelse
    }
}