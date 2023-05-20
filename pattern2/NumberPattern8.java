import java.util.*;

class NumberPattern8{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = 0;
		for(int i = 1; i <= n; i++){
			int k = h+i;
			h = k;
			for(int j = 1; j <= i; j++){
				System.out.print(k-- +" ");
			}
			System.out.println();
		}
	}
}