package pack;

public class Dog extends Animal {
	
//Dog��Ĺ��췽��
	public Dog() {
		
		System.out.println("����Ĺ��췽��������!");
	}

	
//��д�����bark����
	public void bark() {
		
		System.out.println("������������");
	}
	
	public void dogType() {
		System.out.println("����ʲôƷ�ֵĹ���");
	}
}
class Test{
	public static void main(String[] args) {
		/**
		Animal a = new Animal();  //Animal����
		Dog d = new Dog();        //Dog����
		Animal b = new Dog();     //Dog ��������ת��ΪAnimal���͡�
		a.bark();   //ִ��Animal��ķ���
		d.bark();   //ִ��Dog��ķ���
		b.bark();   //ִ��Dog��ķ���
		*/
		//Dog a =new Dog();
		Animal a = new Animal();  //Animal����
		Dog d = new Dog();        //Dog����
		Animal b = new Dog();     //Dog ��������ת��ΪAnimal���͡�
		b.bark();
		a.bark();
	}
}
