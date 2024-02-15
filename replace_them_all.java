package practice_java;
import java.util.*;

public class replace_them_all {
    public static void main(String[] args) {
    	   Scanner s = new Scanner(System.in);
           long n = s.nextLong();
           
           if (n == 0) {
               System.out.println("5");
           } else {
               long a = 0;
               long ans = 0;
               while (n > 0) {
                   long d = n % 10;
                   if (d == 0) {
                       d = 5;
                   }
                   long temp = (long)(d * Math.pow(10, ans));
                   a += temp;
                   n /= 10;
                   ans++;
               }
               System.out.println(a);
           }
        }

    }

