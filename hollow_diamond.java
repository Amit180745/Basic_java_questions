package practice_java;
import java.util.*;
public class hollow_diamond {
    public static void main (String args[]) {
    Scanner s=new Scanner (System.in);
    int n=s.nextInt();
    int row=1;
    int nst=(n*2)/2;
    int nsp=-1;
    while(row<=(n*2)-1){
	int i=1;
	while(i<=nst) {
		System.out.print("*");
		i++;
	}
	int j=1;
	while(j<=nsp) {
		System.out.print(" ");
		j++;
	}
	int k=1;
	if(row==1 || row==2*n-1)  { //(nst=n  is used instead of row==2*n-1)
		k=2;
	}
	while(k<=nst) {
		System.out.print("*");
		k++;
	}
	if(row<n) {
		nst=nst-1;
		nsp=nsp+2;
	}
	else{
		nst=nst+1;
		nsp=nsp-2;
	}
	System.out.println();
	row=row+1;
}
    }
}