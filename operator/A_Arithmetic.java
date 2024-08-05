package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	/*��� ������
	 * ���� �����ڷν� ���� ����� �켱 ������
	 * �Ϲ� ���� ����� ������ ����
	 * [ ���� ]
	 * + : ����
	 * - : ����
	 * * : ����
	 * / : ������
	 * % : ��ⷯ (Modular), ���������� �������� ���ϴ� ����
	 * 
	 * 
	 * 
	 */
	
	public void method1() {// method1 �޼ҵ� ���� ����
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 + num2 = " + (num1 + num2));
		// > (num1 + num2) �� ��ȣ�� ������� 13 �̶�� ����� ����
		// num1 + num2 �� �׳� ����� ������
		// String ó�� ���� ���� 10 �� 3�� ���̾ ���ڿ���
		// ����ϱ� ������ 103 �� ������ ��
		
		System.out.println("num1 - num2 = " + (num1 - num2));
		// > ������ ��� ��ȣ�� �������� ������
		// String ���� ������ ���ڿ��� 10 �� ���̾���
		// ���� ���ڿ��� ���� 3�� ���� ������ �� ���Ŀ� �Ͼ��
		// ������ �߻��ϴ� �� (���ڿ����� ���ڸ� �E �� ����)
		// (num1 - num2) ó�� ��ȣ�� ������� ��
		
		System.out.println("num1 * num2 = " + num1 * num2);
		System.out.println("num1 / num2 = " + num1 / num2);
		System.out.println("num1 % num2 = " + num1 % num2);
		// > ����, ������, ��ⷯ�� ���
		// ���� (+) ���� �켱������ ���� ������
		// ��ȣ�� ���� �ʴ��� ����� �� ��Ȯ�� ����� ���´�.
		// �ٸ�, �������� ���� ��� ���� �� ��ȣ�� �� �����ִ� ���� ����!!
		
		// * ������� �� ������ ��
		// System.out.println(10 / 0); 
		// System.out.println(10 % 0);
		// > ArithmeticException : / by zero
		// ���а� ���������� 0 ���� ������� ���� �ȵ�!!
		
		// �׻� ��Ģ�� ���� Ÿ���� ���鳢���� ���� �����ϴ�.
		// �׻� ��� ���� ���� Ÿ������ ������ �Ѵ�.
		
		double a = /*(double)*/35; // 35.0
		double b = /*(double)*/10; // 10.0
		// > �ڵ�����ȯ
		
		System.out.println("a + b = " + (a + b));// 45.0
		System.out.println("a - b = " + (a - b));// 25.0
		System.out.println("a * b = " + (a * b));// 350.0
		System.out.println("a / b = " + (a / b));// 3.5
		System.out.println("a % b = " + (a % b));// 5.0
		// > ���� 3.0 �̰� , �������� 5.0 �� ��
		
		// ���� ������ ��� ����� ����,
		// �Ǽ� ������ ��� ����� �Ǽ��� ���´�.
		
		
	} // method1 �޼ҵ� ���� ��
	
	// ��������
	public void method2() {
		Scanner sc = new Scanner(System.in);
		// �ο� ���� ������ ������ ���� Ű����� �Է¹޾�
		// 1�δ� �����ϰ� �������� ������ ������ ���� ������ ������ ���
		
		/*
		 * ���࿹��)
		 * �ο� �� : 5
		 * ���� ���� : 164
		 * --------------
		 * 1�δ� ���� ���� : 32
		 * ���� ���� ���� : 4
		 * 
		 */
		System.out.print("�ο� �� : ");
		int person = sc.nextInt();
		sc.nextLine();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		sc.nextLine();
		System.out.println("--------------");
		
		System.out.println("1�δ� ���� ���� : " + (candy / person));
		System.out.println("���� ���� ���� : " + (candy % person));

	}
	
}
