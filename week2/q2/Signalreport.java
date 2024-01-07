package hello;

import java.util.Scanner;

public class Signalreport {

	public static void main(String[] args) {
//		提示用户输入整数
		System.out.println("Please enter RS integer from 11 to 95: ");
		Scanner in = new Scanner(System.in);
		int rs = in.nextInt();
		int s = rs/10;
		int r = rs%10;
		String strength = null;
		String readability = null;
		String report = null;
		if (rs >= 11)
		{
			if (rs <= 95)
			{
				switch (s)
				{
				case 1:
					strength = "Faint signals, barely perceptible, ";
					break;
				case 2:
					strength = "Very weak signals, ";
					break;
				case 3:
					strength = "Weak signals, ";
					break;
				case 4:
					strength = "Fair signals, ";
					break;
				case 5:
					strength = "Fairly good signals, ";
					break;
				case 6:
					strength = "Good signals, ";
					break;
				case 7:
					strength = "Moderately strong signals, ";
					break;
				case 8:
					strength = "Strong signals, ";
					break;
				case 9:
					strength = "Extremely strong signals, ";
					break;
				}
				switch (r)
				{
				case 1:
					readability = "unreable.";
					break;
				case 2:
					readability = "barely readable, occasional words distinguishable.";
					break;
				case 3:
					readability = "readable with considerable difficulty.";
					break;
				case 4:
					readability = "reable with practically no difficulty.";
					break;
				case 5:
					readability = "perfectly readable.";
					break;
				}
				report = strength + readability;
				System.out.println(report);
			}
			else
			{
				System.out.println("The rs number entered is invalid. Please enter it within the range from 11 to 95");
			}
		}
		else
		{
			System.out.println("The rs number entered is invalid. Please enter it within the range from 11 to 95");
		}
		

	}

}
