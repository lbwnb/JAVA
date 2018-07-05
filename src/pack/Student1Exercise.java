package pack;

//实现一个方法，接收一个层数值n，打印一个有n层的直角三角形，并返回底边最后一个值。并打印出来。
public class Student1Exercise {
	public static void main(String[] args) {
		Student1Exercise a = new Student1Exercise();
		int lastNum;
		lastNum=a.printRightTriangle(3);
		System.out.println("返回值为" + lastNum);

	}

	public int printRightTriangle(int n) {
		int last = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				last++;
				System.out.printf("%2d",last);
			}
			System.out.println();
		}
		return last;
	}
}
