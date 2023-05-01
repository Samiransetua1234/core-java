import java.util.*;

class HarshadNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		int sum = 0;
        	for (int temp = n; temp > 0; temp /= 10)
            	sum += temp % 10;


       	if (n % sum == 0)
          		System.out.println(n +" is a Harshad number");
       	else
          		System.out.println(n +" is not a Harshad number");
	}
}