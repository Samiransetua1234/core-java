import java.util.*;

class HappyNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
       	if (isHappynumber(n))
          	System.out.println(n +
        	" is a Happy number");
       	else
          	System.out.println(n +
        	" is not a Happy number");
	}
     static boolean isHappynumber(int n) {
        if (n == 1 || n == 7)
            return true;
        int sum = n, x = n;
 
        // this loop executes till the sum of square of
        // digits obtained is not a single digit number
        while(sum > 9) {
            sum = 0;
 
            // this loop finds the sum of square of digits
            while (x > 0) {
                int d = x%10;
                sum += d*d;
                x/=10;
            }
            if (sum == 1)
                return true;
            x = sum;
        }
        if(sum == 7)
            return true;
        return false;
    }
}