import java.util.*;

class SumOfCubes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int n = sc.nextInt();
		int i = 1; long sum = 0;
		while(i <= n){
			sum += i*i*i;
			i++;
		}
		// sum = ((n*n)*(n+1)*(n+1))/4; using formula
		System.out.println("The sum of cubes of first "+n+" natural numbers is ::"+sum);
	}
}