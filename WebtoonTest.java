package ch08;

public class WebtoonTest {

	public static void main(String[] args) {
		Webtoon w1 = new Webtoon("나 혼자만 레벨업업","판타지", "추공님");
		Webtoon w2 = new Webtoon("스위트집","스릴러", "칸비님");
		Webtoon w3 = new Webtoon("이태원 클래식","드라마", "광진님");
		
		Webtoon[] webtoons = {w1, w2, w3};
		
		for(int i = 0; i<webtoons.length;i++) {
			System.out.println(webtoons[i].toStr());
		}
		
		System.out.printf("웹툰 객체의 총 개수: %d", Webtoon.getCount());

	}

}

class Webtoon{
	
	private static int count;
	private String title;
	private String genre;
	private String author;
	
	public Webtoon(String t, String g, String a) {
		Webtoon.count ++;
		title = t;
		genre = g;
		author = a;
	}
	
	public static int getCount() {
		return Webtoon.count;
	}
	
	
	String toStr() {
		return String.format("Webtoon: {title: %s , genre: %s , author: %s}", title, genre, author);
	}
	
}