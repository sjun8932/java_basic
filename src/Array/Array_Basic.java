package Array;

class Array_Basic {

	public static void main(String[] args) {

		int[] nArr = new int[10];

		// 배열의 모든 공간에 10부터 100까지 채우기 (간격 10)
		nArr[0] = 10;
		nArr[1] = 20;
		nArr[2] = 30;
		nArr[3] = 40;
		nArr[4] = 50;
		nArr[5] = 60;
		nArr[6] = 70;
		nArr[7] = 80;
		nArr[8] = 90;
		nArr[9] = 100;

		System.out.println("==배열 모든 요소==");

		int i = 0;

		while (true) {
			System.out.printf("nArr[%d]: %d\n", i, nArr[i]);
			i++;
			if (i == 10) {
				break;
			}
		}

		int sum = 0;

		i = 0;

		while (true) {
			sum += nArr[i];
			i++;
			if (i == 10) {
				break;
			}
		}
		System.out.println("배열 모든 요소의 총합 : " + sum);
		System.out.println("배열의 크기 : " + (nArr.length));

	}
}
