public class Main
{
	public static void main(String[] args) {
		Offering obj1=new Tea();
	    Rum obj2=new Rum(obj1);
	    Rum obj3=new Rum(obj2);
	    System.out.println(obj3.getName());
		System.out.println(obj3.getPrice());
	}
}
