package CoffeeProject;


/*
 * Abstrakt klasse Drink
 * - Skal arves af alle drikke
 * - Viser abstraktion, polymorfi og arv
 */
abstract class Drink implements Comparable<Drink> {

    private String name; // TODO: Overvej om dette skal være private med getter/setter

    public Drink(String name) {
        this.name = name;
    }

    /*
     * Polymorf metode serve
     * - Skal implementeres forskelligt i subklasser
     * - Skal returnere en Cup med den valgte drik
     */
    public abstract Cup serve(Size size, boolean whippedCream);

    // TODO: Implementér getter for name

    public String getName() {
        return name;
    }

    // TODO: Implementér compareTo() for alfabetisk sortering af drikke
    public int compareTo(Drink d1, Drink d2) {
            return  d1.getName().compareTo(d2.getName());
        }

    // TODO: Implementér toString() til at vise drikkens navn
    public String toString() {
    return "Drink name: " + name;
    }
}




