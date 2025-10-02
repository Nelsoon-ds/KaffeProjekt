package CoffeeProject;

// Coffee subklasse – polymorfi
class Coffee extends Drink {
    public Coffee(String name) {
        super(name);
        // TODO: kald super constructor
    }

    @Override
    public Cup serve(Size size) {

        Cup Coffe = new Cup(name, size);
        return Coffe;
        // TODO: Returner en Cup med navnet, størrelse
    }
}