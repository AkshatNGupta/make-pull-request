import java.util.*;
public class MyClass {
    static boolean isPrime(long n)
    {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
	static void fibonacci(int n)
	{
        long num1 = 1, num2 = 1;
        int counter = 0;
        while (counter < n) {
            if(isPrime(num1) || num1%5==0)
            System.out.print(0 + " ");
            else
            System.out.print(num1 + " ");
            long num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
	}
	public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      fibonacci(n);
	}
}