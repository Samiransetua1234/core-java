import java.util.*;

class DeficientNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

        	int divisorSum = 0; 
 

        	for (int i = 1; i <= (Math.sqrt(n)); i++) {
            	if (n % i == 0) {
                		if (n / i == i) {
                    		divisorSum = divisorSum + i;
                		}
                		else 
                		{
                    		divisorSum = divisorSum + i;
                    		divisorSum = divisorSum + (n / i);
                		}
            	}
        	}

		if(divisorSum < (2*n))
			System.out.println(n+" is a deficient number.");
		else
			System.out.println(n+" is not a deficient number.");
	}
}