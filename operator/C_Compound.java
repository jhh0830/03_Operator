package com.kh.operator;

// ���� ���� ������(��� ����)
public class C_Compound {
	
	/*
	 * * ���� ���� ������ (��� ����)
	 * ���� �����ڷν�, ��� �����ڿ� ���� �����ڸ�
	 * �Բ� ����ϴ� ������
	 * ��, ��� ���� �� �� ����� �ڱ� �ڽ����� "����" ���� ���ְڴ�.
	 * 
	 * [ ���� ]
	 * +=, -=, *=, /=, %=
	 * 
	 * 
	 * [ ǥ���� ] 
	 * a += 3; // a =  a + 3;
	 * ��, ������ a ���� 3 �� ���ؼ� a �� �� �����
	 * �ٽ� �������ְڴ� ��� ����!!
	 * 
	 * 
	 */
	public void method1() {
		int num = 12;
		
		System.out.println("���� num : " + num);
		
		// num �� 3 ������Ű��
		num = num + 3;
		System.out.println("3 ���� ��Ų num : " + num);
		
		// num �� 3 ������Ű��
		num += 3;
		
		System.out.println("�� 3 ���� ��Ų num : " + num);
		
		
		// num �� 5 ���ҽ�Ű��
		num -= 5; // num = nmu - 5; �� ���� ��
		System.out.println("5 ���ҽ�Ų num : " + num);
		
		// num �� 6�� ������Ű��
		num *= 6; // num = num * 6; �� ���� ��
		
		
		System.out.println("6�� ������Ų num : " + num);
		
		// num �� 2�� ���ҽ�Ű��
		num /= 2; // num = num / 2;
		
		System.out.println("2�� ���ҽ�Ų num : " + num);
		
		// num �� 4�� ������ ���� �������� num�� ����
		num %= 4; // num = num % 4; �� ���� ��
		
		System.out.println("���� num ; " + num);
		
		// += �� ��� "���ڿ� ����" �� �����ϴ�.
		String str = "Hello";
		
		str = str + "World";
		System.out.println(str);
		
	}
}
