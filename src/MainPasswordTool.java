/* Author: JustinRapid | Start Date: June 24, 2026 | Project: Password Generator and Strength Checker

*/

import java.util.Scanner;

public class MainPasswordTool
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      boolean running = true;
      
      while(running)
      {  System.out.println("===========================================================");
         System.out.println("Welcome to the Password Generator and Strength Checker Tool");
         System.out.println("===========================================================");
         System.out.println("1. Generate Password");
         System.out.println("2. Generate Passphrase");
         System.out.println("3. Check Password Strength");
         System.out.println("4. Exit");
         
         System.out.print("Make a selection(Enter a number 1 through 4): ");
         int answer = input.nextInt();
         input.nextLine();
         
         switch(answer)
         {
            case 1: System.out.print("Enter desired password length: ");
                    int userLength = input.nextInt(); 
                    System.out.print("Include uppercase(y/n)?: ");
                    boolean includeUpper = input.next().equalsIgnoreCase("y");
                    System.out.print("Include lowercase(y/n)?: ");
                    boolean includeLower = input.next().equalsIgnoreCase("y");
                    System.out.print("Include digits(y/n)?: ");
                    boolean includeDigits = input.next().equalsIgnoreCase("y");
                    System.out.print("Include symbols(y/n)?: ");
                    boolean includeSymbols = input.next().equalsIgnoreCase("y");
                    System.out.print("Exclude ambiguous characters(y/n)?: ");
                    boolean excludeAmbiguous = input.next().equalsIgnoreCase("y");
                    System.out.print("Exclude repeating adjacent characters(y/n)?: ");
                    boolean excludeRepeats = input.next().equalsIgnoreCase("y");
                    while(!includeUpper && !includeLower && !includeDigits && ! includeSymbols)
                    {
                     System.out.println("Invalid response. At least one option needs to be selected.");
                     System.out.print("Enter desired password length: ");
                     userLength = input.nextInt(); 
                     System.out.print("Include uppercase(y/n)?: ");
                     includeUpper = input.next().equalsIgnoreCase("y");
                     System.out.print("Include lowercase(y/n)?: ");
                     includeLower = input.next().equalsIgnoreCase("y");
                     System.out.print("Include digits(y/n)?: ");
                     includeDigits = input.next().equalsIgnoreCase("y");
                     System.out.print("Include symbols(y/n)?: ");
                     includeSymbols = input.next().equalsIgnoreCase("y");
                    }
                    PasswordCriteria criteria = new PasswordCriteria(userLength, includeUpper, includeLower,
                     includeDigits, includeSymbols, excludeAmbiguous, excludeRepeats);
                    String generatedPassword = PasswordGenerator.createPassword(criteria);
                    System.out.println("Your generated password: " + generatedPassword);
                    
                    break;
            case 2: System.out.print("Enter desired number of words: ");
                    int passphraseLength = input.nextInt();
                    System.out.print("Enter your separator(!@#$%^&*-_+): ");
                    char separator = input.next().charAt(0);
                    System.out.print("Include capital letter(y/n)?: ");
                    boolean includeCapital = input.next().equalsIgnoreCase("y");
                    System.out.print("Include number(y/n)?: ");
                    boolean includeNumber = input.next().equalsIgnoreCase("y");
                    PassphraseCriteria passphraseCriteria = new PassphraseCriteria(passphraseLength, separator, includeCapital,
                     includeNumber);
                    String generatedPassphrase = PassphraseGenerator.createPassphrase(passphraseCriteria);
                    System.out.println("Your generated passphrase: " + generatedPassphrase);
                    
                    break;
            case 3: System.out.print("Enter a password to check its strength: ");
                    String providedPassword = input.nextLine();
                    String checkedPassword = StrengthChecker.evaluateStrength(providedPassword);
                    System.out.println("Your results: " + checkedPassword);
                    
                    break;
            case 4: running = false; break;
            default: System.out.println("Invalid selection"); break;
         
         }
      }
   
   input.close();
   }
}
