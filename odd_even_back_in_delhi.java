package practice_java;
import java.util.Scanner;
public class odd_even_back_in_delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int numOfCars = s.nextInt();
        s.nextLine(); // Consume newline left-over

        for (int i = 0; i < numOfCars; i++) {
            String carNumber = s.nextLine();
            int sumOfEvenDigits = 0;
            int sumOfOddDigits = 0;

            for (char digit : carNumber.toCharArray()) {
                int number = Character.getNumericValue(digit);
                if (number % 2 == 0) {
                    sumOfEvenDigits += number;
                } else {
                    sumOfOddDigits += number;
                }
            }

            if (sumOfEvenDigits % 4 == 0 || sumOfOddDigits % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

	}

}

