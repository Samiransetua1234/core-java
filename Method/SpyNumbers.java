
import java.util.*;

class SpyNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter a Number");
        	int n = sc.nextInt();
		int count = 0;
		System.out.println("All the spy numbers till "+n+" are ::");
        	for(int i = 1; i <= n; i++){
			if(isSpy(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("Total no of Spy numbers till "+n+" is ::"+count);
	}

	public static boolean isSpy(int n){
		int sum = 0, prd=1;
		while(n>0){
			int d = n%10;
			sum += d;
			prd *= d;
			n /= 10;
		}

		return (sum == prd);
	}
}