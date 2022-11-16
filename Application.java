/**
 * Application.java tests the methods of Dictionary.java by reading word/definition pairs from a text file and adding them to a Dictionary
 * @author Jared Rosenberger
 * @version 11/16/22
 * Application.java
 * Fall 2022
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Application {

	public static void main(String[] args) {
		Scanner reader;
		File pairs = new File("DictionaryWordValuePairs.txt");
		String line = "";
		String word = "";
		String def = "";
		Dictionary oldTimeyWords = new Dictionary();
		
		try {
			reader = new Scanner(pairs);
			while(reader.hasNextLine()) {
				line = reader.nextLine();
				int tabIndex = line.indexOf('\t');
				word = line.substring(0, tabIndex);
				def = line.substring(tabIndex+1);
				oldTimeyWords.add(word, def);
			}
			reader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("There was an error reading your file.");
		}
		
		oldTimeyWords.printPairs();
		
		oldTimeyWords.searchAndPrint("fain");
		
		oldTimeyWords.searchAndPrint("venery");
		
		oldTimeyWords.searchAndPrint("skirt");
		
		oldTimeyWords.searchAndPrint("purfle");
		
		oldTimeyWords.searchAndPrint("picaroon");
	}//end main
}//end Application