package com.kh.operator;

import java.util.Scanner;
//> Ctrl + Shift + O : import ���� �ڵ��ϼ� ����Ű
public class G_Triple {
	
	/*
	 * * ���� ������
	 * 3���� �׸��� ������ �����ϴ� ������
	 * 
	 * [ ǥ���� ]
	 * (���ǽ�) ? (���ǽİ����true�ϰ���ǰ����) : (���ǽİ����fasle�ϰ���ǰ����)
	 * 
	 * - ���ǽ� : ���� ����� true �ƴϸ� false �� ������ ��
	 *  
	 *  
	 */
	public void method1() {// method1 �޼ҵ� ���� ����
		Scanner sc = new Scanner(System.in);
		//����ڰ� �Է��� �������� ������� �ƴ����� �Ǻ� ��
		// �׿� �´� ��� ���
		
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// ����� ��� "����Դϴ�."
		// ����� �ƴ� ��� "����� �ƴմϴ�."
		// > ����� String Ÿ�� ���� ǥ���غ����� ��!!
		
		//String result = (num > 0 ) ? ("����Դϴ�.") : ("�����Դϴ�.");
		//System.out.print(num+ " ��(��) " + result);
		
		//System.out.println(num + "��(��)" +( (num > 0 )?("����Դϴ�."):("����� �ƴմϴ�.")));
		// > ���׿����ڰ� ������꺸�� �켱������ ���Ƽ� ������ �߻���
		//   ���� ���� �κ��� ��ȣ�� �����ش�!!
		
		String result = (num <= 0) ? ("����� �ƴմϴ�") : ("����Դϴ�.");
		System.out.println(num + "��(��)" + result);
		// ��������� ���� ����� ���������
		// ���ǽ� ����� ���� ��, ���� ����� �ٸ��Ƿ�
		// ���ʰ� �������� ������ �ٸ� ���� �ִ�.
	} // method1 �޼ҵ� ���� ��
	
	// ����
	public void method2() {// method2 �޼ҵ� ���� ����
		// ����ڰ� Ű����� �Է��� ��������
		// ¦������ Ȧ������ �Ǻ� �� ���
		
		// ¦���� ��� "¦���Դϴ�."
		// Ȧ���� ��� "Ȧ���Դϴ�."
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		String result = (num % 2 ==0) ? ("¦���Դϴ�") : ("Ȧ���Դϴ�.");
		System.out.println(num + " ��(��)" + result);
		//printf �������ε� �غ���
		System.out.printf("%d ��(��) %s\n", num,result);
		//%s�� result�� ������� ���ڿ��̶� %s�� �޾��ִ°Ű���.
		
	}// method2 �޼ҵ� ���� ��
	
	public void method3() {//method3 �޼ҵ� ���� ����
		Scanner sc = new Scanner(System.in);
		// ����ڷκ��� Ű����� ������ �ϳ��� �Է¹޾�
		// �빮������ �빮�ڰ� �ƴ��� �Ǻ� �� ���
		// > "�ƽ�Ű�ڵ�ǥ" ����
		
		System.out.print("������ �Ѱ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		// > ch ���� ����ڰ� �Է��� ���ڰ� �������
		// 'A', 'a', '!', '1', '��', ....
		
		// �빮���� ��� "�빮�� �Դϴ�."
		// �빮�ڰ� �ƴ� ��� "�빮�ڰ� �ƴմϴ�."
		
		// ����� ���� ����
		// �빮�ڴ� �ƽ�Ű�ڵ�ǥ ��������
		// (A~Z) 'A'~'Z' 65~90
		// 64 <= ch <=90
		
		String result = (('A' <= ch && ch <='Z'))?("�빮�� �Դϴ�."):("�빮�ڰ� �ƴմϴ�.");
		
		System.out.println("����ڰ� �Է��� �����ڴ� "+ result);
		
		System.out.printf("����ڰ� �Է��� �����ڴ� %s\n", result);
		
	}// method3 �޼ҵ� ���� ��
	// method1 �� ���� ����
	public void method4() {
		
		// ����ڷκ��� �Է¹��� ��������
		// �������, 0������ �������� �Ǻ� �� ��� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// ����� ��� "����Դϴ�."
		// 0�� ��� "0�Դϴ�."
		// ������ ��� "�����Դϴ�."
		
		
		
		// ����� ���� ����
		String result = ( 0 < num )?(" ����Դϴ�. "):((num == 0)?(" 0�Դϴ�. "):( " ���� �Դϴ�. "));
		System.out.printf("����ڰ� �Է��� ������ : %s\n", result);
		// > ���׿����ڴ� �⺻������ 2������ ����� ��
		// (true �Ǵ� false) �� ǥ�� �����ϴ�.
		// ��, ���׿����ڸ� "��ø" �ؼ� ����Ѵٸ�
		// 3�� �̻��� ����� �� ���� ��Ÿ�� �� �ְ� �ȴ�.
		
		
	}
}
