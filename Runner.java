
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // Instantiate a Calc object
        Calc myCalculator = new Calc();

        // Get user input
        Scanner scan = new Scanner(System.in);

        // Get the first number
        double n1 = myCalculator.getValidNumber(
              "Please enter the first number: "
        );

        // Get the second number
        double n2 = myCalculator.getValidNumber(
                 "Please enter the second number: "
        );

        // Pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        // Display the numbers
        System.out.println("\n" + myCalculator);

        // Display the getter methods
        System.out.println("Calling num1 get method: "
                + myCalculator.getNum1());
        System.out.println("Calling num2 get method: "
                + myCalculator.getNum2());

        // Calculate the sum
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        // Calculate the difference
        System.out.println("The difference is: "
                + myCalculator.subtract());

        // Calculate the product
        System.out.println("The product is: "
                + myCalculator.multiply());

        // Calculate the quotient
        System.out.println("The quotient is: "
                + myCalculator.divide());

        scan.close();
    }
}
