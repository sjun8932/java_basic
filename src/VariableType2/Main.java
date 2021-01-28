package VariableType2;

public class Main {

	public static void main(String[] args) {
		int i = 10;
		increase(i);
		System.out.println(i); // Q1) 여기서의 i값은 무엇인가?

		int[] iArr = new int[] { 10, 20 };
		System.out.println(iArr[0]); // Q2) 여기서의 iArr[0]의 값은 무엇인가?
		System.out.println(iArr[1]); // Q3) 여기서의 iArr[1]의 값은 무엇인가?

		increase2(iArr);

		System.out.println(iArr[0]); // Q4) 여기서의 iArr[0]의 값은 무엇인가?
	}

	static void increase(int a) { // 여기의 int a 에 6번 줄의 10이 복사됌
		a = 20;
	}

	static void increase2(int[] a) {
		a[0] = 60;
	}

}
