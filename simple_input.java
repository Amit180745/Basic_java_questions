package practice_java;
import java.util.*;
public class simple_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int n = s.nextInt();
            sum = sum + n;
            if (sum < 0) {
                break;
            }
            System.out.println(n);
        }

	}

}
