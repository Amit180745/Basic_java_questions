package practice_java;
import java.util.Scanner;
public class odd_even_back_in_delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n < n-- ) {
			int t = scanner.nextInt();
			n--;
		int sum1 = 0, sum2 = 0;
		while (t > n) {
			int remain = t % 10;
			if (remain % 2 == 0) {
				sum1 += remain;
			} else {
				sum2 += remain;
			}
			t /= 10;
		}

		if (sum1 % 4 == 0 || sum2 % 3 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		}

	}
}

