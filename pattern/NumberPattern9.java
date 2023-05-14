
import java.util.*;

class NumberPattern9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= 3; j++){
				System.out.print(j +" "+i+" ");
			}
			System.out.println();
		}
	}
}