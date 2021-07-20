package com.javaex.basics;

import java.util.Scanner;

public class CoditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElsePractice();
//		switchEx();
//		switchEx2();
//		conditionalPractice01();
//		conditionalPractice02();
		switchEx3("TUESDAY");
	}
	
	private static void switchEx3(String day) {
		//	day가 SUNDAY -> 휴식
		//		MONDAY ~ THURSDAY -> 열공
		//		FRIDAY -> 열공 후 불금
		//		SATURDAY -> 주말
		//		그 이외 -> ?
		//	TODO: 이 코드는 나중에 enum 타입으로 개선해 볼 예정
		String act;
		
		switch(day) {
		case "SUNDAY":
			act = "휴식";
			break;
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			act = "열공";
			break;
		case "FRIDAY":
			act = "열공 후 불금";
			break;
		case "SATURDAY":
			act = "주말";
			break;
		default: act = "?";
		}
		System.out.println(day + "에는 " + act);
	}
	
	private static void conditionalPractice01() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scanner.nextInt();
		
		if (score % 3 == 0) 
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		scanner.close();
	}
	
	private static void conditionalPractice02() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scanner.nextInt();
		
		String grade;
		
		if (score >= 90) 
			grade = "A등급";
		else if (score >= 80)
			grade = "B등급";
		else if (score >= 70)
			grade = "C등급";
		else if (score >= 60)
			grade = "D등급";
		else 
			grade = "F등급";
		
		System.out.println(grade);
		scanner.close();
	}
	
	private static void switchEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		
		int month = scanner.nextInt();
		int days = 0; 	//	일수 저장 변수
		
		switch (month) {
		case 2:	//	month == 2
			days = 28;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 0;
		}
		System.out.println(days + "일입니다.");
		scanner.close();
	}
	
	private static void switchEx() {
		//	ifElsePracetice의 switch 버전
		Scanner scanner = 
				new Scanner(System.in);
		System.out.println(
				"과목을 선택하세요");
		System.out.println(
			"(1. 자바, 2. C, 3. C++, 4.파이썬)");
		System.out.print("과목번호:");
		
		int code = scanner.nextInt();
		String message;
		
		switch(code) {
		case 1:	//	code == 1
			message = "R101";
			break;
		case 2:	//	code == 2
			message = "R202";
			break;
		case 3:	//	code == 3
			message = "R303";
			break;
		case 4:	//	code == 4
			message = "R404";
			break;
		default:	//	else문 역할
			message = "상담원에게 문의하세요";
		}
		System.out.println(message);
		scanner.close();
	}
	
	private static void ifElsePractice() {
		Scanner scanner = 
				new Scanner(System.in);
		System.out.println(
				"과목을 선택하세요");
		System.out.println(
			"(1. 자바, 2. C, 3. C++, 4.파이썬)");
		System.out.print("과목번호:");
		
		int code = scanner.nextInt();
		String message;
		//	조건 분기
		if (code == 1) 
			message = "R101";
		else if (code == 2) 
			message = "R202";
		else if (code == 3)
			message = "R303";
		else if (code == 4)
			message = "R404";
		else
			message = "상담원에게 문의하세요.";
		
		System.out.println(message);
		scanner.close();
	}

	private static void ifElseEx() {
//		Scanner로 정수 입력
		// 0, 양수, 음수
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수를 입력하세요.");
		int num = scanner.nextInt();

		// 조건 분기
		// 양수 체크 -> 음수 체크 -> 0
		/*
		 * if (num > 0) { System.out.println("양수입니다."); } else if (num < 0) {
		 * System.out.println("음수입니다."); } else { System.out.println("0입니다."); }
		 */

		// 중첩 if
		// 0체크 -> 0이 아닌것 (양수, 음수)
		if (num == 0)
			System.out.println("0입니다.");
		else {
			// 0이 아닌 것
			if (num > 0)
				System.out.println("양수입니다.");
			else
				System.out.println("음수입니다.");
		}

		scanner.close();
	}

}
