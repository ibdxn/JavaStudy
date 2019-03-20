package 연습;

public class 연습 {
	public static void main(String[] args) {
		returnValue(); /* 메소드만 호출 */
		int value = returnValue(); /* 메소드 호출 후 반환되는 값 변수로 대입 */
//	 String result = returnValue(); /* 사용불가 - 변수타입 */
//	 returnValue("100"); /* 사용불가 - 매개변수 */
	}

	public static int returnValue() {
		System.out.println("메소드 실행");
		return 0; /* 메소드의 반환타입과 반드시 같아야 됨 */
	}
}
