import java.util.*;

class SumOfNNaturalNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int n = sc.nextInt();
		int i = 1, sum = 0;
		while(i <= n){
			sum += i;
			i++;
		}
		// sum = n*(n+1)/2; using formula
		System.out.println("The sum of first "+n+" natural numbers is ::"+sum);
	}
}