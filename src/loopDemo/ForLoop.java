package loopDemo;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("Döngü Bitti");
		
		System.out.println("*******************************");
		
		OddNum();

	}
	
	public static void OddNum() {
		
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("Döngü Bitti");
	}

}
