package CoffeeProject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Kaffemaskine klasse – aggregation
class CoffeeMachine {
    private List<Drink> drinks;
    public CoffeeMachine() {
        drinks = new ArrayList<>();
        drinksInStock();
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
            if (d.getName().equalsIgnoreCase(drinkName)) {
                return new Cup(drin)
            }
        }
        // TODO: Tjek om navnet matcher (ignoreCase)
        // TODO: Returner resultatet af serve()
        // TODO: Håndter hvis drikken ikke findes
    }

    private getUserInput() {
        Scanner scan = new Scanner(System.in);
        scan.next();

    }

    // TODO: sortDrinks() – sorter alfabetisk via Comparable
    public List<Drink> sortDrinks() {
        Collections.sort(drinks, new DrinkNameComparator());
        return drinks;
    }
    // TODO: listDrinks() – udskriv alle drikke til konsol
    public void listDrinks(){
        for(Drink d : drinks){
            System.out.println(d);
        }


    }

    public void drinksInStock() {
        drinks.add(new ChocolateDrink("Chocolate Drink", false));
        drinks.add(new Espresso("Espresso", false));
        drinks.add(new ChocolateMilk("Chocolate Milk", false));
        drinks.add(new DobbleEspresso("Double-Espresso", false));
        drinks.add(new TripleEspresso("Triple-Espresso", true));
    }
    public void  welcomeMessage() {
        System.out.println("Welcome to the coffee machine. Please press the correct number to order.");
        System.out.println("Here is the menu:\n1. Chocolate Drink\n2. Chocolate Milk\n3. Espresso\n4. Double Espresso\n" +
                "5. Triple Espresso");
    }
}
