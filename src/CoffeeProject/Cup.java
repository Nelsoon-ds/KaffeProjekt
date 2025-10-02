package CoffeeProject;

// Cup-klasse – eksempel på encapsulation
class Cup {
    // TODO: private felter: drinkName, size, whippedCream
    private String name;
    private Size size;
    private boolean whippedCream;

    // TODO: Lav constructor, der initialiserer felterne

    public Cup(String drinkName, Size size, boolean whippedCream) {
        this.name = drinkName;
        this.size = size;
        this.whippedCream = whippedCream;
    }


    // TODO: Implementér getters for alle felter

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }



    // TODO: Implementér toString(), fx "Cup{drinkName='Espresso', size=N/A, whippedCream=false}"

    @Override
    public String toString() {
        return "Name: " + name + "\t" + "Size = "+ size +"\t"+ "Has whippedCream = " + whippedCream;
}}