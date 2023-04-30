import java.util.*;

class CountDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ::");
		long n = sc.nextLong();

		System.out.println("The no of digits in "+n+" is ::"+countDigit(n));
	}

/* using toString Method
	public static int countDigit(long n){
		String s = Integer.toString(n);

		return s.length();
	}
*/


	public static int countDigit(long n){
		int count = 0;
		while(n > 0){
			count++;
			n /= 10;
		}

		return count;
	}
}