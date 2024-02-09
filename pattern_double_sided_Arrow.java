package practice_java;
import java.util.*;
public class pattern_double_sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nsp1 = n - 1;
		int nsp2 = -1;
		int nst = 1;
		int row = 1;

		while (row <= n) {

			int val;

			if (row <= n / 2 + 1) {
				val = row;
			} else {
				val = n - row + 1;
			}

			int csp = 1;
			while (csp <= nsp1) {
				System.out.print("  ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print(val + " ");
				val--;
				cst++;
			}

			csp = 1;
			while (csp <= nsp2) {
				System.out.print("  ");
				csp++;
			}

			cst = 1;
			val++;
			if (row == 1 || row == n) {
				cst = 2;
			}

			while (cst <= nst) {
				System.out.print(val + " ");
				val++;
				cst++;
			}

			if (row <= n / 2) {
				nsp1 -= 2;
				nst++;
				nsp2 += 2;
			} else {
				nsp1 += 2;
				nst--;
				nsp2 -= 2;
			}

			System.out.println();
			row++;
		}

	}

}

         //  METHOD - 2  USING WHILE LOOP


//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int i = 0;
//        while (i < n / 2) {
//            int j = 1;
//            while (j < n - 2 * i) {
//                System.out.print("  ");
//                j++;
//            }
//
//            int k = i + 1;
//            while (k > 0) {
//                System.out.print(k + " ");
//                k--;
//            }
//
//            int l = 0;
//            while (l < 2 * i - 1) {
//                System.out.print("  ");
//                l++;
//            }
//
//            int m = 1;
//            if (i > 0) {
//                while (m <= i + 1) {
//                    System.out.print(m + " ");
//                    m++;
//                }
//            }
//
//            System.out.println();
//            i++;
//        }
//
//        i = n / 2;
//        while (i >= 0) {
//            int j = 1;
//            while (j < n - 2 * i) {
//                System.out.print("  ");
//                j++;
//            }
//
//            int k = i + 1;
//            while (k > 0) {
//                System.out.print(k + " ");
//                k--;
//            }
//
//            int l = 0;
//            while (l < 2 * i - 1) {
//                System.out.print("  ");
//                l++;
//            }
//
//            int m = 1;
//            if (i > 0) {
//                while (m <= i + 1) {
//                    System.out.print(m + " ");
//                    m++;
//                }
//            }
//
//            System.out.println();
//            i--;
//        }
//    }
//}









//         METHOD - 3 USING FOR LOOP

//Scanner scn = new Scanner(System.in) ;
//int n = scn.nextInt() ;    // number of rows
//int nsp1 = n - 1;       // initializing number of spaces of 1st batch
//int nsp2 = -1;          // initializing number of spaces of 2nd batch
//int nst = 1;            // initializing number of numbers
//
//for (int row = 1; row <= n; row++) {
//
//    int val;     // starting value of numbers
//
//    if (row <= n / 2 + 1) {
//        val = row;               // till mid value is equal to row number
//    } else {
//        val = n - row + 1;     // after mid values are total rows - current row +1
//    }
//
//      // work for spaces
//    for (int csp = 1; csp <= nsp1; csp++) {
//        System.out.print("  ");
//    }
//
//     // work for numbers
//    for (int cst = 1; cst <= nst; cst++) {
//        System.out.print(val + " ");
//        val-- ;
//    }
//
//      // work for spaces
//    for (int csp = 1; csp <= nsp2; csp++) {
//        System.out.print("  ");
//    }
//
//    int cst = 1;
//    val++ ;
//    if (row == 1 || row == n) {
//        cst = 2;
//
//    }
//
//    // work for numbers
//    for (; cst <= nst; cst++) {
//        System.out.print(val + " ");
//        val++ ;
//    }
//
//    //preparation for next iteration
//    if (row <= n / 2) {
//        nsp1 -= 2;
//        nst++;
//        nsp2 += 2;
//    } else {
//        nsp1 += 2;
//        nst--;
//        nsp2 -= 2;
//    }
//    System.out.println();
//}