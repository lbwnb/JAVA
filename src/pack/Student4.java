package pack;
/**
public class Student4 {
	
public void peopleInfo() {
	final String sex = "man";  //�ⲿ�෽���еĳ���
	class Student{
		String ID = "20151234";  //�ڲ����еĳ���
		public void print() {
			System.out.println("�����ⲿ��ķ����еĳ���sex:" + sex);
			System.out.println("�����ڲ���ı���ID:"+ ID);
		}
		
	}
	Student a = new Student(); //���������ڲ���Ķ���
	a.print(); //�����ڲ���ķ���
}
//�������ⲿ����е���������
public void peopleInfo2(boolean b) {
	if(b) {
		final String sex = "man";  //�ⲿ�෽���еĳ���
		class Student{
			String ID = "2023732";  //�ڲ����еĳ���
			public void print() {
				System.out.println("�����ⲿ��ķ����еĳ���sex��" + sex);
				System.out.println("�����ڲ���ı���ID��"+ ID);
			}
		}
		Student a = new Student();  //���������ڲ���Ķ���
		a.print(); //���ñ�����ķ���
		
	}
}
*/
	
//�����ڲ���
public class Student4{
	public Inner getInner(final String name, String city) {
		return new Inner() {
			private String nameStr = name;
			public String getName() {
				return nameStr;
			}
		};
	}

//���Է����ڲ���
public static void main(String[] args) {
	/**
	Student4 b = new Student4();  //�����ⲿ��Ķ���
	System.out.println("�����ڷ����ڣ�==========");
	b.peopleInfo();  //�����ⲿ��ķ���
	System.out.println("�������������ڣ�============");
	b.peopleInfo2(true);
	*/
	Student4 outer = new Student4();
	Inner inner = outer.getInner("Inner", "NewYork");
	System.out.println(inner.getName());

}
}
interface Inner{
	String getName();

}
