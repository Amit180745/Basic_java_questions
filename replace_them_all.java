package practice_java;
import java.util.*;

public class replace_them_all {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	}

	public static void convertFive(int n) {

		int digit, sum = 0;
		while (n > 0) {
			digit = n % 10;
			if (digit == 0) {
				digit = 5;
			}
			sum = sum * 10 + digit;
			n = n / 10;
		}
		System.out.print(sum);
	}

}


