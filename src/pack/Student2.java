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
		System.out.println("我在哭");
	}

	void laugh() {
		System.out.println("我在笑");
	}

	void printBaseMes() {
		System.out.println("我的身高" + height + "cm");
		System.out.println("我的年龄" + age + "岁");
		if (this.sex == 0)
			System.out.println("我是男性");
		else
			System.out.println("我是女性");

	}
}
