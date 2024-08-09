package oops;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter string: ");
		String sentence = s.nextLine(); // "This is a sample sentence with vowels.";
        String result = removeVowels(sentence);
        System.out.println("Modified sentence: " + result);
        s.close();
    }

    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!isVowel(currentChar)) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        
                
	}
}
