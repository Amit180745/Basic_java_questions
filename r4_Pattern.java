package practice_java;
import java.util.*;
public class r4_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1;
		while(row<=n) {
			int i=1;
			while(i<=nst) {
				System.out.print("*");
				i++;
			}
			nst++;
			System.out.println();
			row=row+1;
		}

	}

}
