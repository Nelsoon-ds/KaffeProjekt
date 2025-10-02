package CoffeeProject;
import java.util.*;

// Kaffemaskine klasse – aggregation
class CoffeeMachine {
    private List<Drink> drinks;
    public CoffeeMachine() {
        drinks = new ArrayList<>();
        drinksInStock();
        // TODO: Tilføj forskellige drikke til listen
        // TODO: Tilføj Espresso og ChocolateDrink
    }
    // TODO: Loop igennem drinks-listen

    /*
     * Serve en drik
     * - Søger i listen efter navn
     * - Kalder serve() på den rigtige drik
     */
    public Cup serveDrink(String drinkName) {
// Få tjekket om det er en espresso
        if (drinkName.equalsIgnoreCase("espresso"))  {
            System.out.println("Creating a drink with name: " + drinkName);
            return new Cup (drinkName);
        }
        if (drinkName.equalsIgnoreCase("double espresso")) {
            System.out.println("Creating a drink with name: " + drinkName);
            return new Cup (drinkName);
        }
        if (drinkName.equalsIgnoreCase("triple espresso")){
            System.out.println("Creating a drink with name: " + drinkName);
            return new Cup (drinkName);
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("First, what size would you like to order?");
        Size size = Size.valueOf(scan.nextLine().toUpperCase());
        System.out.println("Do you take cream?");
        String userWantsWhippedCream = scan.next();
        boolean whippedCream = false;

        if (userWantsWhippedCream.equalsIgnoreCase("yes")) {
             whippedCream = true;
        }

        for(Drink d : drinks){
            System.out.println(d);
            if (d.getName().equalsIgnoreCase(drinkName)) {
               System.out.println("inner loop" + drinkName);
            }

        }
        Cup userDrink = new Cup(drinkName, size, whippedCream);
        System.out.println(userDrink);
        return userDrink;
        // TODO: Tjek om navnet matcher (ignoreCase)
        // TODO: Returner resultatet af serve()
        // TODO: Håndter hvis drikken ikke findes
    }

    private String getUserInput() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
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
