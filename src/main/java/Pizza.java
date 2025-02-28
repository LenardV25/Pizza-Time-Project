 import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class Pizza {
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
        //change to asking number input for streets
        //then can do delivery charge fee
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

        while (pizChoice <= 0) {
            scanner.nextLine();
            System.out.println("Invalid Number Choice. Try Again");
            System.out.println("1: Small (10 inches) \n2: Medium (14 inches) \n3: Large Pizza (16 inches)");
            pizChoice = scanner.nextInt();
        }

            switch (pizChoice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("===> Small Pizza Chosen");
                    double small = 10.00;
                    double cost;

                    System.out.println("---Toppings---");
                    System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                    int tops1 = scanner.nextInt();
                    while (tops1 <= 0 || tops1 > 5) {
                        scanner.nextLine();
                        System.out.println("Invalid Number Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                        tops1 = scanner.nextInt();
                    }
                     
                    switch (tops1) {
                        case 1:
                        double pepps = 3.50;
                        System.out.println("===> Pepperoni chosen");
                        System.out.println("---Order Summary---");
                        cost = ((small + pepps) * 1.15);
                        
                        System.out.println("Your order costs $" + Math.round(cost));
                        System.out.println("Thank You for Ordering");
                        break;
            
                        case 2:
                        double bacon = 5.00;
                        System.out.println("===> Bacon chosen");
                        System.out.println("---Order Summary---");
                        cost = ((small + bacon) * 1.15);

                        System.out.println("Your order costs $" + Math.round(cost) );
                        System.out.println("Thank You for Ordering");
                        break;

                        case 3:
                        double ham = 5.00;
                        System.out.println("===> Ham chosen");
                        System.out.println("---Order Summary---");
                        cost = ((small + ham) *1.15);

                        System.out.println("Your order costs $" + Math.round(cost) );
                        System.out.println("Thank You for Ordering");
                        break;

                        case 4:
                        double pines = 5.00;
                        System.out.println("===> Pineapple chosen");
                        System.out.println("---Order Summary---");
                        cost = ((small + pines) *1.15);
                        System.out.println("Your order costs $" + Math.round(cost) );
                        System.out.println("Thank You for Ordering");
                        break;

                        case 5:
                        double cheese = 2.00;
                        System.out.println("===> Cheesen chosen");
                        System.out.println("---Order Summary---");
                        cost = ((small +cheese) * 1.15);
                        
                        System.out.println("Your order costs $" + Math.round(cost));
                        System.out.println("Thank You for Ordering");
                        break;

                        default:
                        scanner.nextLine();
                        System.out.println("Invalid Number Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                        tops1 = scanner.nextInt();
                    }
                break;

                case 2:
                    scanner.nextLine();
                    System.out.println("===> Medium Pizza Chosen");
                    double medium = 12.00;
                    double mediumCost;

                    System.out.println("---Toppings---");
                    System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                    int tops2 = scanner.nextInt();

                    while (tops2 <= 0 || tops2 > 5) {
                        scanner.nextLine();
                        System.out.println("Invalid Number Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                        tops2 = scanner.nextInt();
                    }

                    switch (tops2) {
                        case 1:
                        double pepps = 3.50;
                        System.out.println("===> Pepperoni chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (medium + pepps));
                        System.out.println("Thank You for Ordering");
                        break;
            
                        case 2:
                        double bacon = 4.00;
                        System.out.println("===> Bacon chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (medium + bacon));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 3:
                        double ham = 4.50;
                        System.out.println("===> Ham chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (medium + ham));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 4:
                        double pines = 5.00;
                        System.out.println("===> Pineapple chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (medium + pines));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 5:
                        double cheese = 2.00;
                        System.out.println("===> Cheese chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (medium + cheese));
                        System.out.println("Thank You for Ordering");
                        break;

                        default:
                        scanner.nextLine();
                        System.out.println("Invalid Number Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                        tops2 = scanner.nextInt();
                    }
                break;

                case 3:
                    scanner.nextLine();
                    System.out.println("===> Large Pizza Chosen");
                    double large = 14.00;
                    double lrgCost;

                    System.out.println("---Toppings---");
                    System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese ");
                    int tops3 = scanner.nextInt();

                    while (tops3 <= 0 || tops3 > 5) {
                        scanner.nextLine();
                        System.out.println("Invalid Number Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                        tops3 = scanner.nextInt();
                    }

                    switch (tops3) {
                        case 1:
                        double pepps = 3.50;
                        System.out.println("===> Pepperoni chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (large + pepps));
                        System.out.println("Thank You for Ordering");
                        break;
            
                        case 2: 
                        double bacon = 4.00;
                        System.out.println("===> Bacon chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (large + bacon));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 3:
                        double ham = 4.50;
                        System.out.println("===> Ham chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (large + ham));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 4:
                        double pines = 5.00;
                        System.out.println("===> Pineapple chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (large + pines));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 5:
                        double cheese = 2.00;
                        System.out.println("===> Cheese chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (large + cheese));
                        System.out.println("Thank You for Ordering");

                        default:
                        scanner.nextLine();
                        System.out.println("Invalid Number Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                        tops3 = scanner.nextInt();
                    }
                break;

                default:
                scanner.nextLine();
                System.out.println("Invalid Number Choice. Try Again");
                System.out.println("1: Small (10 inches) \n2: Medium (14 inches) \n3: Large Pizza (16 inches)");
                pizChoice = scanner.nextInt();
            }
    }        
    private static void orderHist() {

    }

    }
        
