 import java.util.Scanner;
import java.util.List;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

class PizzaOrderSystem{
    private static List<String> orderHistory = new ArrayList<String>();
    
    public static void addOrder(String order) {
        orderHistory.add(LocalDateTime.now() + ": " + order);
    }
    public static List<String> getOrderHistory(){
        return orderHistory;
    }

    }


public class PizzaTime {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("---Pizza Time---");
    System.out.println("Welcome to our online pizza delivery system");
    boolean exit = false;
    while (!exit) {

        System.out.println("---Main Menu---");
        System.out.println("1: User Information \n2: Order Customization \n3: Order History \n4: Exit");
        int userChoice = scanner.nextInt();

        while (userChoice <= 0 ) {
            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            userChoice = scanner.nextInt();
        }

            switch (userChoice) {
                case 1:
                System.out.println("User Info");
                userInfo();
                break;
            
                case 2:
                System.out.println("Order Pizza");
                orderCustom();
                break;

                case 3:
                System.out.println("View Order History");
                orderHist();
                break;

                case 4:
                System.out.println("Thank you for visiting, Goodbye.");
                exit = true;
                break;

                default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                userChoice = scanner.nextInt();
                break;
            }
    }   
    scanner.close();
    }

    private static void userInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Enter Your Street Name---");
        String street = scanner.nextLine();
        street.toUpperCase().trim();
        boolean input = false;
        do {
            switch (street.toUpperCase().trim()) {
                case "BURROWS":
                input = true;
                break;

                case "MAIN":
                input = true;
                break;

                case "HENDERSON":
                input = true;
                break;

                case "MAGNUS":
                input = true;
                break;

                case "MOUNTAIN":
                input = true;
                break;

                case "MUNROE":  //delivery areas expanded 
                input = true;
                break;

                case "TUPELO":
                input = true;
                break;

                case "ANTRIM":
                input = true;
                break;

                default: 
                System.out.println("We don't deliver to this street. Try another street name.");
                street = scanner.nextLine();
                input = false;

            }
        } while (!input);
        
        System.out.println("---Street Number---");
        int streetNum = scanner.nextInt();
        while (streetNum <= 0) {
            System.out.println("Invalid street number. Try again.");
            streetNum= scanner.nextInt();
        }

        scanner.nextLine();
        System.out.println("---Your City---");
        String city = scanner.nextLine();
        city.toUpperCase().trim();

        boolean userCity = false;

        do {
            switch (city.toUpperCase().trim()) {
                case "WINNIPEG":
                    userCity = true;
                    break;
            
                default:
                    System.out.println("We don't deliver to this city. Try Again.");
                    city = scanner.nextLine();
                    //break;
            }
        } while (!userCity);
        
        
        
        //A1A 1A1
        //computers count from 0,1,2
        boolean goodPostal = false;
        System.out.println("---Postal Code---");
        String userPostal = scanner.nextLine();
        
        while (!goodPostal) {
            //scanner.nextLine();
            char space = userPostal.charAt(3);
            boolean isSpace = Character.isSpaceChar(space);
            if (isSpace == false) {
                System.out.println("Invalid, space missing. Try Again");
                userPostal= scanner.nextLine();
            }

            char zero = userPostal.charAt(0);
            boolean isCharOne = Character.isLetter(zero);
            

            char one = userPostal.charAt(1);
            boolean isDigtOne = Character.isDigit(one);
            

            char two = userPostal.charAt(2);
            boolean isCharTwo = Character.isLetter(two);
            
            char three = userPostal.charAt(4);
            boolean isDigitTwo = Character.isDigit(three);
            

            char four = userPostal.charAt(5);
            boolean isCharThree = Character.isLetter(four);
            

            char five = userPostal.charAt(6);
            boolean isDigitThree = Character.isDigit(five);

            if (isCharOne == false) {
                System.out.println("Invalid first character. Try Again");
                System.out.println("---Postal Code---");
                userPostal = scanner.nextLine();
            }
            else if (isDigtOne == false) {
                System.out.println("Invalid first digit. Try Again");
                System.out.println("---Postal Code---");
                userPostal = scanner.nextLine();
            }
            else if (isCharTwo == false) {
                System.out.println("Invalid second character. Try Again");
                System.out.println("---Postal Code---");
                userPostal = scanner.nextLine();
            }
            else if (isDigitTwo == false) {
                System.out.println("Invalid second digit. Try Again");
                System.out.println("---Postal Code---");
                userPostal = scanner.nextLine();
            }
            else if (isCharThree == false) {
                System.out.println("Invalid third character. Try Again");
                System.out.println("---Postal Code---");
                userPostal = scanner.nextLine();
            }
            else if (isDigitThree == false) {
                System.out.println("Invalid third digit. Try Again");
                System.out.println("---Postal Code---");
                userPostal = scanner.nextLine();
            }
            else goodPostal = true;
            //after all checks on postal pass
        }


    }
    
    private static void orderCustom(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Order Customization---");
        System.out.println("1: Small (10 inches) \n2: Medium (14 inches) \n3: Large Pizza (16 inches)");
        int pizChoice = scanner.nextInt();

        while (pizChoice <= 0 || pizChoice > 3) {
            scanner.nextLine();
            System.out.println("Invalid Number Choice. Try Again");
            System.out.println("1: Small (10 inches) \n2: Medium (14 inches) \n3: Large Pizza (16 inches)");
            pizChoice = scanner.nextInt();
        }
        String pizzaSize = "";
        double baseCost = 0;

            switch (pizChoice) {
                case 1:
                    scanner.nextLine();
                    pizzaSize += "Small";
                    baseCost = 10.00;

                    System.out.println("===> " + pizzaSize + " Pizza Chosen");
                    break;

                case 2:
                    scanner.nextLine();
                    pizzaSize += "Medium";
                    baseCost = 12.00;

                    System.out.println("===> " + pizzaSize + " Pizza Chosen");
                    break;

                case 3:
                    scanner.nextLine();
                    pizzaSize += "Large";
                    baseCost = 14.00;

                    System.out.println("===> " + pizzaSize + " Pizza Chosen");
                    break;

                default:
                scanner.nextLine();
                System.out.println("Invalid Number Choice. Try Again");
                System.out.println("1: Small (10 inches) \n2: Medium (14 inches) \n3: Large Pizza (16 inches)");
                pizChoice = scanner.nextInt();
            }

            System.out.println("---Toppings---");
            System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
            int tops = scanner.nextInt();
            while (tops <= 0 || tops > 5) {
                scanner.nextLine();
                System.out.println("Invalid Number Choice. Try Again");
                System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                tops = scanner.nextInt();

            }

            String toppings = "";
            double toppingCost= 0;
            String order = "";

            switch (tops) {
                case 1:
                toppings += "Pepperoni";
                toppingCost = 3.50;

                order = "Size: " + pizzaSize + ", Topping: " + toppings;
                PizzaOrderSystem.addOrder(order);
                
                break;
                
                case 2:
                toppings = "Bacon";
                toppingCost = 4.00;

                order = "Size: " + pizzaSize + ", Topping: " + toppings;
                PizzaOrderSystem.addOrder(order);

                break;

                case 3:
                toppings = "Ham";
                toppingCost = 4.50;

                order = "Size: " + pizzaSize + ", Topping: " + toppings;
                PizzaOrderSystem.addOrder(order);

                break;

                case 4:
                toppings = "Pineapple";
                toppingCost = 5.00;

                order = "Size: " + pizzaSize + ", Topping: " + toppings;
                PizzaOrderSystem.addOrder(order);

                break;

                case 5:
                toppings = "Cheese";
                toppingCost = 2.00;

                order = "Size: " + pizzaSize + ", Topping: " + toppings;
                PizzaOrderSystem.addOrder(order);

                break;

                default:
                break;
            }
            //cost
            double totalCost = (baseCost + toppingCost) *1.15; //% 15 tax

            System.out.println("---Order Summary---");
            System.out.println("Your order costs $" + Math.round(totalCost));
            System.out.println("Thank You for Ordering");

            
            
    }        
    private static void orderHist() {
    List<String> history = PizzaOrderSystem.getOrderHistory();

    System.out.println("---Order History---");
    if (history.isEmpty()) {
        System.out.println("No orders have been placed yet.");
    } else {
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i+1) + ". " + history.get(i));
        }
    }
    System.out.println("------"); 
    }
}


        
    
        
