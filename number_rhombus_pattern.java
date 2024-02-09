package practice_java;

import java.util.Scanner;

public class number_rhombus_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1;
		int nsp=n-1;
		int rowval=1;
		while(row<=(2*n)-1) {
			
			//Print Space			
			int i=1;
			while(i<=nsp) {
				System.out.print("\t");
				i++;
			}
			
			//Print Star
			
			int j=1;
			int colval=rowval;
			while(j<=nst) {
				System.out.print(colval+"\t");
				if(j<(nst+1)/2){
					colval=colval+1;
				}
				else {
					colval=colval-1;
				}
				j++;
			}
			if(row<(2*n)/2) {
				nsp=nsp-1;
				nst=nst+2;
				rowval=rowval+1;
				

			}
			else {
				nsp=nsp+1;
				nst=nst-2;
				rowval=rowval-1;

			}

			row=row+1;
			System.out.println();
		}

	}

}
