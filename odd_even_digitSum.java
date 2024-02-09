package practice_java;
import java.util.*;
public class odd_even_digitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int pos = 1;
		int odd_sum = 0;
		int even_sum = 0;
		
		while(n>0) {
			int x = n%10;
			n = n/10;
			if(pos%2 == 0) {
				odd_sum += x;
			}
			else {
				even_sum += x;
			}
			pos++;
		}
		System.out.println(even_sum);
		System.out.println(odd_sum);

	}

}
