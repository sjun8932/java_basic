package Class;
 
class Main{
		public static void main (String[ ] args) {
			Article a0 = new Article();
			a0.id=1;
			a0.title = "제목 1";
			a0.body= "내용 1";
			System.out.printf("id: %d, title: %s, body: %s", a0.id, a0.title, a0.body);
		}
}

class Article{
	public int id;
	public String title;
	public String body;
}