package Split;

public class Split {

	public static void main(String[] args) {
		String command = "article detail 1";
		String[] commandBits = command.split(" ");

		System.out.println(commandBits[1]);

		int inputedId = Integer.parseInt(commandBits[2]);
		System.out.println(inputedId);
	}
}
