import java.util.*;

class PerfectNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

        	
  

        	int sum = 1;
  
        	for (int i = 2; i < n; i++) {
            
            	if (n % i == 0) {
                		sum += i;
            	}
            
        	}
  
       
        	if (sum == n || n==1)
            	System.out.println(n+" is a perfect number.");
  
        	else 
			System.out.println(n+" is not a deficient number.");

	}
}