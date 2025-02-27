public class SingeltonEager
{
    private static SingeltonEager uniqueInstance = new SingeltonEager();
    private SingeltonEager(){};
    public static SingeltonEager getInstance()
    {
        return uniqueInstance;
    }
}