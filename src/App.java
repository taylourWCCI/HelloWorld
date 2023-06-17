import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Hello World
        System.out.println("Hello World");

        // Operators and Expressions Practice

        // How many more cups of sugar to make muffins?
        int cupsNeeded = 7;
        int cupsAlreadyIn = 2;
        System.out.println("Lisa needs " + (cupsNeeded - cupsAlreadyIn) + " more cups of sugar!");
        System.out.println("By the way that's way too much sugar for muffins. Is she making cupcakes?");

        // Split the dinner bill
        int numOfPeople = 4;
        int eachPaid = 13;
        System.out.println("Their bill was $" + (numOfPeople * eachPaid) + " dollars!");

        // How many diapers can you buy?
        int diaperCost = 8;
        int fundsAvailable = 40;
        System.out.println("You can buy " + (fundsAvailable / diaperCost) + " packs of diapers.");

        // How much paid to clean attic?
        int startMoney = 29;
        int totalMoney = 41;
        System.out.println("He was paid $" + (totalMoney - startMoney) + ".");

        // How many miles did Pranav run?
        int julia = 47;
        int pranav = julia - 30;
        System.out.println("Pranav ran " + pranav + " miles.");

        // How many envelopes can you buy?
        int boxCost = 3;
        int myFunds = 12;
        System.out.println("You can buy " + (myFunds / boxCost) + " boxes of envelopes.");

        // How much lunch money did he have?
        double saladCost = 5.12;
        double moneyLeftOver = 27.10;
        System.out.println("He had $" + (moneyLeftOver + saladCost) + " available for lunch.");

        // How many students on each bus?
        int totalStudents = 331;
        int studentsInCars = 7;
        int filledBuses = 6;
        System.out.println("There were " + ((totalStudents - studentsInCars) / filledBuses) + " students on each bus.");

        // Switch statement practice
        String ageGroup = "Youngster";
        switch (ageGroup) {
            case "adult": {
                System.out.println("He is an adult.");
                break;
            }
            case "Youngster": {
                System.out.println("He is a kid.");
                break;
            }
            default: {
                System.out.println("Wrong answer.");
                break;
            }
        }
        // Conditionals Practice
        Scanner input = new Scanner(System.in);

        // Question 2
        System.out.println("Question #2");
        System.out.println("Enter first number.");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number.");
        int secondNumber = input.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " and " + secondNumber + " they are equal.");
        } else {
            System.out.println(firstNumber + " and " + secondNumber + " they are not equal.");
        }

        // Questions 3 & 4
        System.out.println("Question #3 & #4");
        System.out.println("Enter an integer.");
        int oddOrEven = input.nextInt();
        if (oddOrEven % 2 == 0) {
            System.out.println("The number " + oddOrEven + " is even.");
        } else {
            System.out.println("The number " + oddOrEven + " is odd.");
        }

        // Question 5
        System.out.println("Question #5");
        System.out.println("Enter first number.");
        int firstNumberB = input.nextInt();
        System.out.println("Enter second number.");
        int secondNumberB = input.nextInt();
        System.out.println("Enter third number.");
        int thirdNumber = input.nextInt();
        if ((firstNumberB + secondNumberB) == thirdNumber) {
            System.out.println(firstNumberB + " and " + secondNumberB + " equals " + (firstNumberB + secondNumberB)
                    + " and that EQUALS the third number, " + thirdNumber);
        } else {
            System.out.println(firstNumberB + " and " + secondNumberB + " equals " + (firstNumberB + secondNumberB)
                    + " and that DOES NOT equal the third number, " + thirdNumber);
        }

        // Question 7
        System.out.println("Question #7");
        System.out.println("Enter a number.");
        int number = input.nextInt();
        if (number >= 0 && number <= 10) {
            System.out.println(number + " is GREATER than 0 and LESS than 10.");
        } else {
            System.out.println(number + " is NOT in range.");
        }
        
        input.close();
    }
}
