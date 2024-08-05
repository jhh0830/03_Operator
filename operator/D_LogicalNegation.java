package com.kh.operator;

//논리 부정 연산자
public class D_LogicalNegation {
	/*
	 * * 논리 부정 연산자
	 * 단항 연산자로써, 논리 값 (true / false) 을
	 * 반대로부정시켜주는 역할을 하는 연산자
	 * 즉, true 를 false 로, false 를 true 로 바꿔줌
	 * 
	 * [ 표현법 ]
	 * !논리값 = 반대논리값;
	 * 
	 */
	
	public void method1() {
		
		System.out.println("true 의 부정 : " + !true);
		System.out.println("false 의 부정 : " + !false);
		
		
		boolean b1 = true;
		boolean b2 = !b1;
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		// 즉, 논리 부정 연산자는
		// 해당 논리값을 반대로 뒤집어주는 역할까지만 해줌!!
		//(연산 결과를 자기 자신한테 대입하지는 않음)

	}
}
