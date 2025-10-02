package CoffeeProject;
import java.util.ArrayList;
import java.util.List;

// Kaffemaskine klasse – aggregation
class CoffeeMachine {
    private List<Drink> drinks;

    public CoffeeMachine() {
        drinks = new ArrayList<>();
        drinks.add(new ChocolateDrink("Chocolate Drink", false));
        drinks.add(new Espresso("Espresso"));
        drinks.add(new Coffee("Coffee", false));
        // TODO: Tilføj forskellige drikke til listen
        // TODO: Tilføj Espresso og ChocolateDrink
    }

    /*
     * Serve en drik
     * - Søger i listen efter navn
     * - Kalder serve() på den rigtige drik
     */
    public Cup serveDrink(String drinkName, Size size, boolean whippedCream) {
        // TODO: Loop igennem drinks-listen
        for(Drink d : drinks){
            if(d.getName().equalsIgnoreCase(drinkName)){
                d.serve(size, false);
            }
        }
        // TODO: Tjek om navnet matcher (ignoreCase)
        // TODO: Returner resultatet af serve()
        // TODO: Håndter hvis drikken ikke findes
        return null;
    }

    // TODO: sortDrinks() – sorter alfabetisk via Comparable

    // TODO: listDrinks() – udskriv alle drikke til konsol
    public void listDrinks(){
        for(Drink d : drinks){
            System.out.println(d);
        }
    }
}
