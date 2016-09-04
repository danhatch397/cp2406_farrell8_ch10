public class FixDebugPlay
{
   public String title;
   public String author;



    FixDebugPlay(String t, String a) {
      title = t;
      author = a;
   }
   public void display()
   {
      System.out.println("The first performance is " + title +
        " by " + author);
   }
}