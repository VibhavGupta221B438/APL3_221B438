public class SingeltonLazy
{
    private static SingeltonLazy uniqueInstance;
    private SingeltonLazy(){};
    public static SingeltonLazy getInstance()
    {
        if(uniqueInstance==null)
        {
            uniqueInstance=new SingeltonLazy();
        }
        return uniqueInstance;
    }
}