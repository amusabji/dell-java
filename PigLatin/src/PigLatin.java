import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World! Welcome to the Pig Latin translator");
		String aword = UserInput();
//		int VowelIdx = VowelIndx(UserInput());
		TranslateIt(aword);

	}
	
	public static String UserInput() {
		// asking user for input
		System.out.println("Please type in an English word to be tranlated");
		//read the input of the user
		Scanner reader = new Scanner(System.in);
		//place the input of the user into a variable
		String englishWord = reader.next();
		reader.close();
		//TODO: error handling for bad input data
		return englishWord;
	}
	// word = pig
	public static void TranslateIt (String word) {
		char[] stringToChar = word.toCharArray();
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};		
		for (int i = 0; i < stringToChar.length-1; i++) {
			for (int j = 0; j < vowels.length; j++) {				 
				int VowelIndex = 0;
				System.out.println(VowelIndex);
				String translatedWord = new String();				
//				System.out.println("stringToChar[i]: " + stringToChar[i]);
//				System.out.println("vowels[j]: " + vowels[j]);
				if (stringToChar[i] == vowels[j]) {					
//					System.out.println("stringToChar[i] == vowels[j]: true");
//					VowelIndex = word.indexOf(i);
					System.out.println(i);
					System.out.println(i);
					if (VowelIndex == 0) {
						System.out.println(word + "yay");
						break;
					} else {
						System.out.println(VowelIndex);
						String FirstHalf = word.substring(0, VowelIndex);
						System.out.println(FirstHalf);
						String SecondHalf = word.substring(VowelIndex);
						System.out.println(SecondHalf);
						translatedWord = SecondHalf + FirstHalf + "ay";
						System.out.println(translatedWord);
						break;
					}
				} else if ((stringToChar[i] == 'y') && (i == stringToChar.length-1)) {
//					System.out.println("stringToChar[i] == 'y': true");
					VowelIndex = word.indexOf('y');
					String FirstHalf = word.substring(0, VowelIndex);
					String SecondHalf = word.substring(VowelIndex);
					translatedWord = SecondHalf + FirstHalf + "ay";
					System.out.println(translatedWord);
					break;
				} 
//				else {
//					System.out.println("That's not a word my lame sir, good day.");
					
//				}
				// break?				
			}			
		}
		return;
	}
}
