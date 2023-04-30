
import java.util.*;

class AltSpyNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter a Number");
        	int n = sc.nextInt();
		System.out.println("All the Alternate spy numbers till "+n+" are ::");
        	altSpy(n);
	}

	public static boolean isSpy(int n){
		int sum = 0, prd=1, flag = 0;
		while(n>0){
			int d = n%10;
			sum += d;
			prd *= d;
			n /= 10;
		}

		return (sum == prd);
	}

	public static void altSpy(int n){
		int cnt = 0;

		for(int num = 2; num < n; num++){
			if(isSpy(num)){
				if(cnt % 2 == 0) 
					System.out.print(num+ " ");
				
				cnt++;
			}
		}
	}
}