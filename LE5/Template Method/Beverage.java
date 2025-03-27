abstract class Beverage{
    protected void pour(int qty){
        System.out.println("Pour "+this.getClass().getName()+" "+qty+" ml");
    }
    protected abstract void addCondiment();
    protected void stir(){}
    protected void serve(){
         System.out.println("Serve through waiter");
    }
    public void template(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}