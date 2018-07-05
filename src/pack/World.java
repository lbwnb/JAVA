package pack;

public class World {
	public static void main(String[] args) {
		int a = 4549;
		boolean b = true;
		for (int i = 2; i * i < a; i++) {
			if (0 == a % i) {
				b = false;
				break;

			}

		}
		if (b) {
			System.out.println("ÊÇ");
		} else {
			System.out.println("·ñ");
		}
	}
}
