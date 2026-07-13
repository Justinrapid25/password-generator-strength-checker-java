/* Author: JustinRapid | Start Date: June 24, 2026 | Project: Password Generator and Strength Checker

*/
import java.security.SecureRandom;
public class PasswordGenerator
{
   //build constants 
   private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
   private static final String DIGITS = "0123456789";
   private static final String SYMBOLS = "!@#$%^&*-_+";
   private static final String AMBIGUOUS_CHARACTERS = "lI1O0o8B";
   
   //method to build password pool using string builder
   private static StringBuilder buildPool(PasswordCriteria criteria) //type is password criteria from that class
   {
      //create an empty string builder
      StringBuilder pool = new StringBuilder();
      
      //conditional if statements that add what the user wants in a password to the string builder
      if(criteria.isIncludeUpper())
      {
         pool.append(UPPERCASE_LETTERS);
      }
      if(criteria.isIncludeLower())
      {
         pool.append(LOWERCASE_LETTERS);
      }
      if(criteria.isIncludeDigits())
      {
         pool.append(DIGITS);
      }
      if(criteria.isIncludeSymbols())
      {
         pool.append(SYMBOLS);
      }
      if(criteria.isExcludeAmbiguous())
      {
         for(int i = pool.length() - 1; i >= 0; i--)
         {
            char currentChar = pool.charAt(i);
            if(AMBIGUOUS_CHARACTERS.indexOf(currentChar) != -1)
            {
               pool.deleteCharAt(i);
            }
         }

      }      
      //return the stringbuilder
      return pool;
   }

   public static String createPassword(PasswordCriteria criteria)
   {
      StringBuilder pool = buildPool(criteria);
      SecureRandom random = new SecureRandom();
      int passwordLength = criteria.getLength();
      StringBuilder poolResult = new StringBuilder();
      
      for(int i = 0; i < passwordLength; i++)
      {
         int randomIndex = random.nextInt(pool.length());
         char currentChar = pool.charAt(randomIndex);
         
         if(criteria.isExcludeRepeats())
         {
            while(poolResult.length() > 0 && poolResult.charAt(poolResult.length() -1) == currentChar)
            {
                randomIndex = random.nextInt(pool.length());
                currentChar = pool.charAt(randomIndex);
            }
         }
         
         poolResult.append(currentChar);
      }
      
      return poolResult.toString();
   }
   
}