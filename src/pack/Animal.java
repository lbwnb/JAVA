package pack;

public class Animal { 
public int legNum = 4;    //������֫������

//Animal�Ĺ��췽��
public Animal() {
	System.out.println("������" + legNum + "����");
	System.out.println("����Ĺ��췽��������!");
}
//�෽��
public void bark() {
	System.out.println("�����!");
}


}

interface Anima {
public void eat();
public void travel();
}


