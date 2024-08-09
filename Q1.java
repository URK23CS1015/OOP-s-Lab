package oops;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        String[] sequences = new String[5];
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Enter Sequence " + (i + 1) + ": ");
		            sequences[i] = scanner.nextLine();
		        }
		        System.out.print("Enter a character to search for: ");
		        char searchChar = scanner.next().charAt(0);
		        int maxOccurrences = 0;
		        for (String sequence : sequences) {
		            int occurrences = countOccurrences(sequence, searchChar);
		            maxOccurrences = Math.max(maxOccurrences, occurrences);
		        }
		        System.out.println("Character '" + searchChar + "' occurred a maximum of " + maxOccurrences + " times.");
		        scanner.close();
		    }
		    private static int countOccurrences(String str, char target) {
		        int count = 0;
		        for (char c : str.toCharArray()) {
		            if (c == target) {
		                count++;
		            }
		        }
		        return count;
		    }
		}
