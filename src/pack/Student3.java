package pack;
//�ⲿ��People
public class Student3 {
	private double height;  
	private String name = "lilei";   //�ⲿ���˽������
	//�ڲ���Student
	//public class Student{
	// String ID = "07160608";    //�ڲ���ĳ�Ա����
	static String ID = "2532328749329403232";
	//��̬�ڲ���Student
	public static class Student{
		String ID = "07160608";    //�ڲ���ĳ�Ա����
		 public void stuInfo() {
			 System.out.println("�����ⲿ���name��"+(new Student3().name));
			 System.out.println("�����ⲿ���ID��"+ Student3.ID);
			 System.out.println("�����ڲ����ID��" + ID);
		 }
	}
	/**
	//�ڲ���ķ���
	public void stuInfo() {
		System.out.println("�����ⲿ���name:"+name);
		System.out.println("�����ڲ����ID:" + ID);
	}
	}
	*/
	
	
	
	//���Գ�Ա�ڲ���
public static void main(String[] args) {
	//Student3 a = new Student3();  //�����ⲿ����󣬶�����Ϊa
	//Student b = a.new Student();  //ʹ���ⲿ����󴴽��ڲ�����󣬶�����Ϊb
	// Student3.student b = a.new Student();
	Student b = new Student(); //ֱ�Ӵ����ڲ�����󣬶�����Ϊb
	b.stuInfo();
	
}
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
