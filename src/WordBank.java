/* Author: JustinRapid| Start Date: June 24, 2026 | Project: Password Generator and Strength Checker
This program will perform the following
------------------------------------------
Hold a list of words used to build passphrases
Hold a list of weak passwords used by the strength checker to flag bad/weak passwords
Hand back either list when asked
*/
import java.util.List;
import java.util.ArrayList;

public class WordBank
{
    // TODO: Declare two private static fields
    // 1. A List<String> called words
    // 2. A List<String> called weakPasswords
   private static List<String> words;
   private static List<String> weakPasswords;

    // TODO: Write a static initializer block
    // Initialize both lists and populate them
   static
   {
      words = new ArrayList<>(); // add 15-25 common simple words
         words.add("roomba");
         words.add("exterior");
         words.add("tassel");
         words.add("delusional");
         words.add("comprehensive");
         words.add("furniture");
         words.add("tablet");
         words.add("foliage");
         words.add("chemistry");
         words.add("cyberpunk");
         words.add("farming");
         words.add("smoothie");
         words.add("monitor");
         words.add("webcam");
         words.add("beach");
         words.add("table");
         words.add("incomplete");
         words.add("drastic");
         words.add("impervious");
         words.add("globally");
         words.add("impossible");
         words.add("calculator");
   }
   
   static
   {
      weakPasswords = new ArrayList<>();  // add 15-20 known weak passwords
         weakPasswords.add("123456");
         weakPasswords.add("12345678");
         weakPasswords.add("123456789");
         weakPasswords.add("password");
         weakPasswords.add("Password");
         weakPasswords.add("P@ssword");
         weakPasswords.add("password1");
         weakPasswords.add("Password1");
         weakPasswords.add("P@ssword1");
         weakPasswords.add("computer");
         weakPasswords.add("qwerty");
         weakPasswords.add("xxx");
         weakPasswords.add("money");
         weakPasswords.add("Summer");
         weakPasswords.add("shadow");
         weakPasswords.add("dragon");
         weakPasswords.add("jordan");
         weakPasswords.add("123abc");
         weakPasswords.add("Internet");
         weakPasswords.add("e-mail");
         weakPasswords.add("october");
         weakPasswords.add("warriors");
         weakPasswords.add("!@#$%^");
         weakPasswords.add("0007");
         weakPasswords.add("toronto");
   }
    
   public static List<String> getWords() 
   {
      return words;  // Returns the words list
   }
   
   public static List<String> getWeakPasswords()
   {
      return weakPasswords; // Returns the weakPasswords list
   }

    
}
