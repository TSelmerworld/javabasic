package hello;

import java.util.Scanner;

public class PinyinConverter {

    public static void main(String[] args) {
        System.out.println("请输入范围在[-100000,100000]的整数：");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number < 0) {
            System.out.print("fu ");
            number = -number; // 取绝对值
        }

        String[] pinyin = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        int divisor = 10000; // 用于处理万位
        boolean firstDigit = true; // 用于判断是否是第一个数字，以控制空格的输出

        while (divisor >= 1) {
            int digit = number / divisor;
            if (digit != 0) {
                if (!firstDigit) {
                    System.out.print(" ");
                }
                System.out.print(pinyin[digit]);
                firstDigit = false;

                if (divisor > 1) {
                    System.out.print(" ");
                }
            } else if (number <10) {
                System.out.print(" ling");
            }

            number %= divisor;
            if (divisor > 1 && number == 0) {
                System.out.print(" ling");
                break;  // exit the loop when "ling" is printed
            }
            divisor /= 10;
        }

        System.out.println();
    }
}