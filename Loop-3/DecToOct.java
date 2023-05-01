
import java.util.*;

class DecToOct{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
        	int octNum = 0, countval = 1;
        	int deciNum = n;
 

        	while (deciNum != 0) {
 

            	int rem = deciNum % 8;
 

            	octNum += rem * countval;
 

            	countval = countval * 10;
            	deciNum /= 8;
        	}
 

        	System.out.println("The HexaDecimal number is "+octNum);			

	}
}