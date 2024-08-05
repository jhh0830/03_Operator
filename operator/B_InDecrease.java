package com.kh.operator;

// 증감 연산자
public class B_InDecrease {
	
	/*
	 * * 증감 연산자
	 * 단한 연산자로써, 한번에 값을 1 증가시키거나 또는
	 * 한번에 값을 1 감소시키는 역할의 연산자
	 * (연산 후 자기 자신한테 다시 "대입" 하는 것 까지가 역할임)
	 * [ 종류 ]
	 * ++ : 값을 1 "증가" 시키는 연산자
	 * 		++값 (전위연산자), 값++(후위연산자)
	 *  
	 * 
	 * -- : 값을 1 "감소" 시키는 연산자
	 * 		--값 (전위연산자), 값--(후위연산자) 
	 * 
	 * (증감연산자) 값 : 전위연산자, 다른 연산 전 먼저 증감이 일어나겠다.
	 * 값 (증감연산자) : 후위연산자, 다른 연산을 먼저 마무리 하고 마지막에 증감이 일어나겠다.
	 * 
	 */
	
	public void method1() { // method 메소드 영역 시작
		
		int num = 10;
		System.out.println("num : " + num); // 10
		
		num++;
		// > num 변수의 값에 1을 증가시킨 후
		// 그 증가시킨 값을 nym이라는 변수에 다시 "대입" 하겠다.
		// 즉, num = num  + 1;
		
		System.out.println("변경된 num : " + num);
		
		num--;
		
		// > num 변수의 값에 1을 감소 시킨 후
		// 그 감소시킨 값을 num 이라는 변수에다시 "대입" 하겠다.
		// 즉, num = num - 1; 과 같은 의미
		
		System.out.println("감소된 num : " + num);
		
	} // method 메소드 영역 끝
	
	public void method2() {// method2 메소드 시작 
		// 전위연산
		// 증강이 제일 먼저 일어나겠다.
		int a = 10;
		int b = ++a;
		// > a 값을 먼저 1 증가 시킨 후 a 변수에 다시 대입한 후
		//   그  변수값을 b 변수에 대입하겠다.
		
		System.out.printf("a : %d, b : %d\n", a , b);
		
		
		// 후위연산
		// 증강이 제일 마지막에 일어나겠다.
		int c = 10;
		int d = c++;
		
		// > d 라는 변수에 c 변수의 값을 먼저 대입한 후
		//   c 변수의 값을 1 증가ㅣ킨 후 c 에 다시 대입하겠다.
		
		System.out.printf("c : %d, d : %d\n", c, d);
		
		// 항상 후위연산자를 보면 박스로 없는 놈 취급 후 계산해보자!!
		
	} // method2 메소드 끝
	public void method3() {// method3 메소드 시작
		int num1 = 20;
		int result1 = num1++ * 3;
		// > result1 = 20 * 3; 연산 후
		//   num1 = 20 + 1; 연산이 일어난 것
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		// > num2 = 20 + ; 연산이 먼저 일어난 후
		// result2 = 21 * 3; 연산이 일어난 것
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + result2);
	}// method3 메소드 끝
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
