package practice_java;
import java.util.*;
public class bin_to_deci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		int mul=1;
		while(n != 0) {
			int rem = n%10;
			ans = ans+rem*mul;
			mul *= 2;
			n/=10;
		}
		System.out.println(ans);

	}

}
