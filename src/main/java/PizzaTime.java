 import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PizzaTime {



    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Pizza Time---");
        System.out.println("Welcome to our online pizza delivery system");
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
                //System.out.println("===> Valid city entered");
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
        ArrayList<Integer> postalNum = new ArrayList<>();   //possible postal nums, no zeros
        postalNum.add(1);
        postalNum.add(2);
        postalNum.add(3);
        postalNum.add(4);
        postalNum.add(5);
        postalNum.add(6);
        postalNum.add(7);
        postalNum.add(8);
        postalNum.add(9);

        ArrayList<String> firstCharsNot = new ArrayList<>();    //first characters only not allowed
        firstCharsNot.add("D");
        firstCharsNot.add("F");
        firstCharsNot.add("I");
        firstCharsNot.add("O");
        firstCharsNot.add("Q");
        firstCharsNot.add("U");
        firstCharsNot.add("W");
        firstCharsNot.add("Z");

        ArrayList<String> firstChars = new ArrayList<>();   //characters allowed throughout
        firstChars.add("D");
        firstChars.add("F");
        firstChars.add("I");
        firstChars.add("O");
        firstChars.add("Q");
        firstChars.add("U");
        

        //A1A 1A1
        boolean goodPostal = false;
        System.out.println("---Postal Code---");
        while (!goodPostal) {
            //scanner.nextLine();
            String userPostal = scanner.nextLine();

            char space = userPostal.charAt(3);
            boolean isSpace = Character.isSpace(space);
            if (isSpace == false) {
                System.out.println("Invalid, space missing. Try Again");
                userPostal= scanner.nextLine();
            }
            else System.out.println(isSpace + " space");

            char zero = userPostal.charAt(0);
            boolean isCharOne = Character.isLetter(zero);
            System.out.println(isCharOne + " char one");

            char one = userPostal.charAt(1);
            boolean isDigtOne = Character.isDigit(one);
            System.out.println(isDigtOne + " digit one");

            char two = userPostal.charAt(2);
            boolean isCharTwo = Character.isLetter(two);
            System.out.println(isCharTwo + " char two");
            char three = userPostal.charAt(4);
            boolean isDigitTwo = Character.isDigit(three);
            System.out.println(isDigitTwo + " digit two");

            char four = userPostal.charAt(5);
            boolean isCharThree = Character.isLetter(four);
            System.out.println(isCharThree + " char three");

            char five = userPostal.charAt(6);
            boolean isDigitThree = Character.isDigit(five);
            System.out.println(isDigitThree + " digit three");

            if (isCharOne = false) {
                System.out.println("Invalid first character. Try Again");
                System.out.println("---Postal Code!!!---");
                userPostal = scanner.nextLine();
            }
            else if (isDigtOne = false) {
                System.out.println("Invalid first digit. Try Again");
                System.out.println("---Postal Code!!!---");
                userPostal = scanner.nextLine();
            }
            else if (isCharTwo = false) {
                System.out.println("Invalid second character. Try Again");
                System.out.println("---Postal Code!!!---");
                userPostal = scanner.nextLine();
            }
            else if (isDigitTwo = false) {
                System.out.println("Invalid second digit. Try Again");
                System.out.println("---Postal Code!!!---");
                userPostal = scanner.nextLine();
            }
            else if (isCharThree = false) {
                System.out.println("Invalid third character. Try Again");
                System.out.println("---Postal Code!!!---");
                userPostal = scanner.nextLine();
            }
            else if (isDigitThree = false) {
                System.out.println("Invalid third digit. Try Again");
                System.out.println("---Postal Code!!!---");
                userPostal = scanner.nextLine();
            }
            else goodPostal = true;
            //after all checks on postal pass
        }
            
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

                    System.out.println("---Toppings---");
                    System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                    int tops1 = scanner.nextInt();
                    while (tops1 <= 0 && tops1 > 3) {
                        scanner.nextLine();
                        System.out.println("Invalid Number Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                        tops1 = scanner.nextInt();
                    }
                     
                    switch (tops1) {
                        case 1:
                        double pepps = 3.50;
                        System.out.println("Pepperoni chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (small + pepps));
                        System.out.println("Thank You for Ordering");
                        break;
            
                        case 2:
                        double bacon = 4.00;
                        System.out.println("Bacon chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (small + bacon));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 3:
                        double ham = 4.50;
                        System.out.println("Ham chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (small + ham));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 4:
                        double pines = 5.00;
                        System.out.println("Pineapple chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (small + pines));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 5:
                        double cheese = 2.00;
                        System.out.println("Cheesen chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (small + cheese));
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

                    System.out.println("---Toppings---");
                    System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                    int tops2 = scanner.nextInt();

                    while (tops2 <= 0 && tops2 > 3) {
                        scanner.nextLine();
                        System.out.println("Invalid Number Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                        tops2 = scanner.nextInt();
                    }

                    switch (tops2) {
                        case 1:
                        double pepps = 3.50;
                        System.out.println("Pepperoni chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (medium + pepps));
                        System.out.println("Thank You for Ordering");
                        break;
            
                        case 2:
                        double bacon = 4.00;
                        System.out.println("Bacon chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (medium + bacon));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 3:
                        double ham = 4.50;
                        System.out.println("Ham chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (medium + ham));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 4:
                        double pines = 5.00;
                        System.out.println("Pineapple chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (medium + pines));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 5:
                        double cheese = 2.00;
                        System.out.println("Cheese chosen");
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

                    System.out.println("---Toppings---");
                    System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese ");
                    int tops3 = scanner.nextInt();

                    while (tops3 <= 0 && tops3 > 3) {
                        scanner.nextLine();
                        System.out.println("Invalid Number Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                        tops3 = scanner.nextInt();
                    }

                    switch (tops3) {
                        case 1:
                        double pepps = 3.50;
                        System.out.println("Pepperoni chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (large + pepps));
                        System.out.println("Thank You for Ordering");
                        break;
            
                        case 2: 
                        double bacon = 4.00;
                        System.out.println("Bacon chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (large + bacon));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 3:
                        double ham = 4.50;
                        System.out.println("Ham chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (large + ham));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 4:
                        double pines = 5.00;
                        System.out.println("Pineapple chosen");
                        System.out.println("---Order Summary---");
                        System.out.println("Your order costs $" + (large + pines));
                        System.out.println("Thank You for Ordering");
                        break;

                        case 5:
                        double cheese = 2.00;
                        System.out.println("Cheese chosen");
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
                System.out.println(pizChoice);
            }

        //while(pizChoice != "SMALL" || pizChoice != "MEDUIM" || pizChoice != "LARGE"){
           // System.out.println("Invalid choice.");
            //pizChoice = scanner.nextLine();
            //pizChoice.toUpperCase();
       // }

    }
        
    
}