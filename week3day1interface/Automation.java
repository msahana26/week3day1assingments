package week3day1interface;

public class Automation extends MultipleLanguage implements TestTool,Language {
	
	

	public void java() {
		System.out.println("java");	
	}

	public void selenium() {
		System.out.println("selenium");	
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
	}
	
public static void main(String[] args) {
		
		Automation auto = new Automation();
		
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();
	}
}
