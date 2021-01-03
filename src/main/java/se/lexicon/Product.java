package se.lexicon;

public abstract class Product {
    String name;
    int price;
    public int depositpool=3000;
    public void product()

    public void product( String name,int price)
    {
        this.name=name;
        this.price=price;
    }


    boolean addMoney(int money)
    {
        return  true;
    }
    Product buy(int money, int prodNum)
    {
        depositpool-=money;
      System.out.println("The money for the product is "+money+"and the product number is "+ prodNum);
    }
    int returnChange()
    {
        return  depositpool-price;
    }
    void presentProducts()
    {
        System.out.println("This product is delicious");
    }
    int getBalance()
    {
      return  depositpool;
    }
}
