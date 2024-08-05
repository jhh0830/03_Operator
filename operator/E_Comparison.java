package com.kh.operator;

import java.util.Scanner;

public class E_Comparison {

	/*
	 * * 비교 연산자 (관계 연산자)
	 * 이항 연산자로써, 두 개의 값을 가지고 비교해주는 역할
	 * (크고 작음을 비교, 일치함을 비교)
	 * 비교 연산한 결과가 참일 경우 true / 거짓일 경우 false 값을 반환
	 * (아무리 숫자끼리 연산하더라도 결과가 숫자로 나오는게 아니라 논리값으로 나옴)
	 * > 후에 특정 조건을 제시할 수 있는 "조건문" 같은데에서 많이 쓰일 예정
	 * 
	 * [ 종류 ]
	 * - 크고 작음을 비교
	 * a < b : a 가 b 보다 작습니까? (질문)
	 * a > b : a 가 b 보다 큽니까?
	 * a <= b : a 가 b 보다 작거나 같습니까? 
	 * a >= b : a 가 b 보다 크거나 같습니까?
	 * 
	 * - 일치함을 비교
	 * a == b : a 와 b 가 일치합니까?
	 * a != b : a 와 b 가 일치하지 않습니까?
	 * 
	 * 
	 * 
	 */
	
	
	public void method1() { //method1 영역 시작
		int a = 10;
		int b = 25;
		
		System.out.println("a > b : " + (a > b)); // false
		// > 비교 연산자 보다 산술 연산자인 + 가 우선순위가 더 높기 때문에
		// (a > b) 는 괄호로 묶어 우선순위를 높여줘야 함
		
		System.out.println("a <= b : " + (a <= b)); // true
		
		
		boolean result1 =  (a == b);
		// > 비교 연산자 보다 대입 연산자인  = 이 우선순위가 더 낮기 때문에
		//   괄호로 묶지 않아도 코드는 제대로 작동함
		// 단, 가독성을 위해 (a == b) 처럼 괄호로 묶어서 표현하는 것을 권장
		
		
		System.out.println("result1 : " + result1);
		
		boolean result2 = (a != b);
		System.out.println("result2 : " + result2);
		
		// 산술 연산 + 비교 연산
		System.out.println(a - b < 0);
		// > 10 - 25 = -15
		// -15 < 0 --> true
		// > 산술 연산이 우선순위가 더 높기 때문에
		// 산술 연산이 하고 그 결과를 가지고 최정적으로 비교 연산이 진행
		// 단, 가독성을 위해 (a - b) 부분을 괄호로 묶는 것을 권장
		
		// 예시)
		// 어떤 숫자값을 2 로 나누었을 때
		// 나머지값이 0 이냐 1 이냐를
		// 가지고 "짝수"인지 "홀수"인지
		// 즉, 2로 나누었을 때 나머지가 0 이면 2로 나누어 떨어짐 (짝수)
		// 그 반대의 경우 (홀수)
		System.out.println("a 가 짝수입니까 : " + ((a % 2) == 0));
		System.out.println("b 가 홀수입니까 : " + ((b % 2) == 1)); // b % 2 == 1 와 같은 뜻
		// > 어떻게 비교 연산을 하냐에 따라서
		// 결과가 같게 또는 다르게 나올 수도 있다!! (말장난 주의)
		
	
	} //method1 영역 끝
	//응용
	public void method2() { //method2 영역 시작
		
		// 사용자로부터 정수값 한개를 키보드로 입력 받아서
		// 그 정수값이 "양수" 인지 판별
		// 그 정수값이 "짝수" 인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		// 1. "양수" 인지 먼저 판별
		System.out.println("사용자가 입력한 값은 양수입니까? : " + (num > 0));
		// 2. "짝수" 인지 판별 (2 로 나눈 나머지가 0 과 일치하는 모든 수)
		System.out.print("사용자가 입력한 값은 짝수입니까? : " + (num % 2 == 0));
		
		
	}//method2 영역 끝
	
	
}
