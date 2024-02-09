package practice_java;
import java.util.*;
public class ai_help1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int nst=1;
		int rowval=1;
		
		while(row<=n) {
			while(nst<=row) {
				System.out.print(rowval+"\t");
				rowval++;
				nst++;
			}
			nst=1;
			System.out.println();
			row++;
		}

	}

}
