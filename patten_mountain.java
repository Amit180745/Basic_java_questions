package practice_java;

import java.util.Scanner;

public class patten_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1;
		int nsp=2*n-3;
		
		while(row<=n) {
			
			//Print Star
			
			int i=1;
			int colval=1;
			while(i<=nst) {
				System.out.print(colval+"\t");
				colval++;
				i++;
			}
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+"\t");
				j++;
			}
			int k=1;
			int rowval=row;
			if(row==n) {
				rowval=row-1;
				k=2;
			}
			else {
				rowval=row;
				k=1;
			}

			while(k<=nst) {
				System.out.print(rowval+"\t");
				rowval--;
				k++;
			}
			nsp=nsp-2;
			nst=nst+1;
			System.out.println();
			row=row+1;
		}

	}

}
