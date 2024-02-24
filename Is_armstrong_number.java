package practice_java;
import java.util.*;
public class Is_armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(isArmstrong(n));
	}
	// Function to calculate the sum of digits raised to the power of their count
	public static int calculateSum(int num) {
		int sum = 0;
		int temp = num;
		int count = 0;

		// Count the number of digits in the number
		while (temp != 0) {
			count++;
			temp = temp / 10;
		}

		// Calculate the sum of digits raised to the power of their count
		temp = num;
		while (temp != 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, count);
			temp = temp / 10;
		}

		return sum;
	}

	public static boolean isArmstrong(int num) {
		return num == calculateSum(num);
	}


}
