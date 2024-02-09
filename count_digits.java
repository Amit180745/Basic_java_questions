package practice_java;
import java.util.*;
public class count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int n = 0;
		int f = s.nextInt();
		int count = 0;
		
		while(num!=0) {
			n=num%10;
			if(n == f){
				count += 1;
			}
			num /=10;
		}
		System.out.println(count);

	}

}
