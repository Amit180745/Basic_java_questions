package practice_java;
import java.util.*;
public class fahrenheit_to_celcius_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int min = s.nextInt();
		int max = s.nextInt();
		int step = s.nextInt();
		
		while(min<=max) {
			int c = (min-32)*5/9;
			System.out.print(min+" ");
			System.out.println(c);
			min +=step;
		}

	}

}
