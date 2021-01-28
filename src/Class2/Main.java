package Class2;

public class Main {

	public static void main(String[] args) {
	
		Article article1;
		article1 = new Article();
		article1.id = 10;
		article1.title="안녕 친구들";
		article1.name="미도";
		article1.자기소개();
		
		Article article2;
		article2 = new Article();
		article2.id = 12;
		article2.title="반가워";
		article2.name="주현";
		article2.자기소개();
	
	
	
	}
}

class Article{
	int id;
	String title;
	String name;
	
	void 자기소개 () {
		System.out.println("=== 자기소개 시작 ===");
		System.out.printf("번호는 %d\n", id);
		System.out.printf("한국말로 %s\n" , title );
		System.out.printf("내 이름은 %s 입니다.\n", name);
	}
}