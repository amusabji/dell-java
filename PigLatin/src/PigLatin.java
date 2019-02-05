import java.util.Scanner;

public class PigLatin {

// TODO: 
//	Integrate the vowel 'y' handler:
//	if ((stringToChar[i] == 'y') && (i == stringToChar.length-1)) {
//		String FirstHalf = word.substring(0, i);
//		String SecondHalf = word.substring(i);
//		translatedWord = SecondHalf + FirstHalf + "ay";
//		System.out.println(translatedWord);
//		break??
//	}

	
	public static void main(String[] args) {
		System.out.println("Hello, World! Welcome to the Pig Latin translator");
		String usersWord = UserInput();
		int vowelIndex = vowelChecker(usersWord);
		Translator(vowelIndex, usersWord);

	}
	
	public static String UserInput() {
		// asking user for input
		System.out.println("Please type in an English word to be tranlated");
		//read the input of the user
		Scanner reader = new Scanner(System.in);
		//place the input of the user into a variable
		String userWord = reader.next();
		reader.close();
		//TODO: error handling for bad input data
		return userWord;
	}
	
	public static int vowelChecker (String word) {
		//split the given word into char array
		char[] wordArr = word.toCharArray();
		//create a char array for all the vowels checked against
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};	
		// initialize with -1 in case loops end with no vowel in the word (rule3)
		int vowelIdx = -1;
		//iterate through every char in word
		for (int i = 0; i < wordArr.length; i++) {
			// iterate thru every vowel in array
			for (int j = 0; j < vowels.length; j++) {			
				// check if there is a vowel in the word
				if (wordArr[i] == vowels[j]) {
					vowelIdx = i;
					return vowelIdx;
				}
			}
		}
		return vowelIdx;
	}
	
	public static void Translator (int vIdx, String word) {
		if (vIdx == 0) {
			ruleOne(word);
		} else if (vIdx > 0) {
			ruleTwo(word, vIdx);
		} else {
			ruleThree(word);
		}
	}
	
	public static void ruleOne (String word) {
		System.out.println(word + "yay");
	}
	
	public static void ruleTwo (String word, int indx) {
		String FirstHalf = word.substring(0, indx);
		String SecondHalf = word.substring(indx);
		System.out.println(SecondHalf + FirstHalf + "ay");
	}
	
	public static void ruleThree (String word) {
		System.out.println(word + "ay");
	}	
}
		
//				} else  
////				else {
////					System.out.println("That's not a word my lame sir, good day.");
//					
////				}
//				// break?				
//			}			
////		}
////		return;
//	}

