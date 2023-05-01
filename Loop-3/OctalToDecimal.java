import java.util.*;

class OctalToDecimal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Octal number");
		int n = sc.nextInt();
 
        
        	int decimal = 0;
 
        
        	int a = n;
 
        	for (int i = 0; a > 0; i++) {
 
            
            	int temp = a % 10;
 
            
            	double p = Math.pow(8, i);
 

            	decimal += (temp * p);
            	a = a / 10;
        	}
 
        	System.out.print("Decimal of Octal Number " + n + " : " + decimal);
  
	}
}