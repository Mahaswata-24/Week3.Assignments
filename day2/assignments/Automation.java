package week3.day2.assignments;

public class Automation extends MultipleLangauge{

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}

	public void java() {
		System.out.println("Java");
	}

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.python();
		auto.ruby();
		auto.java();
		auto.selenium();
	}

	
	public void selenium() {
		System.out.println("Selenium");
	}
}
 // how i need to call another interface? if interface is more than 1