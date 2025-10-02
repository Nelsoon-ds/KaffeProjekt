package CoffeeProject;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

// Testklasse
public class CoffeeMachineTest {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO: Opret en CoffeeMachine
//        CoffeeMachine machine = new CoffeeMachine();
//        machine.listDrinks();
//
//        System.out.println("Sort the drink list");
//        // After sort
//        machine.sortDrinks();
//        machine.listDrinks();
//
        orderDrinks();

        // TODO: Sorter og udskriv alle drikke
        // TODO: Server forskellige drikke og udskriv Cups


        // Eksempel:
        // Cup cup1 = machine.serveDrink("Sort kaffe", Size.MEDIUM, false);
        // System.out.println(cup1);

        // TODO: Tilføj flere serveringseksempler med forskellige typer og flødeskum

        // TODO: Overvej at tilføje brugerinput med Scanner til dynamisk bestilling

    }
    public static void orderDrinks() {
        // Lets get a welcome speak first
        CoffeeMachine machine = new CoffeeMachine();
        Scanner scan = new Scanner(System.in);
        machine.welcomeMessage();
        while (true) {
            try  {
                System.out.println("Please pick what you would like to order: ");
                int userInput = Integer.valueOf(scan.next());
                switch (userInput) {
                    // First is espresso
                    case 1:
                        machine.serveDrink("Espresso", null, false);
                        break;

                }
            }
            // Lets throw an unchecked exception
            catch (InputMismatchException e) {
                throw new RuntimeException(e + "You fucked up homie");
            }

        }
    }



}