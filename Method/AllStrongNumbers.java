import java.util.*;

class AllStrongNumbers{

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
		int count = 0;
		System.out.println("All the strong numbers till "+n+" are ::");
		for(int i = 1; i <= n; i++){
			if(isStrong(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("So, there are total "+count+" no of strong numbers.");
	}

//Time Complexity: O(logn)
//Auxiliary Space: O(1) 
}