package test;

import java.util.Scanner;

public class test
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Please enter a word: ");
      String word=in.nextLine();
      System.out.println(scramble(word));         //calling the function scramble with parameter word
   }

   public static String scramble(String word)
   {
   String scrambleWord="";
   int wordLength=word.length();                //finding the length of the word
   if (wordLength<=3)                           //if the word has 3 or less letters, then scramble not necessary
   {
   	return word;
   }
   else
   {
   	for (int i=0;i<=wordLength-1;i++)
   	{	
   		char letter=word.charAt(i);
   		if (i==(int)((wordLength/2)-1))    //finding the aprox location of the middle letter and evaluating to i
   		{
   			scrambleWord=scrambleWord+word.charAt(i+1)+word.charAt(i);//scramble the letters inside the word
   			letter=word.charAt(i++);   // pass the upcoming letter as we used it in the previous statement
   		}
   		else
   		{
   		scrambleWord=scrambleWord+letter;
   		}
   		
   	}
   }
   return scrambleWord;}
}
