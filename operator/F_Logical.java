package com.kh.operator;

import java.util.Scanner;

// �� ������
public class F_Logical {
	
	/*
	 * * �� ������
	 * ���� �����ڷμ�, �� ���� "����" �� �����ϴ� ������
	 * ���� (��������) ���� = ����
	 * 
	 * 
	 * [ ���� ]
	 * AND ������ : ���� && ���� 
	 * 				����, ������ ���� ��� "true" ���߸� ����� "true"
	 * 
	 * OR ������ : ���� || ����
	 * 				����, ������ �߿� �ϳ��� "true" �� ����� "true"
	 * 
	 * 
	 */
	
	public void method1() {
		
		// ����ڰ� Ű����� �Է��� ��������
		// ��� "�̸鼭 (== �̰�)" ¦������ Ȯ���ϱ�
		// > ~ �̸鼭, ~ �̰�, �׸��� (AND)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Ѱ� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		// �Ǻ��� ����� ��Ƶ� ����
		boolean result = (num > 0) && (num % 2 == 0);
		// > ������ ���鿡�� �Ұ�ȣ�� ���� ���� �� ����
		System.out.println("����ڰ� �Է��� ���� ����̸鼭 ¦���Դϱ�? : " + result);
	} // method1 �޼ҵ� ���� ��
	
	public void method2() { // method2 �޼ҵ� ���� ����
		// ����ڰ� Ű����� �Է��� ��������
		// 1 �̻� 100 ������ �������� Ȯ���غ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Ѱ� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 1 <= num <= 100
		// �̷��� ���нð�ó�� ��� ǥ���� �Ұ����ϴ�.
		// > num �� 1 ���� ũ�ų� ����,
		// > num �� 100 ���� �۰ų� �����ϱ�?
		
		// ����� ���� ����
		
		boolean result = (1 <= num) && (num <= 100); 
		System.out.println("����ڰ� �Է��� ���ڰ� "
				+ "1 �̻� 100���� �ΰ���? " 
				+ result);
	} // method2 �޼ҵ� ���� ��
	public void method3() {// method3 �޼ҵ� ���� ����
		
		// ����ڰ� Ű����� �Է��� ���� 'y' �̰ų� 'Y' ���� Ȯ���ϱ�
		// > ~ �̰ų�, �Ǵ� (OR)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ͻ÷��� y �Ǵ� Y�� �Է��ϼ��� : ");
	
		char answer = sc.nextLine().charAt(0);
		// > 'y' �Ǵ� 'Y' �Ǵ� �� �̿��� ���ڰ��� ������� ��
		
		// ����� ���� ���� ����
		boolean result = answer == 'y' || answer == 'Y' ;
		System.out.println("����� �Է��� ���� y �Ǵ� Y �Դϱ� : " + result);
	}	// method3 �޼ҵ� ���� �� 
	public void method4() {
		/*
		 * * �� �������� Ư¡
		 * 1. && : �Ѵ� true ���� ����� true
		 * true && true == true
		 * true && false == false
		 * false && true == false
		 * 2. || : 
		 * true || true == true
		 * true || false == true
		 * false || true == true
		 */
		// * �� ���� �� ���� ����
		int num1 = 10;
		boolean result1 = false && (num1 > 0);
		// > ���� �񱳿��� ������ Dead code ��� ���.
		// ���� �� ������ ������ ������ (����� ��)
		// ���� ������� ������ false ���ٵ�
		// �� �ڿ� �ڵ带 ���� ������ ����� ��
		
		System.out.println(result1);
		boolean result2 = true || (num1 > 0);
		// > OR ���굵 ��������
		
		System.out.println(result1);
		
		// - Dead code : ���ʿ��� �ڵ�, ������� �ʾƵ� �Ǵ� �ڵ�
		//				 ���ʿ��� �ڵ��� ������ �ð��� �޸��� ����!!
	}
}
