package com.kh.operator;

//�� ���� ������
public class D_LogicalNegation {
	/*
	 * * �� ���� ������
	 * ���� �����ڷν�, �� �� (true / false) ��
	 * �ݴ�κ��������ִ� ������ �ϴ� ������
	 * ��, true �� false ��, false �� true �� �ٲ���
	 * 
	 * [ ǥ���� ]
	 * !���� = �ݴ����;
	 * 
	 */
	
	public void method1() {
		
		System.out.println("true �� ���� : " + !true);
		System.out.println("false �� ���� : " + !false);
		
		
		boolean b1 = true;
		boolean b2 = !b1;
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		// ��, �� ���� �����ڴ�
		// �ش� ������ �ݴ�� �������ִ� ���ұ����� ����!!
		//(���� ����� �ڱ� �ڽ����� ���������� ����)

	}
}
