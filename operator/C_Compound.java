package com.kh.operator;

// 복합 대입 연산자(산술 대입)
public class C_Compound {
	
	/*
	 * * 복합 대입 연산자 (산술 대입)
	 * 이항 연산자로써, 산술 연산자와 대입 연산자를
	 * 함께 사용하는 연산자
	 * 즉, 산술 연산 후 그 결과를 자기 자신한테 "대입" 까지 해주겠다.
	 * 
	 * [ 종류 ]
	 * +=, -=, *=, /=, %=
	 * 
	 * 
	 * [ 표현법 ] 
	 * a += 3; // a =  a + 3;
	 * 즉, 기존의 a 값에 3 을 더해서 a 에 그 결과를
	 * 다시 대입해주겠다 라는 뜻임!!
	 * 
	 * 
	 */
	public void method1() {
		int num = 12;
		
		System.out.println("현재 num : " + num);
		
		// num 을 3 증가시키기
		num = num + 3;
		System.out.println("3 증가 시킨 num : " + num);
		
		// num 을 3 증가시키기
		num += 3;
		
		System.out.println("또 3 증가 시킨 num : " + num);
		
		
		// num 을 5 감소시키기
		num -= 5; // num = nmu - 5; 와 같은 뜻
		System.out.println("5 감소시킨 num : " + num);
		
		// num 을 6배 증가시키기
		num *= 6; // num = num * 6; 와 같은 뜻
		
		
		System.out.println("6배 증가시킨 num : " + num);
		
		// num 을 2배 감소시키기
		num /= 2; // num = num / 2;
		
		System.out.println("2배 감소시킨 num : " + num);
		
		// num 을 4로 나눴을 때의 나머지를 num에 대입
		num %= 4; // num = num % 4; 와 같은 뜻
		
		System.out.println("최종 num ; " + num);
		
		// += 의 경우 "문자열 접합" 도 가능하다.
		String str = "Hello";
		
		str = str + "World";
		System.out.println(str);
		
	}
}
