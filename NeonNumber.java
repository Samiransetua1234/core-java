
import java.util.*;

class NeonNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter a Number");
        	int num = sc.nextInt();
        	int sNum = num*num;
		int sum = 0;
		while(sNum>0){
			int d = sNum%10;
			sum += d;
			sNum /= 10;
		}

		if(sum == num) System.out.println(num+" is a Neon number.");
		else System.out.println(num+" is not a Neon number.");
	}
}