import java.util.*;

class AllArmstrongNumbers{


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ::");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("All the Armstrong Numbers till"+n+" are");
		for(int i = 1; i <= n; i++){
			if(isArmstrong(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("So, there are "+count+" Armstrong Numbers till "+n);
	}

	public static int countDigit(int n){
		int count = 0;
		while(n > 0){
			count++;
			n /= 10;
		}

		return count;
	}

	public static int power(int n, int r){
		int pow = 1;
		for(int i = 1; i <= r; i++){
			pow *= n;
		}
		return pow; 
	}

	public static boolean isArmstrong(int n){
		int r = countDigit(n);
		int tmp = n, sum = 0;
		while(tmp > 0){
			int d = tmp % 10;
			sum += power(d, r);
			tmp /= 10;
		}
		
		return (sum == n);
	} 
}