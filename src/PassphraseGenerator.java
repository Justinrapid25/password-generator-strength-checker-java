/* Author: JustinRapid | Start Date: June 24, 2026 | Project: Password Generator and Strength Checker

*/
import java.util.List;
import java.security.SecureRandom;

public class PassphraseGenerator
{
   public static String createPassphrase(PassphraseCriteria criteria)
   {
      List<String> words = WordBank.getWords();
      SecureRandom random = new SecureRandom();
      int passPhraseLength = criteria.getNumWords();
      StringBuilder wordsResult = new StringBuilder();
      
      for(int i = 0; i < passPhraseLength; i++)
      {
         int randomIndex = random.nextInt(words.size());
         String currentWord = words.get(randomIndex);
         
         if(criteria.isIncludeCapital())
         {
            currentWord = Character.toUpperCase(currentWord.charAt(0)) +
               currentWord.substring(1);
         }
         
         wordsResult.append(currentWord);
         
         if(i != passPhraseLength - 1)
         {
            wordsResult.append(criteria.getSeparator());
         }
      
         
      }
 
      if(criteria.isIncludeNumber())
         {
            int endingNumber = random.nextInt(10);
            wordsResult.append(endingNumber);
         }
      
      return wordsResult.toString();
   }
}
