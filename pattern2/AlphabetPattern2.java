import java.util.*;

class AlphabetPattern2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char k = 'A';
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
}