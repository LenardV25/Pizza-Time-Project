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
                //scanner.nextLine();
                break;

                case "MAIN":
                input = true;
                //scanner.nextLine();
                break;

                case "HENDERSON":
                input = true;
                //scanner.nextLine();
                break;

                case "MAGNUS":
                input = true;
                //scanner.nextLine();
                break;

                case "MOUNTAIN":
                input = true;
                //gdajgascanner.nextLine();
                break;

                default: 
                System.out.println("We don't deliver to this street, try again.");
                street = scanner.nextLine();
                input = false;
                //break;
                
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

        while (!goodPostal) {
            //scanner.nextLine();
            System.out.println("---Postal Code---");
            String userPostal = scanner.nextLine();

            char zero = userPostal.charAt(0);
            boolean isCharZero = Character.isLetter(zero);

            char one = userPostal.charAt(1);
            boolean isDigtOne = Character.isDigit(one);

            char two = userPostal.charAt(2);
            boolean isCharTwo = Character.isLetter(two);

            char space = userPostal.charAt(3);
            boolean isSpace = Character.isSpace(space);

            char three = userPostal.charAt(4);
            boolean isDigitTwo = Character.isDigit(three);

            char four = userPostal.charAt(5);
            boolean isCharThree = Character.isLetter(four);

            char five = userPostal.charAt(6);
            boolean isDigitThree = Character.isDigit(five);



            if (isCharZero = false) {
                System.out.println("Invalid character. Try Again");
                System.out.println("---Postal Code---");
                userPostal = scanner.nextLine();
            }
            
            
            
            if (isDigtOne = false) {
                goodPostal = false;
            }

            
            if (isCharTwo = false) {
                goodPostal = false;
            }

            
            if (isSpace = false) {
                goodPostal = false;
            }

            
            if (isDigitTwo = false) {
                goodPostal = false;
            }

            
            if (isCharThree = false ) {
                goodPostal = false;
            }

            
            if (isDigitThree = false) {
                goodPostal = false;
            }
            //after all checks on postal pass
            //goodPostal = true;
            
        }

        // while (!goodPostal) {
        //     System.out.println("Postal Code?");
        //     String postal = scanner.nextLine();
            
        //     postal = postal.toUpperCase();
            
        //     char first = postal.charAt(0);
        //     if (firstCharsNot.contains(first)) {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     }
        //     else if (postalNum.contains(first)){
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     } else goodPostal = true;

        //     char sec = postal.charAt(1);
        //     if (postalNum.contains(sec)) {
        //         goodPostal = true;
        //     }
        //     else if (firstChars.contains(sec)) {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     } else goodPostal = true;

        //     char third = postal.charAt(2);
        //     if (firstChars.contains(third)) {
        //         goodPostal = true;
        //     } else if (postalNum.contains(third)) {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     } else{ 
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     } 
           

        //     char between = postal.charAt(3);
        //     boolean isSpace = Character.isSpaceChar(between);
        //     if (isSpace = false) {
        //         System.out.println("Please add a space in between");
        //         goodPostal = false;
        //     } else goodPostal = true;

            
        //     char fourth = postal.charAt(4);
        //     if (postalNum.contains(fourth)){
        //         goodPostal = true;
        //     } else {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     }

        //     char fifth = postal.charAt(5);
        //     if (firstChars.contains(fifth)) {
        //         goodPostal = true;
        //     } else {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     }

        //     char sixthChar = postal.charAt(6);
        //     if (postalNum.contains(sixthChar)) {
        //         goodPostal = true;
        //     } else {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     }
    
        // }
        System.out.println("---Order Customization---");
        System.out.println("1: Small (10 inches) \n2: Medium (14 inches) \n3: Large Pizza (16 inches)");
        int pizChoice = scanner.nextInt();

        while (pizChoice <= 0) {
            System.out.println("Invalid Choice. Try Again");
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
                    switch (tops1) {
                        case 1:
                        double pepps = 3.50;
                        System.out.println("Pepperoni chosen");
                        break;
            
                        case 2:
                        double bacon = 4.00;
                        System.out.println("Bacon chosen");
                        break;

                        case 3:
                        double ham = 4.50;
                        System.out.println("Ham chosen");
                        break;

                        case 4:
                        double pines = 5.00;
                        System.out.println("Pineapple chosen");
                        break;

                        case 5:
                        double cheese = 2.00;
                        System.out.println("Cheesen chosen");
                        break;

                        default:
                        System.out.println("Invalid Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                        tops1 = scanner.nextInt();
                    }
                break;

                case 2:
                    scanner.nextLine();
                    System.out.println("===> Medium Pizza Chosen");
                    double medium = 12.00;
    
                    System.out.println("---Toppings---");
                    System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n 5: Cheese");
                    int tops2 = scanner.nextInt();
                    switch (tops2) {
                        case 1:
                        double pepps = 3.50;
                        System.out.println("Pepperoni chosen");
                        break;
            
                        case 2:
                        double bacon = 4.00;
                        System.out.println("Bacon chosen");
                        break;

                        case 3:
                        double ham = 4.50;
                        System.out.println("Ham chosen");
                        break;

                        case 4:
                        double pines = 5.00;
                        System.out.println("Pineapple chosen");
                        break;

                        case 5:
                        double cheese = 2.00;
                        System.out.println("Cheese chosen");
                        break;

                        default:
                        System.out.println("Invalid Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese");
                        tops2 = scanner.nextInt();
                    }
                break;

                case 3:
                    scanner.nextLine();
                    System.out.println("===> Large Pizza Chosen");


                    System.out.println("---Toppings---");
                    System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n5: Cheese ");
                    int tops3 = scanner.nextInt();
                    switch (tops3) {
                        case 1:
                        double pepps = 3.50;
                        System.out.println("Pepperoni chosen");
                        break;
            
                        case 2: 
                        double bacon = 4.00;
                        System.out.println("Bacon chosen");
                        break;

                        case 3:
                        double ham = 4.50;
                        System.out.println("Ham chosen");
                        break;

                        case 4:
                        double pines = 5.00;
                        System.out.println("Pineapple chosen");
                        break;

                        case 5:
                        double cheese = 2.00;
                        System.out.println("Cheese chosen");

                        default:
                        System.out.println("Invalid Choice. Try Again");
                        System.out.println("1: Pepperoni \n2: Bacon \n3: Ham \n4: Pineapples \n 5: Cheese");
                        tops3 = scanner.nextInt();
                    }
                break;

                default:
                scanner.nextLine();
                System.out.println("Invalid Choice. Try Again");
                System.out.println("1: Small (10 inches) \n2: Medium (14 inches) \n3: Large Pizza (16 inches)");
                pizChoice = scanner.nextInt();
                System.out.println(pizChoice);
            }

        //while(pizChoice != "SMALL" || pizChoice != "MEDUIM" || pizChoice != "LARGE"){
           // System.out.println("Invalid choice.");
            //pizChoice = scanner.nextLine();
            //pizChoice.toUpperCase();
       // }
        

        //System.out.println("---Order Summary---");
        //System.out.println("Your pizza is on the way");

    }
        
    
}