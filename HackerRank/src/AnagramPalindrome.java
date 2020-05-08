import java.util.Arrays;
public class AnagramPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "carrace";
		System.out.println(AnagramPalindrome(word));
	}
	
		public static boolean AnagramPalindrome(String word) {
			char[] w = word.toCharArray();
			int doubledChar = 0;
			int wordLength = w.length;
			// find # of double Char
			for (int i=0; i<wordLength-1; i++) {
				for (int j=i+1; j<=wordLength-1; j++) {
//					while (i < wordLength && j < wordLength) {
						if (w[i] == w[j]) {
							doubledChar++;
//							i++;
							break;
						}
//						return false;
//					}
					 			
						
				}
			
			}
			
			// for true, we NEED 2x doubleChar for even num'd words
			// OR
			// 2x double Char for odd-1 num'd words	
			if (wordLength%2 == 0) {			
				// check doubledChar
				if (doubledChar == wordLength / 2) {
					return true;
				}
			} else { //wordlength is odd
				if (doubledChar == (wordLength-1) / 2) {
					return true;
				}
			}
			return false;
	    }

}
