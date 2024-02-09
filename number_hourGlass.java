package practice_java;
import java.util.*;
public class number_hourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	    int n = sc.nextInt();
	    int row = 1;
	    int nsp = 0;
	    int nst = n;
	     
	    while(row<=2*n+1)
	    {
	        int i = 1;
	        while(i<=nsp)
	        {
	          System.out.print("  ");
	          i++;
	        }

	        i = 1;
	        int k = nst;
	        while(i<=nst)
	        {
	          System.out.print(k+" ");
	          i++;
	          k--;
	        }
	        System.out.print("0"+" ");
	        
	        i = 1;
	        while(i<=nst)
	        {
	          System.out.print(i+" ");
	          i++;
	        }
	        if(row >= n+1)
	        {
	          nsp--;
	          nst++;
	        }
	        else
	        {
	          nsp++;
	          nst--;
	        }
	        row++;
	        System.out.println();
	         
	    }
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int row=1;
//        int nst=2*n+1;
//        int nsp=1;
//        int rowval=n;
//        
//        while(row<=2*n+1){
//            int i=1;
//            //left space
//            while(i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            
//            int j=1;
//            //middle numbers
//            
//            int colval=rowval;
//            while(j<=nst){
//                System.out.print(colval+" ");
//                if(j<(nst+1)/2){
//                    colval--;
//                }
//                else{
//                    colval++;
//                }
//                j++;
//            }
//        
//            if(row<=(n*2)/2){
//                nsp+=1;
//                nst-=2;
//                rowval--;
//            }
//            else{
//                nsp-=1;
//                nst+=2;
//                rowval++;
//            }
//            System.out.println();
//            row++;
//        } 

	}

}








//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int rows = 2 * n + 1;
//        int nst = 2 * n + 1;
//        int nsp = 0;
//        int row = 1;
//
//        while (row <= rows) {
//            int val;
//            if (row <= n + 1) {
//                val = n - row + 1;
//            } else {
//                val = row - n - 1;
//            }
//
//            int csp = 1;
//            while (csp <= nsp) {
//                System.out.print("  ");
//                csp++;
//            }
//
//            int cst = 1;
//            while (cst <= nst) {
//                System.out.print(val + " ");
//                if (cst <= nst / 2) {
//                    val--;
//                } else {
//                    val++;
//                }
//                cst++;
//            }
//
//            if (row <= n) {
//                nsp++;
//                nst -= 2;
//            } else {
//                nsp--;
//                nst += 2;
//            }
//
//            System.out.println();
//            row++;
//        }
//    }
//}
