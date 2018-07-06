package pack;

public class Dog extends Animal {
	
//Dog类的构造方法
	public Dog() {
		
		System.out.println("子类的构造方法被调用!");
	}

	
//重写父类的bark方法
	public void bark() {
		
		System.out.println("汪！汪！汪！");
	}
	
	public void dogType() {
		System.out.println("这是什么品种的狗？");
	}
}
class Test{
	public static void main(String[] args) {
		/**
		Animal a = new Animal();  //Animal对象
		Dog d = new Dog();        //Dog对象
		Animal b = new Dog();     //Dog 对象，向上转型为Animal类型。
		a.bark();   //执行Animal类的方法
		d.bark();   //执行Dog类的方法
		b.bark();   //执行Dog类的方法
		*/
		//Dog a =new Dog();
		Animal a = new Animal();  //Animal对象
		Dog d = new Dog();        //Dog对象
		Animal b = new Dog();     //Dog 对象，向上转型为Animal类型。
		b.bark();
		a.bark();
	}
}
