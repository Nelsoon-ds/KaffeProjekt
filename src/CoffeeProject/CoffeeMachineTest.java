package CoffeeProject;

import java.util.Scanner;

// Testklasse
public class CoffeeMachineTest {
    public static void main(String[] args) {
        // TODO: Opret en CoffeeMachine
        CoffeeMachine machine = new CoffeeMachine();
        machine.listDrinks();
        userOrder(machine);

        // TODO: Sorter og udskriv alle drikke
        // TODO: Server forskellige drikke og udskriv Cups
        // Eksempel:
        // Cup cup1 = machine.serveDrink("Sort kaffe", Size.MEDIUM, false);
        // System.out.println(cup1);

        // TODO: Tilføj flere serveringseksempler med forskellige typer og flødeskum

        // TODO: Overvej at tilføje brugerinput med Scanner til dynamisk bestilling
    }

    public static void userOrder(CoffeeMachine machine) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Welcome to the Coffee Shop! ---");

        boolean ordering = true;
        while (ordering) {
            System.out.println("\nHere is a list of our available drinks: ");
            machine.listDrinks();

            System.out.print("Please choose a drink from the list: ");
            String name = sc.nextLine();

            System.out.print("Input size: (SMALL, MEDIUM, LARGE): ");
            String sizeInput = sc.nextLine().toUpperCase();
            Size size;

            try {
                size = Size.valueOf(sizeInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Please try again. Please only input validd input. ");
                continue;
            }

            System.out.println("Would you like whippedcream (Yes / No)?");
            String whippedCreamInput = sc.nextLine();
            boolean whippedCream;

            if (whippedCreamInput.equalsIgnoreCase("yes")) {
                whippedCream = true;
            } else if (whippedCreamInput.equalsIgnoreCase("no")) {
                whippedCream = false;
            } else {
                System.out.println("Incorrect input.");
                continue;
            }

            Cup cup = machine.serveDrink(name, size, whippedCream);
            System.out.println("Here is your drink!: " + cup);

            System.out.println("--- END OF PROGRAM ---")

        }
    }
}


