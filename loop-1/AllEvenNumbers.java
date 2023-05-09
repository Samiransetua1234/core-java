import java.util.*;

class AllEvenNumbers{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper limit of the range");
		int i = 1, n = sc.nextInt();
		System.out.println("All the even numbers upto "+n+" are");
		while(i <= n){
			if(i % 2 == 0)
				System.out.println(i+" ");

			i++;
		}
	}
}