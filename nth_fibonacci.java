package practice_java;
import java.util.*;
public class nth_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int a = 0,b = 1, c;
	    int i = 2;
	    while(i<=n) {
	    	c = a + b;
	    	a = b;
	    	b = c;
	    	i++;
	    }
	    if(n == 0) {
	    	System.out.println(a);	
	    }
	    else{
	    	System.out.println(b);
	    }
	}

}
