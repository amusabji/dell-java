import java.util.Scanner;

//TODO: 
//	1)	Integrate the vowel 'y' handler:
//		if ((stringToChar[i] == 'y') && (i == stringToChar.length-1)) {
//			String FirstHalf = word.substring(0, i);
//			String SecondHalf = word.substring(i);
//			translatedWord = SecondHalf + FirstHalf + "ay";
//			System.out.println(translatedWord);
//			break??
//		}
//	
//	2) error handling for bad input data

public class PigLatin {
	
	public static void main(String[] args) {
		System.out.println("Hello, World! Welcome to the Pig Latin translator");
		// return method's output into a variable
		String usersWord = UserInput();
		// pass previously returned variable into new method, and return its output to new variable
		int vowelIndex = vowelChecker(usersWord);
		// pass both previously created variables into final method.
		Translator(vowelIndex, usersWord);
	}
	
	// method to prompt user for input and initialize it to a var and return that var
	public static String UserInput() {
		// asking user for input
		System.out.println("Please type in an English word to be tranlated");
		// read the input of the user
		Scanner reader = new Scanner(System.in);
		// place the input of the user into a variable
		String userWord = reader.next();
		reader.close();
		return userWord;
	}
	
	// method finds first vowel in user-generated word using nested for-loops, returns index of vowel
	public static int vowelChecker (String word) {
		// split the given word into char array
		char[] wordArr = word.toCharArray();
		// create a char array for all the vowels checked against
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};	
		// initialize with -1 in case loops end with no vowel in the word (rule3)
		int vowelIdx = -1;
		// iterate through every char in word
		for (int i = 0; i < wordArr.length; i++) {
			// iterate thru every vowel in array
			for (int j = 0; j < vowels.length; j++) {			
				// check if there is a vowel in the word
				if (wordArr[i] == vowels[j]) {
					// if there is, place the index of the vowel in a var.
					vowelIdx = i;
					// return var and terminate function
					return vowelIdx;
				}
			}
		}
		// if no vowels found, return initialized var value (-1)
		return vowelIdx;
	}
	
	// method to determine which rule to implement according to index of vowel 
	public static void Translator (int vIdx, String word) {
		// if word begins with vowel, do first rule
		if (vIdx == 0) {
			ruleOne(word);
		// if vowel is somewhere else in the word, do second rule
		} else if (vIdx > 0) {
			ruleTwo(word, vIdx);
		// if word has no vowel, do third rule
		} else {
			ruleThree(word);
		}
	}
	
	// if word starts with vowel (index[0]):
	public static void ruleOne (String word) {
		// first rule just appends "yay" to word
		System.out.println(word + "yay");
	}
	
	// if vowel is NOT the first char (index[0]), but DOES exist (index[>0]):
	public static void ruleTwo (String word, int indx) {
	// split the word in 2 halves:
		// first half, from the first letter to the letter just before the first vowel 
		// substring params: (inclusive int, exclusive int)
		String FirstHalf = word.substring(0, indx);
		// second half, from the first vowel til the end of the word.
		String SecondHalf = word.substring(indx);
		//f lip around the 2 halves and append "ay"
		System.out.println(SecondHalf + FirstHalf + "ay");
	}
	
	// if there is NO vowel in the word (index[-1]):
	public static void ruleThree (String word) {
		// just append "ay" to word
		System.out.println(word + "ay");
	}	
}