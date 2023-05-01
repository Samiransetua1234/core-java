import java.util.*;

class AutomorphicNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

        	int N = n;
		int flag = 0;
  
          	if(N < 0) N = -N;
        	int sq = N * N;

        	while (N > 0) {
	
            	if (N % 10 != sq % 10){
                		flag = 1;
 			}
			
            	N /= 10;
            	sq /= 10;
        	}
 		if(flag == 1) System.out.println(n+" is not a Automorphic number.");
        	else
			System.out.println(n+" is a Automorphic number.");
			

	}
}