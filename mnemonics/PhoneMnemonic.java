package mnemonics;
/**
 * 	Class that determines all possible strings produced by digits on a phone pad
 * @version 3/3/17
 * @author Ethan Young
 */
import java.util.*;
public class PhoneMnemonic {
	
	/**
	 * Main driver for finding phone Mnemonics Prompts for input once.
	 * @param args
	 */
	public static void main(String[] args){
		PhoneMnemonic phoneNumber = new PhoneMnemonic();
		ArrayList<String> all = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a phone number to see its Mnemonics");
		String phoneNum = input.next();
		all = phoneNumber.listMnemonics(phoneNum);
		System.out.println(all);
		
	}
	
	/**
	 * Takes in the number to find its Mnemonics and returns an array list of the mnemonics
	 * @param num
	 * @return
	 */
	public ArrayList<String> listMnemonics(String num){
		ArrayList<String> result = new ArrayList<String>();
		recursiveMnemonics(result, "", num);
		return result;
		
	}
	
	/**
	 * Takes in a char and returns a string of possible letters for the Mnemonic
	 * @param ch
	 * @return String of possible Letters for the Mnemonic
	 */
	public String digitLetters(char ch){
		switch (ch){
		case '1': return "1";
		case '2': return "ABC";
		case '3': return "DEF";
		case '4': return "GHI";
		case '5': return "JKL";
		case '6': return "MNO";
		case '7': return "PQRS";
		case '8': return "TUV";
		case '9': return "WXYZ";
		default: return "Failure";
		}
		
	}
	
	/**
	 * Recursively finds all Mnemonics. result is the array list where all finished mnemonics are stored.
	 * 	mnemonicSoFar is a String of the mnemonic being built by the method.
	 * 	digitsLeft is which digits in the phone number have yet to be added to the mnemonic
	 * @param result
	 * @param mnemonicSoFar
	 * @param digitsLeft
	 */
	private void recursiveMnemonics(ArrayList<String> result, String mnemonicSoFar, String digitsLeft){
		if(digitsLeft.isEmpty()){
			result.add(mnemonicSoFar);
			return;
		}
		char nextDigit = digitsLeft.charAt(0);
		digitsLeft = digitsLeft.substring(1);
		String possibleLetters = digitLetters(nextDigit);
		for (int i=0;i<possibleLetters.length();i++){
			char nextLetter = possibleLetters.charAt(i);
			String nextMnemonic = mnemonicSoFar+nextLetter;
			recursiveMnemonics(result, nextMnemonic, digitsLeft);
		}
		
		
	}

}
