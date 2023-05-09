import java.util.*;

class Fibonaci{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ::");
		int n = sc.nextInt();
		int a = 0, b = 1, c;
		System.out.println("The fibonaci series of "+n+" numbers is::");
		if(n == 1) System.out.println(a+" ");
		System.out.print(b+" ");
		for(int i = 2; i <= n; i++){
			c = a + b;
			System.out.print( c+" ");
			a = b;
			b = c;
		}
	}
}