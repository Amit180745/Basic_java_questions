package practice_java;
import java.util.*;
public class conversion_anytoany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sb  = s.nextInt();
		int db = s.nextInt();
		int num = s.nextInt();
		System.out.println(conversion(num,sb,db));

	}

	public static int conversion(int num,int sb,int db) {
		int ans = 0;
		int mul = 1;
		while(num>0) {
			int rem = num%10;
			ans += rem*mul;
			mul = mul*sb;
			num = num/10;
		}

		mul = 1;
		num = ans;
		ans = 0;
		
		while(num!=0) {
			int rem = num%db;
			ans += rem*mul;
			mul = mul*10;
			num = num/db;
		}
		return ans;
	}

}
