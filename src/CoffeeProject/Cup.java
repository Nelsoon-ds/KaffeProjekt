package CoffeeProject;

// Cup-klasse – eksempel på encapsulation
class Cup {
    // TODO: private felter: drinkName, size, whippedCream
    private String drinkName;
    private Size size;
    private boolean hasWhippedCream;

    // TODO: Lav constructor, der initialiserer felterne

    public Cup(String drinkName, Size size, boolean hasWhippedCream) {
        this.drinkName = drinkName;
        this.size = size;
        this.hasWhippedCream = hasWhippedCream;
    }


    // TODO: Implementér getters for alle felter

    public String getDrinkName() {
        return drinkName;
    }

    public Size getSize() {
        return size;
    }

    public boolean getHasWhippedCream() {
        return hasWhippedCream;
    }



    // TODO: Implementér toString(), fx "Cup{drinkName='Espresso', size=N/A, whippedCream=false}"

    @Override
    public String toString() {
        return "Name: " + drinkName + "\t" + "Size = "+ size +"\t"+ "Has whippedCream = " + hasWhippedCream;
}