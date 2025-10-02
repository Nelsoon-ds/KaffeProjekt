package CoffeeProject;
import java.util.ArrayList;
import java.util.List;

// Kaffemaskine klasse – aggregation
class CoffeeMachine {
    private List<Drink> drinks;

    public CoffeeMachine() {
        drinks = new ArrayList<>();
        // TODO: Tilføj forskellige drikke til listen
        // Eksempel: drinks.add(new Coffee("Sort kaffe"));
        // TODO: Tilføj Espresso og ChocolateDrink
    }

    /*
     * Serve en drik
     * - Søger i listen efter navn
     * - Kalder serve() på den rigtige drik
     */
    public Cup serveDrink(String drinkName, Size size, boolean whippedCream) {
        // TODO: Loop igennem drinks-listen
        // TODO: Tjek om navnet matcher (ignoreCase)
        // TODO: Returner resultatet af serve()
        // TODO: Håndter hvis drikken ikke findes
        return null;
    }

    // TODO: sortDrinks() – sorter alfabetisk via Comparable

    // TODO: listDrinks() – udskriv alle drikke til konsol
}
