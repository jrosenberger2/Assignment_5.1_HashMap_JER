/**
 * Dictionary.java uses HashMap to create a Hash table of words and definitions to work as a dictionary
 * @author Jared Rosenberger
 * @version 11/16/22
 * Dictionary.java
 * Fall 2022
 */
import java.util.HashMap;
public class Dictionary {
	private HashMap<String, String> dictionary;//dictionary will hold the words and their definitions
	
	/**
	 * Constructor initializes instance variables
	 */
	public Dictionary() {
		dictionary = new HashMap<String, String>();
	}//end constructor
	
	/**
	 * add puts a new entry into the dictionary
	 * @param word is the key to be passed into the HashMap
	 * @param def is the value to be passed into the HashMap
	 * @return the previous value associated with the key, or null if there is no mapping for the key
	 */
	public String add(String word, String def) {
		return dictionary.put(word, def);
	}//end add
	
	/**
	 * getDef returns the definition of the given word
	 * @param word is the word we want the definition for
	 * @return the definition of the word that was passed in
	 */
	public String getDef(String word) {
		return dictionary.get(word);
	}//end getDef
	
	/**
	 * remove removes the mapping for the specified word from the dictionary
	 * @param word the word to be removed from the dictionary
	 * @return the previous word associated with the def. or null if there was no mapping for the word
	 */
	public String remove(String word) {
		return dictionary.remove(word);
	}//end remove
	
	/**
	 * clear removes all entries and mapping from the dictionary
	 */
	public void clear() {
		dictionary.clear();
	}//end clear
	
	/**
	 * getSize returns the number of word-definition pairs in the dictionary
	 * @return the number of pairs in the dictionary
	 */
	public int getSize() {
		return dictionary.size();
	}//end getSize
	
	/**
	 * getHash returns the hashcode used by the hash table for the key/value pairing
	 * @param word is the key to hash
	 * @return the hashcode for the given key
	 */
	public int getHash(String word) {
		return word.hashCode();
	}//end getHash
	
	/**
	 * printPairs iterates through the dictionary and prints each word and it's corresponding definition
	 */
	public void printPairs() {
		System.out.println("Dictionary Entries: \n");
		for(String pair : dictionary.keySet()) {
			System.out.println(pair + ":\t" + dictionary.get(pair));
		}
	}//end printPairs
	
	/**
	 * searchAndPrint searches for a specific word in the dictionary and if found, prints the word, it's definition, and it's hashcode
	 * @param word is the word to look for in the dictionary
	 */
	public void searchAndPrint(String word) {
		System.out.println("\nSearch for \"" + word + "\"");
		if(dictionary.containsKey(word)) {
			System.out.println(word +" is in the dictioanry");
			System.out.println("Word:\t\t" + word);
			System.out.println("Definition:\t" + getDef(word));
			System.out.println("Hashkey:\t" + getHash(word));
		}
	}//end searchAndPrint
}//end Dictionary