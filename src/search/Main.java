package search;

public class Main {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20 };
		
		int evenNumsLen = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if ( nums[i] % 2 == 0) {
				evenNumsLen++;
			}
		} 
		
		
		int[] evenNums = new int[evenNumsLen];
		
		int evenNumsIndex = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if ( nums[i] % 2 == 0) {
				evenNums[evenNumsIndex] = nums[i];
				evenNumsIndex++;
			}
		}
		
		for (int i= 0; i < evenNums.length; i++) {
			System.out.println(evenNums[i]);
		}
	}
}
