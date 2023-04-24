
import java.util.*;

class Series9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter a Number");
        	int n = sc.nextInt();
        	int sum = 9, i =2, num = 9;
		System.out.println("The series is ::");
		System.out.print("[ "+9+" + ");
		while(i <= n){
			num = ((num*10)+9);
			if(i==n) System.out.println(num +" ]");
			else System.out.print(num +" + ");
			sum +=num;
			i++;
		}

		System.out.println("The sum of the series is :: "+sum);
	}
}