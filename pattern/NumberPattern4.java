import java.util.*;

class NumberPattern4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n; i > 0; i--){
			for(int j = 1; j <= n; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}