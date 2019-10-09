package enumjava;

public class Example1 {

	public enum Season {
		WINTER, SPRING, SUMMER, FALL
	}

	public static void main(String[] args) {
		Season[] values = Season.values();
		for (Season s : Season.values())
			System.out.println(s);

	}
}