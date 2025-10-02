package CoffeeProject;

// Coffee subklasse – polymorfi
class Coffee extends Drink {
    public Coffee(String name) {
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
        // TODO: Coffee kan have størrelser, men ikke flødeskum
        // TODO: Returner en Cup med korrekt navn og størrelse
        return null; // TODO: Erstat null med faktisk Cup
    }
}