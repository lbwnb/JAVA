package pack;

//ʵ��һ������������һ������ֵn����ӡһ����n���ֱ�������Σ������صױ����һ��ֵ������ӡ������
public class Student1Exercise {
	public static void main(String[] args) {
		Student1Exercise a = new Student1Exercise();
		int lastNum;
		lastNum=a.printRightTriangle(3);
		System.out.println("����ֵΪ" + lastNum);

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
