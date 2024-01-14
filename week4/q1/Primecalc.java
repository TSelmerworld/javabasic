package hello;

import java.util.Scanner;

public class Primecalc {

	public static void main(String[] args) {
		System.out.println("Please enter two integer which between 0 and 200: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int count = 0;
		int number = 2;
		int sum = 0;
		
		while (count < m)
		{
			boolean isPrime = true;
			
			if(number < 2)
			{
				isPrime = false;
			}
			else
			{
				for(int i = 2; i <= Math.sqrt(number); i++)
				{
					if(number % i ==0)
					{
						isPrime = false;
						break;
					}
				}
			}
			if(isPrime)
			{
				count++;
				if(count >= n)
				{
					sum += number;
				}
			}
			number ++;
		}
		System.out.println(sum);

	}

}
