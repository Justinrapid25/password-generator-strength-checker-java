/* Author: JustinRapid | Start Date: June 24, 2026 | Project: Password Generator and Strength Checker

*/

public class PassphraseCriteria
{
   private int numWords;
   private char separator;
   private boolean includeCapital;
   private boolean includeNumber;
   
   public PassphraseCriteria(int numWords, char separator, boolean includeCapital,
      boolean includeNumber)
   {
      this.numWords = numWords;
      this.separator = separator;
      this.includeCapital = includeCapital;
      this.includeNumber = includeNumber;
   
   }

   public int getNumWords()
   {
      return numWords;
   }
   public char getSeparator()
   {
      return separator;
   }
   public boolean isIncludeCapital()
   {
      return includeCapital;
   }
   public boolean isIncludeNumber()
   {
      return includeNumber;
   }


}
