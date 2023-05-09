
import java.util.*;

class PalindromeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int num = sc.nextInt();
		int n = num, rev = 0;
		while(n > 0){
			int d = n%10;
			rev = (rev*10)+d;
			n /= 10;
		}
		if(rev == num) System.out.println("Yes, the number is palindrome");	
		else 
			System.out.println("No, the number is not palindrome");	
	}
}