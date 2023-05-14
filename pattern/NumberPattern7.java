
import java.util.*;

class NumberPattern7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 2;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				System.out.print(k +" ");
				k += 2;
			}
			System.out.println();
		}
	}
}