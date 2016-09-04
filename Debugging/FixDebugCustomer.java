public class FixDebugCustomer
{
    protected int idNumber;
    protected String name;
    protected double creditLimit;
    public FixDebugCustomer(int id, double credit, String name)
    {
       idNumber = id;
       this.name = name;
       credit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
