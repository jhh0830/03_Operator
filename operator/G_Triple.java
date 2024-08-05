package com.kh.operator;

import java.util.Scanner;
//> Ctrl + Shift + O : import 구문 자동완성 단축키
public class G_Triple {
	
	/*
	 * * 삼항 연산자
	 * 3개의 항목을 가지고 연산하는 연산자
	 * 
	 * [ 표현법 ]
	 * (조건식) ? (조건식결과가true일경우의결과값) : (조건식결과가fasle일경우의결과값)
	 * 
	 * - 조건식 : 연산 결과가 true 아니면 false 로 나오는 식
	 *  
	 *  
	 */
	public void method1() {// method1 메소드 영역 시작
		Scanner sc = new Scanner(System.in);
		//사용자가 입력한 정수값이 양수인지 아닌지를 판별 후
		// 그에 맞는 결과 출력
		
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 양수일 경우 "양수입니다."
		// 양수가 아닐 경우 "양수가 아닙니다."
		// > 결과를 String 타입 으로 표현해보고자 함!!
		
		//String result = (num > 0 ) ? ("양수입니다.") : ("음수입니다.");
		//System.out.print(num+ " 은(는) " + result);
		
		//System.out.println(num + "은(는)" +( (num > 0 )?("양수입니다."):("양수가 아닙니다.")));
		// > 삼항연사자가 산술연산보다 우선순위가 낮아서 오류가 발생함
		//   삼항 연산 부분을 괄호로 묶어준다!!
		
		String result = (num <= 0) ? ("양수가 아닙니다") : ("양수입니다.");
		System.out.println(num + "은(는)" + result);
		// 결과적으로 같은 결과를 출력하지만
		// 조건실 결과에 따라 참, 거짓 결과가 다르므로
		// 왼쪽과 오른쪽의 내용이 다를 수도 있다.
	} // method1 메소드 영역 끝
	
	// 숙제
	public void method2() {// method2 메소드 영역 시작
		// 사용자가 키보드로 입력한 정수값이
		// 짝수인지 홀수인지 판별 후 출력
		
		// 짝수일 경우 "짝수입니다."
		// 홀수일 경우 "홀수입니다."
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		String result = (num % 2 ==0) ? ("짝수입니다") : ("홀수입니다.");
		System.out.println(num + " 은(는)" + result);
		//printf 구문으로도 해보기
		System.out.printf("%d 은(는) %s\n", num,result);
		//%s는 result에 결과값이 문자열이라서 %s로 받아주는거같다.
		
	}// method2 메소드 영역 끝
	
	public void method3() {//method3 메소드 영역 시작
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 키보드로 영문자 하나를 입력받아
		// 대문자인지 대문자가 아닌지 판별 후 출력
		// > "아스키코드표" 참고
		
		System.out.print("영문자 한개 입력 : ");
		char ch = sc.nextLine().charAt(0);
		// > ch 에는 사용자가 입력한 문자가 담겨있음
		// 'A', 'a', '!', '1', '김', ....
		
		// 대문자일 경우 "대문자 입니다."
		// 대문자가 아닐 경우 "대문자가 아닙니다."
		
		// 결과를 담을 변수
		// 대문자는 아스키코드표 기준으로
		// (A~Z) 'A'~'Z' 65~90
		// 64 <= ch <=90
		
		String result = (('A' <= ch && ch <='Z'))?("대문자 입니다."):("대문자가 아닙니다.");
		
		System.out.println("사용자가 입력한 영문자는 "+ result);
		
		System.out.printf("사용자가 입력한 영문자는 %s\n", result);
		
	}// method3 메소드 영역 끝
	// method1 의 내용 보완
	public void method4() {
		
		// 사용자로부터 입력받은 정수값이
		// 양수인지, 0인지ㅡ 음수인지 판별 후 결과 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 양수일 경우 "양수입니다."
		// 0일 경우 "0입니다."
		// 음수일 경우 "음수입니다."
		
		
		
		// 결과를 담을 변수
		String result = ( 0 < num )?(" 양수입니다. "):((num == 0)?(" 0입니다. "):( " 음수 입니다. "));
		System.out.printf("사용자가 입력한 정수는 : %s\n", result);
		// > 삼항연산자는 기본적으로 2가지의 경우의 수
		// (true 또는 false) 만 표현 가능하다.
		// 단, 삼항연산자를 "중첩" 해서 사용한다면
		// 3개 이상의 경우의 수 또한 나타낼 수 있게 된다.
		
		
	}
}
