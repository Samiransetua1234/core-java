import java.util.*;

class DecimalToBinary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

            int binary = 0;
        	int cnt = 0;
        	while (n != 0) {
            	int rem = n % 2;
            	double c = Math.pow(10, cnt);
            	binary += rem * c;
            	n /= 2;
 
            	
            	cnt++;
        	}
       
            System.out.println("The binary number is "+binary);
  
	}
}