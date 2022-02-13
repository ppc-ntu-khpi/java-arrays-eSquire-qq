package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        
        Scanner in1 = new Scanner(System.in);

        int number = in1.nextInt(), originalNumber = number, remainder = 0, result = 0;

        Calculate(number,originalNumber,remainder, result);
    }
}
