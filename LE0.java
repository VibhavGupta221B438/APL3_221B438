/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class LE0
{
    int age;
    String name;
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
	public static void main(String[] args) {
	    Juet obj=new Juet();
	    obj.setName("Vibhav");
	    obj.setAge(21);
	    System.out.println(obj.getName());
	    System.out.println(obj.getAge());
	}
}