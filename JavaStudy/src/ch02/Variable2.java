package ch02;

public class Variable2 {
	public static void main(String[] args) {
		// �ҽ��ڵ� ���� : Shift + ctrl + F
		int a = 10;
		System.out.println("a�� ����? " + a);

		int b = 11;
		System.out.println("b�� ����? " + b);
		int age = 3000;
		// a�� ���� b�� �Է�
		// ���� a�� ���� 10�� �����
		a = b;
		System.out.println("a�� ����? " + a);
	}

}
