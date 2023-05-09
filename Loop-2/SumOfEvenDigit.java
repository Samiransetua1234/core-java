import java.util.*;

class SumOfEvenDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int num = sc.nextInt();
		int n = num;
		int sum = 0;
		while(n>0){
			int tmp = n % 10;
			if(tmp % 2 == 0) sum += tmp;
			n /= 10;
		}
		System.out.println("The sum of all even digits of "+num+" is ::"+sum);
		
	}
}