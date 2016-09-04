public class FixDebugCustomerMakingPurchase extends FixDebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;
   public FixDebugCustomerMakingPurchase(int id, double credit, String name, double purchAmount)
    {
        super(id, credit, name);
        amountOfPurchase = purchAmount;
       if(amountOfPurchase > creditLimit)
          overLimit = true;
       else
          overLimit = false;
    }
    @Override
    public void display()
    {
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
