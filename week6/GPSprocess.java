package hello;

import java.util.Scanner;

public class GPSprocess {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String result = null;
		while (true)
		{
			String word = in.nextLine();
			if (word.equals("END"))
			{
				break;
			}
			else if (word.indexOf("$GPRMC") == -1)
			{
				continue;
			}
			if (word.lastIndexOf('*') == -1)
			{
				continue;
			}
			int character = word.lastIndexOf('*') + 1;
			String b = word.substring(character);
			int c = Integer.parseInt(b, 16);
			char sum = word.charAt(1);
			for (int i = 1; i < character -2; i++)
			{
				if(sum % 65536 == c && word.indexOf('A') != -1)
				{
					int h = Integer.parseInt(word.substring(7, 9));
					h = (h + 8)% 24;
					if(h < 9)
					{
						result = ("0" + h + ":" + word.substring(9, 11) + ":" + word.substring(11, 13));
					}
					else
					{
						result = (h + ":" + word.substring(9, 11) + ":" + word.substring(11, 13));
					}
				}
			}
			System.out.println(result);
		}

	}

}
