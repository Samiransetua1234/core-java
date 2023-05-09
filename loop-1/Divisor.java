
import java.util.*;

class Divisor{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper limit of the range");
		int n = sc.nextInt();
		System.out.println("Enter the divisor ");
		int d = sc.nextInt();
		System.out.println("All the numbers that is divided by "+d+" upto "+n+" are");
		int i = d;
		int count = 0;
		while(i <= n){
			if(i % d == 0){
				System.out.println(i+" ");
				count++;
			}
				

			i++;
		}

		System.out.println(count+" ");

	}
}