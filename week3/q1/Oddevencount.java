package hello;

import java.util.Scanner;

public class Oddevencount {

	public static void main(String[] args) {
		// 定义输入，输出，奇数个数，偶数个数
		System.out.println("Please enter positive integer range from 0 to 100000 and enter -1 to end the entry: ");
		Scanner in = new Scanner(System.in);
		int evenCount = 0;
		int oddCount = 0;
		
		while (true)
		{
			int number = in.nextInt();
            // 判断用户是否输入-1结束数据输入	
			if (number == -1)
			{
				break;
			}
			// 判断读入数据是否为偶数，用新建变量计数
			if (number % 2 == 0)
			{
				evenCount ++;
			}
			// 判断读入数据是否为奇数，用新建变量计数
			else
			{
				oddCount ++;
			}
		}
		// 输出偶数，奇数个数结果
		System.out.println(evenCount + " " + oddCount);
		

	}

}
