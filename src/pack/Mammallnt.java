package pack;

public class Mammallnt implements Anima {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammal eats");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Mammal travels");
		
	}
	public int noOfLegs() {
		return 0;
	}
	public static void main(String[] args) {
		Mammallnt m = new Mammallnt();
		m.eat();
		m.travel();
	}

}
