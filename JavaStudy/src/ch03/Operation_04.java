package ch03;

	 
	public class Operation_04 {
		public static void main(String[] args) {
			// ���� �ڸ� ���� ������ (456 => 400 111 => 100)
			// ������ 400
			
			
			int num = 456;
			// ù��° 6 ���� ����
			int n1 = num % 10; // 6
			
			// �ι�° 5 ���� ����
			num = num / 10; // 45		
			int n2 = num % 10; // 5

			// ����° 3 ���� ����
			num = num / 10; // 4
			int n3 = num % 10; // 4
			
			
			
			System.out.println(n1);
			
		}
			 
			 }
			
