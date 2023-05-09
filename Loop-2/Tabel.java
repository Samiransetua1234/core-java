
import java.util.*;

class Tabel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j =1; j<=10;j++){
			System.out.println(i +" X " +j +" = " +j*i);
		}
		System.out.println("--------------");
        }	
	}
}