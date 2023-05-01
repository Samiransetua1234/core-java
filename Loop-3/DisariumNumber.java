import java.util.*;

class DisariumNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a = n, sum = 0, p = 0;
		while(a > 0){
			p++;
			a /= 10;
		}
		a = n;
		while(a > 0){
			int d = a % 10;
			int pow = 1;
			for(int i = 1; i <= p; i++){
				pow *=d;
			}
			sum += pow;
			a /= 10;
			p--;
		}
		if(sum == n) System.out.println(n+" is a disirum number");
		else
			System.out.println(n+" is not a disirum number");
	}
}