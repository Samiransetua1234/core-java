import java.util.*;

class Power{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ::");
		int n = sc.nextInt();
		System.out.println("Enter the power ::");
		int p = sc.nextInt();
		int res = 1;
		for(int i = 1; i <= p; i++){
			res *= n;
		}
		System.out.println(n+" to the power of "+p+" is "+res);
	}
}