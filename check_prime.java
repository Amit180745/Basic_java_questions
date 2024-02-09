package practice_java;
import java.util.*;
public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 2;
		int count = 0;

		while(i<=n/2) {
			if(n%i == 0) {
				count++;
				break;
			}
			i++;
		}

		if(count != 0 || n == 0 || n == 1) {
			System.out.println("Not Prime");
		}
		else{
			System.out.println("Prime");
		}

	}

}
