package hello;

import java.util.Scanner;

public class UTC {

	public static void main(String[] args) {
		// 提示用户输入换算时间
		System.out.println("Please enter the time range from 0 to 2359 for UTC conversion: ");
		Scanner in = new Scanner(System.in);
		int time = in.nextInt();
		int hour = time/100;
		int minute = time%100;
		int UTChour;
		int UTCtime;
//		validate用户输入的整数是否在允许范围
		if (time >= 0)
		{
			if (time <= 2359)
			{
//				当hour少于等于7时的UTC换算是要加16考虑跨日情况
				if (hour <= 7 )
				{
					UTChour = hour + 16;
					UTCtime = UTChour * 100 + minute;
					System.out.println("UTC time: " + UTCtime);
				}
				else
				{
//					当hour大于7时的UTC换算是要减去8小时
					UTChour = hour - 8;
					UTCtime = UTChour * 100 + minute;
					System.out.println("UTC time: " + UTCtime);
				}
			}
			else
			{
				System.out.println("The time entered is invalid. Please enter within the range from 0 to 2359");
			}
		}
		else
		{
			System.out.println("The time entered is invalid. Please enter within the range from 0 to 2359");
		}

	}

}
