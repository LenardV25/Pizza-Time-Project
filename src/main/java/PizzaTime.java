 import java.util.Scanner;
import java.util.List;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Order{
    private int orderId;
    private String toppings;
    private String pizzaType;
    private double cost;
    private LocalDateTime timestamp;
    
    public Order( int orderId, String pizzaType, String toppings, double cost, LocalDateTime timestamp) {
        this.orderId = orderId;
        this.toppings = toppings;
        this.pizzaType = pizzaType;
        this.cost = cost;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Order{" +
        "\n" + "orderId= " + orderId +
        "\n Pizza Topping= " + toppings + 
        "\n" + " pizzaType= " + pizzaType + 
        "\n" + " timestamp= " + timestamp +
        "}";

        } 
    }

public class PizzaTime {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
    
        System.out.println("---Pizza Time---");
        System.out.println("Welcome to our online pizza delivery system");

        //menu system
        while (true) {
            System.out.println("---Main Menu---");
            System.out.println("1: User Information \n2: Order Customization \n3: Order History \n0: Exit");
            int userChoice = scanner.nextInt();

            if (userChoice == 0 ) {
                break;
            }

            switch (userChoice) {
                case 1:
                userInfo();
                break;
            
                case 2:
                orderCustom();
                break;

                case 3:
                orderHist();
                break;

                default:
                scanner.nextLine();
                System.out.println("Invalid Choice. Try Again.");
                break;
            }
        }
        System.out.println("Thanks You for Vistiing! Goodbye!");
        scanner.close();
        
    }

    private static void userInfo() {
        scanner.nextLine();
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
        //System.out.println("We are currently based at Kildonan Place");
        //pizza store is based in kildonan place
        //R2C 4H0
    
    private static void orderCustom(){
        System.out.println("---Order Customization---");
        System.out.println("1: Small (10 inches) \n2: Medium (14 inches) \n3: Large Pizza (16 inches)");
        int pizChoice = scanner.nextInt();

        while (pizChoice <= 0 || pizChoice > 3) {
            scanner.nextLine();
            System.out.println("Invalid Number Choice. Try Again");
            System.out.println("1: Small (10 inches) \n2: Medium (14 inches) \n3: Large Pizza (16 inches)");
            pizChoice = scanner.nextInt();
        }
        String pizzaSize;
        double baseCost=0;

            switch (pizChoice) {
                case 1:
                    scanner.nextLine();
                    pizzaSize = "Small";
                    baseCost = 10.00;

                    System.out.println("===> " + pizzaSize + " Pizza Chosen");
                    break;

                case 2:
                    scanner.nextLine();
                    pizzaSize = "Medium";
                    baseCost = 12.00;

                    System.out.println("===> " + pizzaSize + " Pizza Chosen");
                    break;

                case 3:
                    scanner.nextLine();
                    pizzaSize = "Large";
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

            switch (tops) {
                case 1:
                toppings = "Pepperoni";
                toppingCost = 3.50;
                break;
                
                case 2:
                toppings = "Bacon";
                toppingCost = 4.00;
                break;

                case 3:
                toppings = "Ham";
                toppingCost = 4.50;
                break;

                case 4:
                toppings = "Pineapple";
                toppingCost = 5.00;
                break;

                case 5:
                toppings = "Cheese";
                toppingCost = 2.00;
                break;

                default:
                break;
            }

            System.out.println("===> " + toppings + " chosen");

            //cost
            double totalCost = (baseCost + toppingCost) *1.15; //% 15 tax

            System.out.println("---Order Summary---");
            System.out.println("Your order costs $" + Math.round(totalCost));
            System.out.println("Thank You for Ordering");

            //create a new order

            
    }        
    private static void orderHist() {
        //list to store orders
        List<Order> orderHistory = new ArrayList<>(); 
        
        //call customization method
       

        //display updated order history
        System.out.println("\nUpdated Order History: ");
        
        //orders with timestamps
        //orderHistory.add(new Order(1, "Name", "PizzaType", LocalDateTime.now()));
        //orderHistory.add (new Order(2, "Lenard", "Pepperoni", LocalDateTime.now().minusHours(1)));
        //orderHistory.add(new Order(3, "Villazor", "Veggie", LocalDateTime.now().minusMinutes(30)));

        //display order history
        for (Order order : orderHistory) {
            System.out.println(order);
        }
    }

}


        
    
        
