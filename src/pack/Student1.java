package pack;

public class Student1 {
public static void main(String[] args) {
	//创建对象
	Student1 a =new Student1();
	
	int rSum; //设置一个int型变量，用来接收方法的返回值
	
	//调用方法，传入两门课程的总成绩
	rSum = a.calcSum(80, 10);
	System.out.println("总分："+ rSum);
	
	a.pringName("哈哈");
	a.f(33);
	a.f(34.56f);
	a.f("abc");
}
/*
 * 功能：计算两门课程考试成绩的总分并输出总分
 * 定义一个包含两个参数的方法，用来传入两门课程的成绩
 */

public int calcSum(int a, int b) {
	int sum = a+b;
	return sum;
}

public void pringName(String name) {
	System.out.println(name);
}

	void f(int i) {
		System.out.println("i=" + i);
	}
	void f(float f) {
		System.out.println("f=" + f);
	}
	void f(String s) {
		System.out.println("s=" + s);
	
}
}
