package hello;

import java.util.Scanner;

public class Primefac {
	
	public static boolean isPrime(int n)
	{
		boolean isPrime = true;
		if(n != 2 && n % 2 == 0)
		{
			isPrime = false;
		}
		else
		{
			for (int i = 3; i < n; i += 2)
			{
				if(n % i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
	public static boolean isPerfect(int n)
	{
		int sum = 0;
		boolean number = false;
		if(!isPrime(n))
		{
			for (int i = 1; i < n; i++)
			{
				if(n % i == 0)
				{
					sum += i;
				}
			}
			if(sum == n)
			{
				number = true;
			}
		}
		return number;
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] perfect = new int[60];
		int count = 0;
		for (int i = n; i <= m; i++)
		{
			if (isPrime(i))
			{
				continue;
			}
			else if (isPrime(i))
			{
				perfect[count] = i;
				count ++;
			}
		}
		for (int i = 0; i < count; i++)
		{
			if(perfect[0] != 0)
			{
				System.out.print(perfect[i]);
			}
			else
			{
				System.out.print(" ");
				break;
			}
			if(i < count - 1)
			{
				System.out.print(" ");
			}
		}

	}

}
