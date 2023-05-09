
import java.util.*;

class EvenDigit{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int count = 0;
		int tmp = n;
		System.out.println("All the even digits in "+n);
		while(tmp > 0){
			int d = tmp % 10;
			if(d % 2 == 0){ 
				System.out.println(d+" ");
				count++;
			}
			tmp /= 10;
		}
		System.out.println(n+" has "+count+" even digits in it.");
	}
}