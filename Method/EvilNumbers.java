import java.util.*;

class EvilNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ::");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("All the evil numbers till "+n+" are::");
		for(int i = 1; i <= n; i++){
			if(isEvil(i)){
				System.out.print(i+" ");
				count++;
			}
		}

		System.out.println("So, there are "+count+" evil numbers till"+n);
	}

	public static boolean isEvil(int n){
		if(Integer.bitCount(n) % 2 == 0) return true;
		else
			return false;
	}
}