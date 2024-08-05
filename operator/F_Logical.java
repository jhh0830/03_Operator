package com.kh.operator;

import java.util.Scanner;

// 논리 연산자
public class F_Logical {
	
	/*
	 * * 논리 연산자
	 * 이항 연산자로서, 두 개의 "논리값" 을 연산하는 연산자
	 * 논리값 (논리연산자) 논리값 = 논리값
	 * 
	 * 
	 * [ 종류 ]
	 * AND 연산자 : 논리값 && 논리값 
	 * 				왼쪽, 오른쪽 논리값 모두 "true" 여야만 결과도 "true"
	 * 
	 * OR 연산자 : 논리값 || 논리값
	 * 				왼쪽, 오른쪽 중에 하나라도 "true" 면 결과도 "true"
	 * 
	 * 
	 */
	
	public void method1() {
		
		// 사용자가 키보드로 입력한 정수값이
		// 양수 "이면서 (== 이고)" 짝수인지 확인하기
		// > ~ 이면서, ~ 이고, 그리고 (AND)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		// 판별한 결과를 담아둘 변수
		boolean result = (num > 0) && (num % 2 == 0);
		// > 가독성 측면에서 소괄호로 묶는 것을 더 권장
		System.out.println("사용자가 입력한 값이 양수이면서 짝수입니까? : " + result);
	} // method1 메소드 영역 끝
	
	public void method2() { // method2 메소드 영역 시작
		// 사용자가 키보드로 입력한 정수값이
		// 1 이상 100 이하의 숫자인지 확인해보기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 1 <= num <= 100
		// 이렇게 수학시간처럼 묶어서 표현이 불가능하다.
		// > num 이 1 보다 크거나 같고,
		// > num 이 100 보다 작거나 같습니까?
		
		// 결과를 담을 변수
		
		boolean result = (1 <= num) && (num <= 100); 
		System.out.println("사용자가 입력한 숫자가 "
				+ "1 이상 100이하 인가요? " 
				+ result);
	} // method2 메소드 영역 끝
	public void method3() {// method3 메소드 영역 시작
		
		// 사용자가 키보드로 입력한 값이 'y' 이거나 'Y' 인지 확인하기
		// > ~ 이거나, 또는 (OR)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계속하시려면 y 또는 Y를 입력하세요 : ");
	
		char answer = sc.nextLine().charAt(0);
		// > 'y' 또는 'Y' 또는 그 이외의 문자값이 담겨있을 것
		
		// 결과를 담을 변수 셋팅
		boolean result = answer == 'y' || answer == 'Y' ;
		System.out.println("사용작 입력한 값이 y 또는 Y 입니까 : " + result);
	}	// method3 메소드 영역 끝 
	public void method4() {
		/*
		 * * 논리 연산자의 특징
		 * 1. && : 둘다 true 여야 결과도 true
		 * true && true == true
		 * true && false == false
		 * false && true == false
		 * 2. || : 
		 * true || true == true
		 * true || false == true
		 * false || true == true
		 */
		// * 논리 연산 시 주의 사항
		int num1 = 10;
		boolean result1 = false && (num1 > 0);
		// > 뒤의 비교연산 구문이 Dead code 라고 뜬다.
		// 실행 시 오류가 나지는 않지만 (경고의 뜻)
		// 굳이 결과값은 어차피 false 일텐데
		// 왜 뒤에 코드를 마저 쓰는지 물어보는 것
		
		System.out.println(result1);
		boolean result2 = true || (num1 > 0);
		// > OR 연산도 마찬가지
		
		System.out.println(result1);
		
		// - Dead code : 불필요한 코드, 실행되지 않아도 되는 코드
		//				 불필요한 코드의 실행은 시간과 메모리의 낭비!!
	}
}
