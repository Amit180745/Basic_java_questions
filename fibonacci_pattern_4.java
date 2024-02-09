package practice_java;
import java.util.Scanner;
public class fibonacci_pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Fibo1 = 0;
		int Fibo2 = 1;
		int row = 1;
		int nst = 1;
		while (row <= n) {
			int i = 1;
			while (i <= nst) {
				System.out.print(Fibo1 + "\t");     // Print the fibo number
				int Fibo3 = Fibo1 + Fibo2;          // Generate Third Fibo number
				Fibo1 = Fibo2;                      //Update first Fibo number
				Fibo2 = Fibo3;                      //Update third Fibo number
				i++;
			}
			System.out.println();
			row++;
			nst++;
		}
	}
	
}
