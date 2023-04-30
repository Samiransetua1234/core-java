import java.util.*;

class PrimeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ::");
		int n = sc.nextInt();
		if(primeNumber(n)) 
			System.out.println(n+" is a prime number.");
		else
			System.out.println(n+" is not a prime number.");
	}

	public static boolean primeNumber(int n){

		int m = Math.sqrt(n);

		for(int i = 2; i <= m; i++){
			if(n % i == 0) return false;
		}
       
      	return true;
	}
}