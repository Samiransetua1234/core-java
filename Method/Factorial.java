import java.util.*;

class Factorial{

	static int f[] = new int[16];

	public static void preCompute(){
		f[0] = f[1] = 1;
		for(int i = 2; i < 16; i++){
			f[i] = f[i-1]*i;
		}
	
	}

	public static void main(String[] args){
		preCompute();
		System.out.println("Factorial of all the numbers upto 15 are ::");
		for(int i = 1; i < 16; i++){
			System.out.print(f[i]+", ");
		}
		
	}
}