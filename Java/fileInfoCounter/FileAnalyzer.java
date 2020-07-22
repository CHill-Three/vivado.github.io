// Name: Charles Hill
// Date: 1/8/2018
// Period: 2A

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**

   This class prints a report on the contents of a number of files.

*/

public class FileAnalyzer

{

   public static void main(String[] args)

   { 

      Scanner in = new Scanner(System.in);

      FileCounter counter = new FileCounter();

      boolean more = true;

      while (more)

      {

         System.out.print("Please enter the next filename, or <Enter> to quit: ");

         String filename = in.nextLine();

         if (filename.length() > 0)

         {

             try

             {

                 FileReader fileRead = new FileReader(filename);

                 Scanner fileInput = new Scanner(fileRead);

                 counter.read(fileInput);

             }

             catch (FileNotFoundException fnfe)

             {

                 System.out.println("File " + filename + " was not found: " + fnfe);

             }

         }

         else

         {

           more = false;

         }

      }

      System.out.println("Characters: " + counter.getCharacterCount());

      System.out.println("Words: " + counter.getWordCount());

      System.out.println("Lines: " + counter.getLineCount());

   }

}
