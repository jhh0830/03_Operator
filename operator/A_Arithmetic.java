package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	/*산술 연산자
	 * 이항 연산자로써 연산 방법과 우선 순위가
	 * 일반 수학 산술과 완전히 동일
	 * [ 종류 ]
	 * + : 덧셈
	 * - : 뺄셈
	 * * : 곱셈
	 * / : 나눗셈
	 * % : 모듈러 (Modular), 나눗셈에서 나머지를 구하는 개념
	 * 
	 * 
	 * 
	 */
	
	public void method1() {// method1 메소드 영역 시작
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 + num2 = " + (num1 + num2));
		// > (num1 + num2) 를 괄호로 묶어줘야 13 이라는 결과가 나옴
		// num1 + num2 로 그냥 출력해 버리면
		// String 처럼 각각 숫자 10 과 3를 연이어서 문자열로
		// 출력하기 때문에 103 이 나오는 것
		
		System.out.println("num1 - num2 = " + (num1 - num2));
		// > 뺄셈의 경우 괄호로 묶어주지 않으면
		// String 으로 앞쪽의 문자열과 10 을 연이어줌
		// 엮인 문자열과 숫자 3을 빼는 연산이 그 이후에 일어나서
		// 오류가 발생하는 것 (문자열에서 숫자를 뺼 수 없음)
		// (num1 - num2) 처럼 괄호로 묶어줘야 함
		
		System.out.println("num1 * num2 = " + num1 * num2);
		System.out.println("num1 / num2 = " + num1 / num2);
		System.out.println("num1 % num2 = " + num1 % num2);
		// > 곱섬, 나눗셈, 모듈러의 경우
		// 덧셈 (+) 보다 우선순위가 높기 때문에
		// 괄호로 묶지 않더라도 제대로 된 정확한 결과가 나온다.
		// 다만, 가독성을 위해 모든 연산 시 괄호로 다 묶어주는 것을 권장!!
		
		// * 산술연산 시 주의할 점
		// System.out.println(10 / 0); 
		// System.out.println(10 % 0);
		// > ArithmeticException : / by zero
		// 수학과 마찬가지로 0 으로 나누기는 절대 안됨!!
		
		// 항상 원칙상 같은 타입의 값들끼리만 연산 가능하다.
		// 항상 결과 또한 같은 타입으로 나오게 한다.
		
		double a = /*(double)*/35; // 35.0
		double b = /*(double)*/10; // 10.0
		// > 자동형변환
		
		System.out.println("a + b = " + (a + b));// 45.0
		System.out.println("a - b = " + (a - b));// 25.0
		System.out.println("a * b = " + (a * b));// 350.0
		System.out.println("a / b = " + (a / b));// 3.5
		System.out.println("a % b = " + (a % b));// 5.0
		// > 몫은 3.0 이고 , 나머지는 5.0 이 됨
		
		// 정수 끼리의 계산 결과는 정수,
		// 실수 끼리의 계산 결과는 실수로 나온다.
		
		
	} // method1 메소드 영역 끝
	
	// 연습문제
	public void method2() {
		Scanner sc = new Scanner(System.in);
		// 인원 수와 사탕의 갯수를 각각 키보드로 입력받아
		// 1인당 동일하게 나눠가진 사탕의 갯수와 남은 사턍의 갯수를 출력
		
		/*
		 * 실행예시)
		 * 인원 수 : 5
		 * 사탕 갯수 : 164
		 * --------------
		 * 1인당 사탕 갯수 : 32
		 * 남는 사탕 갯수 : 4
		 * 
		 */
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		sc.nextLine();
		System.out.print("사탕 갯수 : ");
		int candy = sc.nextInt();
		sc.nextLine();
		System.out.println("--------------");
		
		System.out.println("1인당 사탕 갯수 : " + (candy / person));
		System.out.println("남는 사탕 갯수 : " + (candy % person));

	}
	
}
