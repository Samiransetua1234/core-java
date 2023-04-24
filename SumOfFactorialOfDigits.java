import java.util.*;

class SumOfFactorialOfDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int num = sc.nextInt();
		int n = num, sum = 0;
		System.out.println("The factorial of each digit of"+num+" are ::");
		while(n>0){
			int tmp = n % 10;
			int tmp2 = fact(tmp);
			sum += tmp2;
			System.out.println("The factorial of digit "+tmp+" is: "+tmp2 );
			n /= 10;
		}
		System.out.println("The sum of factorial of each digit of "+num+" is :: "+sum);		
	}

	static int fact(int n){

		return (n ==0||n==1)? 1: n*fact(n-1);
	}
}