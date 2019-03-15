package ch06;

public class Compute {
	public static void main(String[] args) {
		int sum = sum(10);
		double avg = average(sum);
		System.out.println("DB에");
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

//일을 시켜서 일한 결과 sum받아서 avg 실행해야할떄 보고받아야하니까 return필요