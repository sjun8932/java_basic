package Class;

class Main2 {
	public static void main(String[] args) {
		Article2 a0;
		a0 = new Article2();
		a0.id = 10;
		a0.title = "제목 10";
		Article2 a1 = a0;
		a0.id = 11;
		System.out.println(a1.id);
	}
}

class Article2 {
	public int id;
	public String title;
	
}