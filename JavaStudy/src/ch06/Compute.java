package ch06;

public class Compute {
	public static void main(String[] args) {
		int sum = sum(10);
		double avg = average(sum);
		System.out.println("DB��");
	}

	public static int sum(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + i;

		}
		return sum;
	}

	public static double average(int n) {
		double avg = n / 10;
		return avg;

	}

}

//���� ���Ѽ� ���� ��� sum�޾Ƽ� avg �����ؾ��ҋ� ����޾ƾ��ϴϱ� return�ʿ�