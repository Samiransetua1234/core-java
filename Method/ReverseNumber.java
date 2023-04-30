import java.util.*;

class ReverseNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ::");
		long n = sc.nextLong();

		System.out.println("The reversed number is :: "+reverse(n));
	}

	public static long reverse(long n){
       
      long rev = 0; 
      int rem;   
       
      while(n>0){
          
        rem = (int)n%10;
        rev = (rev*10) + rem;
        n = n/10;
      }
       
      return rev;
    }
}