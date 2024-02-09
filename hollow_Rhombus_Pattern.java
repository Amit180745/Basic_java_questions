package practice_java;
import java.util.*;
public class hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int row = 1;
        
        while ( row <= n ) {
          int j = 1 ;
            while( j <= n - row ) {
                System.out.print(" ");
                j++;
            }
           int k = 1 ;
            while ( k <= n) {
                if (row == 1 || row == n || k == 1 || k == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                k++ ;
            }
            System.out.println();
            row++;
        }

	}

}
