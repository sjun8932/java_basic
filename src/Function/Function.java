package Function;

public class Function {

	public static void main(String[] args) {
		new App().run();
	}
}

class App{
	void run() {
		Calculator calculator = new Calculator();
		int rs1 = calculator.plus(100, 200, 300, "50");
		System.out.printf("rs1 : %d\n" , rs1);
		
		int rs2 = calculator.plus(100, 20, 30, "50");
		System.out.printf("rs2: %d\n", rs2);
		
		String rs3 = calculator.plus2(100,20,30,"50");
		System.out.printf("rs3: %s\n", rs3);

	};
}


class Calculator{
		int plus (int a, int b, int c, String d) {
			return a+b+c+Integer.parseInt(d);
		}
		
		String plus2 (int a, int b, int c, String d) {
			return a+b+c+Integer.parseInt(d)+"";
		}
}