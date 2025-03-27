public class Main{
	public static void main(String[] args) {
		Beverage b = new Whiskey();
		b.template(30);
		System.out.println();
		b=new Rum();
		b.template(60);
		System.out.println();
		b=new Beer();
		b.template(300);
	}
}
