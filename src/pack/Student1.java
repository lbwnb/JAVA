package pack;

public class Student1 {
public static void main(String[] args) {
	//��������
	Student1 a =new Student1();
	
	int rSum; //����һ��int�ͱ������������շ����ķ���ֵ
	
	//���÷������������ſγ̵��ܳɼ�
	rSum = a.calcSum(80, 10);
	System.out.println("�ܷ֣�"+ rSum);
	
	a.pringName("����");
	a.f(33);
	a.f(34.56f);
	a.f("abc");
}
/*
 * ���ܣ��������ſγ̿��Գɼ����ֲܷ�����ܷ�
 * ����һ���������������ķ����������������ſγ̵ĳɼ�
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
