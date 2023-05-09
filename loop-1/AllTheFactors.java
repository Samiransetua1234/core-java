
import java.util.*;

class AllTheFactors{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int n = sc.nextInt();
		int i = 1, count = 0;
		System.out.println("All the factors of "+n+" are");
		while(i*i <= n){
			if(n % i == 0){ 
				System.out.println(i+" ");
				count++;
			}
			
			i++;
		}
		System.out.println("The no of factors of "+n+" is"+count);
	}
}