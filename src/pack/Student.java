package pack;



public class Student {
	public static void main(String[] args) {
		Student a = new Student("ÕÅÈý",17,"ÄÐ");
		a.show();
		
	}
private String name;
private int age;
private String sex;

public Student(String name,int age,String sex) {
	this.name=name;
	this.age = age;
	this.sex = sex;
	
}
public String toString() {
	return name+age+sex;
}
public void show() {
	System.out.println(this);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}

}



