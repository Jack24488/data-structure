package admin;

import java.util.Scanner;  //导入java.util.包中的Scanner类
import java.util.Random; //导入java.util.包中的Random类

public class Getnumbergame {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); //创建reader这个对象
		Random random = new Random(); //创建random这个对象
		System.out.println("请你猜一个1-100内的整数");
		int realNumber = random.nextInt(100) + 1; //限定产生随机数的范围1-100
		int count = 0; //声明count成员变量并赋初值0
		int yourGuess; //声明yourguess成员变量
		System.out.println("请输入你猜测的整数");
		count++;
		yourGuess = reader.nextInt();
		while (yourGuess != realNumber) {
			if (yourGuess > realNumber) {
				System.out.println("猜大了,请再输入你的猜测:");
				yourGuess = reader.nextInt();
				count++;
			} else if (yourGuess < realNumber) {
				System.out.println("猜小了,请再输入你的猜测");
				yourGuess = reader.nextInt();
				count++;
			}

		}
		System.out.println("恭喜你,猜对了.你猜的数字是:" + realNumber);
		System.out.println("你一共猜了" + count + "次");
	}
}
