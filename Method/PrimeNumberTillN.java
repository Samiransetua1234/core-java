import java.util.*;

class PrimeNumberTillN{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Range ::");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("The prime numbers till "+n+" are ::");
		for(int i = 2; i <= n; i++){
			if(primeNumber(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("So, the total no of prime number till "+n+" is ::"+count)
	}

	public static boolean primeNumber(int n){
		int m = (int)Math.sqrt(n);

		for(int i = 2; i <= m; i++){
			if(n % i == 0) return false;
		}
       
      	return true;
	}

	//O(n ^ 3/2)
}