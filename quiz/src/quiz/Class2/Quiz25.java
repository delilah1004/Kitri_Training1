package quiz.Class2;

class Song {
	private String title;
	
	public Song(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}

public class Quiz25 {
	public static void main(String[] args) {
		Song mySong = new Song("Let it go");
		Song yourSong=new Song("강남스타일"); 
		System.out.println("내 노래는 " + mySong.getTitle()); 
		System.out.println("너 노래는 " + yourSong.getTitle());
	}
}