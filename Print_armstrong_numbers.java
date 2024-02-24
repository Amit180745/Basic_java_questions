package practice_java;

import java.util.*;

public class Print_armstrong_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		long n1 = scanner.nextLong();
		long n2 = scanner.nextLong();

		for (long i = n1; i <= n2; i++) {
			if (isArmstrongNumber(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isArmstrongNumber(long n) {
		int digits = 0;
		long num = n;

		// Calculate no of digits in n
		while (num > 0) {
			num /= 10;
			++digits;
		}

		// find out Armstrong sum for n, sum = (each digit ^ digits)
		long sum = 0;
		num = n;
		while (num > 0) {
			long r = num % 10;
			num /= 10;
			sum += Math.pow(r, digits);
		}

		// check if the number is Armstrong or not
		return sum == n;
	}

}
