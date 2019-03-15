package ch06;

public class MethodTest {

	public static int firstMethod() {
	//2번 4번
		int a = 100;
		return a;

	}

	public static void main(String[] args) {
		//1
		System.out.println(firstMethod());
		//3번
		int num = firstMethod();
		//5번 ㅋㅎ
		
		System.out.println((num*6));

	}

}
