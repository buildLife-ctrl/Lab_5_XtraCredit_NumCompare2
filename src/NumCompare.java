import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable
        int firstInteger;
        int secondInteger;

        //asks the user for integers to compare
        System.out.println("Enter your first integer:");
        if (scan.hasNextInt()) {
            firstInteger = scan.nextInt();
            System.out.println("Enter your second integer:");
            if (scan.hasNextInt()) {
                secondInteger = scan.nextInt();
                if (firstInteger > secondInteger) {
                    System.out.println(firstInteger + " is greater than " + secondInteger);
                } else if (firstInteger < secondInteger) {
                    System.out.println(firstInteger + " is less than " + secondInteger);
                } else {
                    System.out.println(firstInteger + " is equal to " + secondInteger);
                }
            } else {
                System.out.println("You have entered an invalid date type.");
                System.exit(0);
            }
        } else {
            System.out.println("You have entered an invalid date type.");
            System.exit(0);
        }
    }
}