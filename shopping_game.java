package practice_java;
import java.util.*;
public class shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n>0) {
			int a = s.nextInt();
			int h = s.nextInt();
			winner(a,h);
			n--;
		}
		
	}
	
	public static void winner(int a,int h) {
		
		int curr_amt = 1;
		int ayushs = 0;
		int harshs = 0;
		
		while(true) {
			ayushs += curr_amt;
			curr_amt++;
			harshs += curr_amt;
			curr_amt++;
			
			if(ayushs>a) {
				System.out.println("Harshit");
				break;
			}
			else if(harshs>h) {
				System.out.println("Aayush");
				break;
			}
		}
	}
}
