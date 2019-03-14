package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for (int i = 0; i < nums.length; i++) 

			{
				int random = (int) (Math.random() * nums.length);
				char temp = nums[0];
				nums[0] = nums[random];
				nums[random] = temp;

			}
		
		System.out.println(nums);

		// 코드 작성
//		 배열 nums 각 요소의 순서가 랜덤으로 섞일 수 있도록 코드 작성

	}

}
