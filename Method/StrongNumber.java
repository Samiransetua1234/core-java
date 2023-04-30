import java.util.*;

class StrongNumber{

	static int f[] = new int[10];

	public static void preCompute(){
		f[0] = f[1] = 1;
		for(int i = 2; i < 10; i++){
			f[i] = f[i-1]*i;
		}
	
	}

	public static boolean isStrong(int n){
		int tmp = n, sum = 0;
		while(tmp > 0){
			sum += f[tmp % 10];
			tmp /= 10;
		}

		return (sum == n);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ::");
		int n = sc.nextInt();
		preCompute();
		if(isStrong(n))
			System.out.println("Yes, "+n+" is a Strong Number");
		else
			System.out.println("No, "+n+" is not a Strong Number");
	}

//Time Complexity: O(logn)
//Auxiliary Space: O(1) 
}