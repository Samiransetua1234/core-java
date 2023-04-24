import java.util.*;

class PerfectNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int n = sc.nextInt();
		int i = 1, sum = 0;
		while(i <= n/2){
			if(n%i == 0) sum+=i;
			i++;
		}
		System.out.println("The sum of all factors of "+n+" is ::"+sum);
		if(sum == n) System.out.println("This is a perfect number");
		
		else
			System.out.println("This is a not perfect number");

		
	}
}