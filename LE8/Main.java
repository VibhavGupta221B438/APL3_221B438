public class Main
{
	public static void main(String[] args) {
		Crow crow=new IndianCrow();
		Swan swan=new CrowAdapter(crow);
		client(swan);
	}
	public static void client(Swan swan)
	{
	    swan.sing();
	    swan.swim();
	    swan.eat();
	}
}
