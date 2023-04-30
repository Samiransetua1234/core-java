import java.util.*;

class ArmstrongNumber{


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ::");
		int n = sc.nextInt();
		if(isArmstrong(n))
			System.out.println("Yes, "+n+" is a Armstrong Number!");
		else
			System.out.println("No, "+n+" is not a Armstrong Number!");
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

		if(sum == n) return true;
		
		return false;
	} 
}