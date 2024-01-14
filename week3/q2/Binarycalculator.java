package hello;

import java.util.Scanner;

public class Binarycalculator {

	public static void main(String[] args) {
		System.out.println("Please enter non negative integer from 0 to 1000000: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		int result = 0;
		int base = 1; // 定义计算二进制数的权值
		int digitPosition = 1;
		while (number > 0)
		{
			int digit = number % 10; //取最右的数字
			int parity = (digit & 1) == (digitPosition & 1)? 1: 0; //判断奇偶性
			result = result + parity * base; 
			base *= 2;
			number = number / 10;
			digitPosition += 1;
		}
		System.out.println(result);

	}

}
