package ch03;

	 
	public class Operation_04 {
		public static void main(String[] args) {
			// 백의 자리 이하 버리기 (456 => 400 111 => 100)
			// 실행결과 400
			
			
			int num = 456;
			// 첫번째 6 숫자 뜯어내기
			int n1 = num % 10; // 6
			
			// 두번째 5 숫자 뜯어내기
			num = num / 10; // 45		
			int n2 = num % 10; // 5

			// 세번째 3 숫자 뜯어내기
			num = num / 10; // 4
			int n3 = num % 10; // 4
			
			
			
			System.out.println(n1);
			
		}
			 
			 }
			
