package pack;

public class Student2 {
	public static void main(String[] args) {

		Student2 a = new Student2();
		a.height = 170;
		a.age = 17;
		a.sex = 1;
		a.cry();
		a.laugh();
		a.printBaseMes();

	}

	double height;
	int age;
	int sex;

	void cry() {
		System.out.println("���ڿ�");
	}

	void laugh() {
		System.out.println("����Ц");
	}

	void printBaseMes() {
		System.out.println("�ҵ����" + height + "cm");
		System.out.println("�ҵ�����" + age + "��");
		if (this.sex == 0)
			System.out.println("��������");
		else
			System.out.println("����Ů��");

	}
}
