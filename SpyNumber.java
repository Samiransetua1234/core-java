
import java.util.*;

class SpyNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter a Number");
        	int num = sc.nextInt();
        	int n = num;
		int sum = 0, prd=1;
		while(n>0){
			int d = n%10;
			sum += d;
			prd *= d;
			n /= 10;
		}

		if(sum == prd) System.out.println(num+" is a Spy number.");
		else System.out.println(num+" is not a Spy number.");
	}
}