package CoffeeProject;

// Coffee subklasse – polymorfi
class Coffee extends Drink {
    public Coffee(String name, Size size) {
        super(name);
        this.size = size;
        // TODO: kald super constructor
    }
    // compareTo implementeres her i superklassen
    @Override
    public Cup serve(Size size, boolean whippedCream) {
        // TODO: Coffee kan have størrelser, men ikke flødeskum
        // TODO: Returner en Cup med korrekt navn og størrelse
        return null; // TODO: Erstat null med faktisk Cup
    }
}