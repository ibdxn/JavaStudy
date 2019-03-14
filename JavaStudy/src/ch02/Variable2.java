package ch02;

public class Variable2 {
	public static void main(String[] args) {
		// 소스코드 정렬 : Shift + ctrl + F
		int a = 10;
		System.out.println("a의 값은? " + a);

		int b = 11;
		System.out.println("b의 값은? " + b);
		int age = 3000;
		// a의 값에 b를 입력
		// 기존 a의 값읶 10은 사라짐
		a = b;
		System.out.println("a의 값은? " + a);
	}

}
