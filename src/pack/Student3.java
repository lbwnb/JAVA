package pack;
//外部类People
public class Student3 {
	private double height;  
	private String name = "lilei";   //外部类的私有属性
	//内部类Student
	//public class Student{
	// String ID = "07160608";    //内部类的成员属性
	static String ID = "2532328749329403232";
	//静态内部类Student
	public static class Student{
		String ID = "07160608";    //内部类的成员属性
		 public void stuInfo() {
			 System.out.println("访问外部类的name："+(new Student3().name));
			 System.out.println("访问外部类的ID："+ Student3.ID);
			 System.out.println("访问内部类的ID：" + ID);
		 }
	}
	/**
	//内部类的方法
	public void stuInfo() {
		System.out.println("访问外部类的name:"+name);
		System.out.println("访问内部类的ID:" + ID);
	}
	}
	*/
	
	
	
	//测试成员内部类
public static void main(String[] args) {
	//Student3 a = new Student3();  //创建外部类对象，对象名为a
	//Student b = a.new Student();  //使用外部类对象创建内部类对象，对象名为b
	// Student3.student b = a.new Student();
	Student b = new Student(); //直接创建内部类对象，对象名为b
	b.stuInfo();
	
}
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
