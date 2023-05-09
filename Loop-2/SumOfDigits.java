import java.util.*;

class SumOfDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int num = sc.nextInt();
		int n = num;
		int sum = 0;
		while(n>0){
			sum += n%10;
			n /= 10;
		}
		System.out.println("The sum of all digits of "+num+" is ::"+sum);
		
	}
}