import java.util.*;

class PerfectNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ::");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("All the perfect numbers till "+n+" are::");
		for(int i = 1; i <= n; i++){
			if(isPerfect(i)){
				System.out.print(i+" ");
				count++;
			}
		}

		System.out.println("So, there are "+count+" perfect numbers till"+n);
	}

	public static boolean isPerfect(int n){
		if(n == 1) return false;

		int sum = 1;

		for(int i = 2; i*i <= n; i++){
			if(n % i == 0){
				if(i*i == n) sum += i;
				else
					sum += i + (n / i);
			}
		}

		if(sum == n) return true;

		return false;
	}
}