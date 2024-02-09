package practice_java;
import java.util.*;
public class print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int i = 1;
		int count =0;
		int series = 0 ;
		while(count<a) {
			series = 3*i+2;
			if(series%b != 0) {
				System.out.println(series);
				count++;
			}
			i++;

		}
		

	}

}
