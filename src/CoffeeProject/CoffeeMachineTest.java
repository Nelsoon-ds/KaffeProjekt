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
    public static void orderDrinks() throws NumberFormatException {
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
                        machine.serveDrink("Chocolate Drink");
                        break;
                    case 2:
                        machine.serveDrink("Chocolate Milk");
                        break;
                    case 3:
                        machine.serveDrink("Espresso");
                        break;
                    case 4:
                        machine.serveDrink("Double Espresso");
                        break;
                    case 5:
                        machine.serveDrink("Triple Espresso");
                        break;

                }
            }
            // Lets throw an unchecked exception
            catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("You have inputted a string which cannot be converted to an integer. Please try again");
            }

        }
    }



}