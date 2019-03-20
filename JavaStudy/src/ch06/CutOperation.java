package ch06;

public class CutOperation {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 }; // 2최소값
											// 1번연산 3 2 2 0 0 0 6
		while (true) {

			// 1번 최솟값 알아내기
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] < min && stick[i] > 0) {
					min = stick[i];

				}
			}
			// 2번 최솟값으로 배열요소감소기시키기
			for (int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
			}
			// 3번 배열요소중 0보다ㅓ 큰 요소 개수 알아내기.............................
			int count = 0;
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] > 0)
					count++;
			}
			System.out.println(count);
			if (count == 0)
				break;
		}
	}

}
