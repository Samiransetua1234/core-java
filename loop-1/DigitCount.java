
import java.util.*;

class DigitCount{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int count = 0;
		int tmp = n;
		while(tmp > 0){
			count++;
			tmp /= 10;
		}
		System.out.println(n+" has "+count+" digits in it.");
	}
}