
import java.util.*;

class HermonicSeries{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter a Number");
        	int n = sc.nextInt();
        	double sum = 0;
		for(double i = 1; i <=n; i++){
			
			sum += (1/i);
		}
		System.out.println("The sum of the harmonic series upto "+n+" is ::"+sum);	
	}
}