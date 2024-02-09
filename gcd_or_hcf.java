package practice_java;
import java.util.*;
public class gcd_or_hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int divisor = s.nextInt();
		int dividend = s.nextInt();
		
		while(dividend%divisor !=0) {
			int rem = dividend%divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(divisor);

	}

}
