import java.util.*;

class AlternatePrime
{
static void altPrime(int n)
{
boolean []prime = new boolean[n + 1];
for(int i = 0; i < prime.length; i++)
    prime[i] = true;
 
for (int p = 2; p * p <= n; p++)
{

    if (prime[p] == true)
    {
        for (int i = p * 2;
                 i <= n; i += p)
            prime[i] = false;
    }
}
 
boolean flag = true;
for (int p = 2; p <= n; p++)
{
    if (prime[p])
    {
        if (flag)
        {
            System.out.print(p + " ");
            flag = false;
        }
        else
        {
            flag = true;
        }
    }
}
}
 

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Following are the alternate" +
                           " prime numbers smaller " +
                            "than or equal to " + n );
    altPrime(n);
}
}
 
