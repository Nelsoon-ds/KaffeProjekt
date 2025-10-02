package CoffeeProject;

// ChocolateDrink subklasse – polymorfi
class ChocolateDrink extends Drink {
private boolean whippedCream;

    public ChocolateDrink(String name, boolean whippedCream) {
        super(name);
        this.whippedCream = whippedCream;
    // TODO: kald super constructor
    }

    @Override
    public Cup serve(Size size, boolean whippedCream) {

        return new Cup(name, size, whippedCream);
    }
}
