/* Author: JustinRapid | Start Date: June 24, 2026 | Project: Password Generator and Strength Checker

*/

public class StrengthChecker
{
   private static final String SYMBOLS = "!@#$%^&*-_+";
   
   public static String evaluateStrength(String password)
   {  
      
      if(isKnownWeakPassword(password))
      {
         return "Weak";
      }
      
      int finalScore = scoreLength(password.length()) + scoreVariety(password);
      
      if(finalScore >= 5)
      {
         return "Strong";
      }
      else if(finalScore >= 2 && finalScore <= 4)
      {
         return "Moderate";
      }
      else
      {
         return "Weak";
      }
   
   }

   private static int scoreLength(int length)
   {
      int passLengthScore;
      int weakPassLength = 0;
      int moderatePassLength = 1;
      int strongPassLength = 2;
      
      if(length >= 16)
      {
         passLengthScore = strongPassLength;
      }
      else if(length < 16 && length >= 8)
      {
         passLengthScore = moderatePassLength;
      } 
      else
      {
         passLengthScore = weakPassLength;
      }
      
      return passLengthScore;
   
   }
   
   private static int scoreVariety(String password)
   {
      boolean hasUpper = false;
      boolean hasLower = false;
      boolean hasDigit = false;
      boolean hasSymbol = false;
      int variety = 0;
      
      for(int i = 0; i < password.length(); i++)
      {
         char currentChar = password.charAt(i);
         
         if(Character.isUpperCase(currentChar))
         {
            hasUpper = true;
         }
         if(Character.isLowerCase(currentChar))
         {
            hasLower = true;
         }
         if(Character.isDigit(currentChar))
         {
            hasDigit = true;
         }
         if(SYMBOLS.indexOf(currentChar) != -1)
         {
            hasSymbol = true;
         }
      }
      
      if(hasUpper)
      {
         variety++;
      }
      if(hasLower)
      {
         variety++;
      }
      if(hasDigit)
      {
         variety++;
      }
      if(hasSymbol)
      {
         variety++;
      }
      
      return variety;
   
   } 
   
   private static boolean isKnownWeakPassword(String password )
   {
      boolean weakPass = false;
      
      for(String entry : WordBank.getWeakPasswords())
      {
         if(password.equalsIgnoreCase(entry))
         {  
            weakPass = true;
            break;
         }
         
      }
      
      return weakPass;
   }
   
   
}