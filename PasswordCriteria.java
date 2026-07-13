 /* Author: JustinRapid | Start Date: June 24, 2026 | Project: Password Generator and Strength Checker
This program will perform the following
------------------------------------------
Holds the settings the user picks for a password to include:
   length, upper and or lower case letters, digits, symbols, whether to exclude ambiguous characters, 
   whether to avoid repeating characters
*/

public class PasswordCriteria
{
  private int length;
  private boolean includeUpper;
  private boolean includeLower;
  private boolean includeDigits;
  private boolean includeSymbols;
  private boolean excludeAmbiguous;
  private boolean excludeRepeats;

  public PasswordCriteria(int length, boolean includeUpper, boolean includeLower, boolean includeDigits, 
   boolean includeSymbols, boolean excludeAmbiguous, boolean excludeRepeats)
  {
      this.length = length;
      this.includeUpper = includeUpper;
      this.includeLower = includeLower;
      this.includeDigits = includeDigits;
      this.includeSymbols = includeSymbols;
      this.excludeAmbiguous = excludeAmbiguous;
      this.excludeRepeats = excludeRepeats;
  }
  
  public int getLength()
  {
   return length;
  } 
  
  public boolean isIncludeUpper()
  {
   return includeUpper;
  } 

  public boolean isIncludeLower()
  {
   return includeLower;
  }

  public boolean isIncludeDigits()
  {
   return includeDigits;
  }

  public boolean isIncludeSymbols()
  {
   return includeSymbols;
  }

  public boolean isExcludeAmbiguous()
  {
   return excludeAmbiguous;
  }

  public boolean isExcludeRepeats()
  {
   return excludeRepeats;
  }
}