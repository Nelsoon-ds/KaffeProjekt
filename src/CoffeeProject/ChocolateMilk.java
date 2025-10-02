package CoffeeProject;

class ChocolateMilk extends Drink {
    private boolean whippedCream;

    public ChocolateMilk(String name, boolean whippedCream) {
        super(name);
        this.whippedCream = whippedCream;
        // TODO: kald super constructor
    }

    @Override
    public Cup serve(Size size, boolean whippedCream) {

        return new Cup(name, size, whippedCream);
    }
}