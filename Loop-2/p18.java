
import java.util.*;

class p18{
	public static int hcf(int a, int b) {
		if (b == 0)
			return a;
		else
			return hcf(b, a % b);
	}

	public static int hcf(int a, int b, int c) {

		return hcf(hcf(a, b), c);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int num1 = input.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = input.nextInt();
		System.out.print("Enter Number 3: ");
		int num3 = input.nextInt();
		int hcfOfNumbers = p18.hcf(num1, num2, num3);
		System.out.println("HCF of three numbers " + num1 + "," + num2
				+ " and " + num3 + " is: " + hcfOfNumbers);
	}
}