import java.util.*;

class FactorialOfDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int num = sc.nextInt();
		int n = num;
		System.out.println("The factorial of each digit of the number are ::");
		while(n>0){
			int tmp = n % 10;
			System.out.println("The factorial of digit "+tmp+" is: "+ fact(tmp));
			n /= 10;
		}
				
	}

	static int fact(int n){
		if(n == 0) return 1;
		int i = n, f = 1;
		while(n/i!=n){
			f = f*i;
			i--;
		}

		return f;
	}
}