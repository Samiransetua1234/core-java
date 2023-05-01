
import java.util.*;

class EvilNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int num = n;
		if (Integer.bitCount(num) % 2 == 1)
            	System.out.println(n + " is not a  Number");
        	else
            	System.out.println(n + " is Evil Number");
			

	}
}