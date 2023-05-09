
import java.util.*;

class DivisorAndEndsWith{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper limit of the range");
		int n = sc.nextInt();
		System.out.println("Enter the divisor ");
		int d = sc.nextInt();
		System.out.println("All the numbers that is divided by and ends with "+d+" upto "+n+" are");
		int i = d;
		int count = 0;
		while(i <= n){
			int rem = i % 10;
			if(rem == d){
				if(i % d == 0){
					System.out.println(i+" ");
					count++;
				}
			}
			i++;
		}

		System.out.println(count+" ");

	}
}