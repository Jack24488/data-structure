package admin;

import java.util.Scanner;  //����java.util.���е�Scanner��
import java.util.Random; //����java.util.���е�Random��

public class Getnumbergame {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); //����reader�������
		Random random = new Random(); //����random�������
		System.out.println("�����һ��1-100�ڵ�����");
		int realNumber = random.nextInt(100) + 1; //�޶�����������ķ�Χ1-100
		int count = 0; //����count��Ա����������ֵ0
		int yourGuess; //����yourguess��Ա����
		System.out.println("��������²������");
		count++;
		yourGuess = reader.nextInt();
		while (yourGuess != realNumber) {
			if (yourGuess > realNumber) {
				System.out.println("�´���,����������Ĳ²�:");
				yourGuess = reader.nextInt();
				count++;
			} else if (yourGuess < realNumber) {
				System.out.println("��С��,����������Ĳ²�");
				yourGuess = reader.nextInt();
				count++;
			}

		}
		System.out.println("��ϲ��,�¶���.��µ�������:" + realNumber);
		System.out.println("��һ������" + count + "��");
	}
}
