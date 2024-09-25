// Main.java			
// Pig Latin Converter
// This is the student starting file for Lab02bPigLatin.

import java.util.Scanner;

public class PigLatin{
    boolean vowel;
	public static void main (String[] args)
	{
      		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
        		 	
		String piggie = PigLatin.convertWord(str);
		System.out.println();
		System.out.println("Converted word: " + piggie);
	}
    private boolean isVowel(String s){
        if (s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")){
            return true;
        }else{
        return false;
        }
        
    }
    private static boolean startsVowel(String str){
        if (str.isVowel() == true){
            return true;
        }else{
            return false;
        }
    }

    private static String convertWord(String str) {
        return null;
    }
}
