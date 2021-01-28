package VariableType;

public class Main {

	public static void main(String[] args) {
		// 기본형 변수
		int  a = 10; //정수
		boolean b = 10 == 10; //논리
		double f = 10.5; // 실수
		
		// 참조형 변수
		String s = "123"; // "123"은 "123"그 자체가 아니고 "1"+"2"+"3" 세 값의 합이다. 변수 s 하나에는 세 값이 들어갈 수 없고..  하나의 값이 들어가야 하므로 이를 대체할 리모컨 값 (참조변수)가 들어간다. 이문장은 바로 아래 문장과 같다.
		// String s = new String("123");  12번 문장의 s값과 13번 문장의 s값이 같은 거다. 따라서 스트링 객체가 생기는데 그안에 1과 2와 3이 들어가는 거고 그 객체를 조종할 수 있는 리모컨이 s로 들어가는거다.
		int[] intArr = new int[3];
		// 여기서도 intArr에 리모컨이 하나 들어가는 것일뿐
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		

	}

}
