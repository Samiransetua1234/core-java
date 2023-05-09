
import java.util.*;

class DigitGrtX{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		System.out.println("Enter the digit");
		int digit = sc.nextInt();
		int tmp = n;
		System.out.println("All the digits greater than "+digit);
		while(tmp > 0){
			int d = tmp % 10;
			if(d >= digit){ 
				System.out.println(d+" ");
			}
			tmp /= 10;
		}
	}
}