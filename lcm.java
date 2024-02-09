package practice_java;
import java.util.*;
public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int gcd = 1;
		int i=1;
		while(i<=n1 && i<=n2) {
			if(n1%i == 0 && n2%i == 0) {
				gcd = i;
			}
			++i;
		}
		int lcm = (n1*n2)/gcd;
		System.out.println(lcm);


	}

}
