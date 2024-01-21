package hello;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] polynomial = new int[101];
		int number = 0;
		for (int i = 0; i<2;)
		{
			number = in.nextInt();
			if (number < 0 || number > 100)
			{
				break;
			}
			polynomial[number] += in.nextInt();
			if (number == 0)
			{
				i++;
			}
			
		}
		int sum = 0;
		if (number >= 0 && number <= 100)
		{
			for(int i = polynomial.length - 1, n=0; i>=0; i--)
			{
				sum += polynomial[i];
				if (polynomial[i]==0)
				{
					continue;
				}
				n++;
				if (polynomial[i]>0 && n>1)
				{
					System.out.print("+");
				}
				if (polynomial[i] != 1)
				{
					System.out.print(polynomial[i]);
				}
				if (i != 0)
				{
					System.out.print("x");
				}
				if (i > 1)
				{
					System.out.print(i);
				}
			}
			if (sum == 0)
			{
				System.out.print("0");
			}
		else
		{
			System.out.println("Please enter the integer between [0, 100] range");
		}
		}
		

	}

}
