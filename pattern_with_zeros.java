package practice_java;
import java.util.*;
public class pattern_with_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		while (row <= n) {
			if (row > n / 2) {
				System.out.print(row + " ");
				int k = 1;
				while (k <= row - 2) {
					System.out.print("0" + " ");
					k++;
				}
				System.out.print(row);
			} 
			else 
			{
				int j = 1;
				while (j <= row) {
					System.out.print(row + " ");
					j++;
				}
			}
			System.out.println();
			row++;
		}

	}

}
