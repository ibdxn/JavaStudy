package ch03;


public class Operation2 {
	public static void main(String[] args) {
		int num = 2324; 
		
		
		
		// ù��° 4 ���� ����
		int n1 = num % 10; //4
		
		
		// �ι�° ���� ����
		num = num / 10; // 232
		int n2 = num % 10; //2
		
		// ����° ���� ����
		num = num / 10; //23
		int n3 = num % 10; //3
		
		// �׹�° ���� ���� 
		num = num / 10; //2 
		int n4 = num % 10; //4
		
		System.out.println(n1+n2+n3+n4);
		
		
	
	}
	}

