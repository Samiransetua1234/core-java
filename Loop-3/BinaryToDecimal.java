import java.util.*;

class BinaryToDecimal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

        	int decimal = 0;
 

        	int base = 1;
 
        	int temp = n;
        	while (temp > 0) {
            	int d = temp % 10;
            	temp = temp / 10;
 
            	decimal += d * base;
 
            	base = base * 2;
        	}
       
            System.out.println("The decimal number is "+decimal);
  
	}
}