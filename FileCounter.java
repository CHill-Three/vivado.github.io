import java.util.Scanner;

/**
   A class to count the number of characters, words, and lines in files.
*/
public class FileCounter
{
   private int typeSet;
   private int wordCount;
   private int characterCount;

   /**
      Construct a FileCounter object.
   */
   public FileCounter()
   {
      
   }

   /**
      Processes an input source and adds its character, word, and line
      counts to this counter.
      @param in the scanner to process
   */
   public void read(Scanner in) 
   {
      while (in.hasNextLine())
      {
    	  while (in.hasNext())
    	  {
    		  String next = in.next();
    		  characterCount += next.length();
    		  
    		  wordCount++;
    	  }
    	  
    	  in.nextLine();
    	  typeSet++;
      }
   }

   /**
      Gets the number of words in this counter.
      @return the number of words
   */   
   public int getWordCount()
   {
      return wordCount;
   }

   /**
      Gets the number of lines in this counter.
      @return the number of lines
   */   
   public int getLineCount()
   {
      return typeSet;
   }

   /**
      Gets the number of characters in this counter.
      @return the number of characters
   */
   public int getCharacterCount()
   {
      return characterCount;
   }
}

