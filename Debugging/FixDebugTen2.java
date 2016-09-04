// A Vacation is 10 days
// but an ExtendedVacation is 30 days
public class FixDebugTen2
{
   public static void main(String args[]) 
   {
      FixDebugVacation vacay1 = new FixDebugVacation();
      FixDebugExtendedVacation vaycay2 = new FixDebugExtendedVacation();
      System.out.println("My vacation is for " +
         vacay1.getDays() + " days");
      System.out.println("Your vacation is for " +
         vaycay2.getDays() + " days");
   }
}
