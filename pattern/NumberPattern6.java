
import java.util.*;

class NumberPattern6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
}