import java.util.*;

class SumOfSqures{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int n = sc.nextInt();
		int i = 1; long sum = 0;
		while(i <= n){
			sum += i*i;
			i++;
		}
		// sum = (n*(n+1)(2*n+1)/6); using formula
		System.out.println("The sum of squares of first "+n+" natural numbers is ::"+sum);
	}
}