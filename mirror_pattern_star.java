package practice_java;
import java.util.*;
public class mirror_pattern_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1;
		int nsp=(n-1)/2;
		
		while(row<=n) {
			
			
			//Print Space
						
			int j=1;
			while(j<=nsp) {
				System.out.print("\t");
				j++;
			}
			
			//Print Star
			
			int k=1;
			while(k<=nst) {
				System.out.print("*"+"\t");
				k++;
			}
			if(row<(n+1)/2) {
				nsp=nsp-1;
				nst=nst+2;
			}
			else {
				nsp=nsp+1;
				nst=nst-2;
			}
			
			row=row+1;
			System.out.println();
		}
		

	}

}
