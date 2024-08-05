package com.kh.operator;

// ���� ������
public class B_InDecrease {
	
	/*
	 * * ���� ������
	 * ���� �����ڷν�, �ѹ��� ���� 1 ������Ű�ų� �Ǵ�
	 * �ѹ��� ���� 1 ���ҽ�Ű�� ������ ������
	 * (���� �� �ڱ� �ڽ����� �ٽ� "����" �ϴ� �� ������ ������)
	 * [ ���� ]
	 * ++ : ���� 1 "����" ��Ű�� ������
	 * 		++�� (����������), ��++(����������)
	 *  
	 * 
	 * -- : ���� 1 "����" ��Ű�� ������
	 * 		--�� (����������), ��--(����������) 
	 * 
	 * (����������) �� : ����������, �ٸ� ���� �� ���� ������ �Ͼ�ڴ�.
	 * �� (����������) : ����������, �ٸ� ������ ���� ������ �ϰ� �������� ������ �Ͼ�ڴ�.
	 * 
	 */
	
	public void method1() { // method �޼ҵ� ���� ����
		
		int num = 10;
		System.out.println("num : " + num); // 10
		
		num++;
		// > num ������ ���� 1�� ������Ų ��
		// �� ������Ų ���� nym�̶�� ������ �ٽ� "����" �ϰڴ�.
		// ��, num = num  + 1;
		
		System.out.println("����� num : " + num);
		
		num--;
		
		// > num ������ ���� 1�� ���� ��Ų ��
		// �� ���ҽ�Ų ���� num �̶�� �������ٽ� "����" �ϰڴ�.
		// ��, num = num - 1; �� ���� �ǹ�
		
		System.out.println("���ҵ� num : " + num);
		
	} // method �޼ҵ� ���� ��
	
	public void method2() {// method2 �޼ҵ� ���� 
		// ��������
		// ������ ���� ���� �Ͼ�ڴ�.
		int a = 10;
		int b = ++a;
		// > a ���� ���� 1 ���� ��Ų �� a ������ �ٽ� ������ ��
		//   ��  �������� b ������ �����ϰڴ�.
		
		System.out.printf("a : %d, b : %d\n", a , b);
		
		
		// ��������
		// ������ ���� �������� �Ͼ�ڴ�.
		int c = 10;
		int d = c++;
		
		// > d ��� ������ c ������ ���� ���� ������ ��
		//   c ������ ���� 1 ������Ų �� c �� �ٽ� �����ϰڴ�.
		
		System.out.printf("c : %d, d : %d\n", c, d);
		
		// �׻� ���������ڸ� ���� �ڽ��� ���� �� ��� �� ����غ���!!
		
	} // method2 �޼ҵ� ��
	public void method3() {// method3 �޼ҵ� ����
		int num1 = 20;
		int result1 = num1++ * 3;
		// > result1 = 20 * 3; ���� ��
		//   num1 = 20 + 1; ������ �Ͼ ��
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		// > num2 = 20 + ; ������ ���� �Ͼ ��
		// result2 = 21 * 3; ������ �Ͼ ��
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + result2);
	}// method3 �޼ҵ� ��
	public void method4() {
		int a = 5; 
		int b = 10; 
		int c = (++a) + b; 
		int d = c / a; 
		int e = c % a; 
		int f = e++; 
		int g = (--b) + (d--); 
		int h = 2; 
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h); 
		System.out.println("a : " + a); 
		System.out.println("b : " + b); 
		System.out.println("c : " + c); 
		System.out.println("d : " + d); 
		System.out.println("e : " + e); 
		System.out.println("f : " + f); 
		System.out.println("g : " + g); 
		System.out.println("h : " + h); 
		System.out.println("i : " + i);
	}
}
