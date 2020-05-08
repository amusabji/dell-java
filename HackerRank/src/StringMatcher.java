
public class StringMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
	    String one = "banana";
	    String two = "baannneeea";
	    
	    String three = "bananaa";
	    String four = "lakjsdf";
	    
	    System.out.println(doesMatch(three, four));
	}
	
	public static boolean doesMatch(String one, String two) {
		
		char[] oneToChar = one.toCharArray();
	    System.out.println(oneToChar);
	    char[] twoToChar = two.toCharArray();
	    System.out.println(twoToChar);
	    // char length
	    int oneCharLength =  oneToChar.length;
	    int twoCharLength =  twoToChar.length;
	    // matches counter
	    int matches = 0;
	    
	    // apply some logic to find matches
	    for (int i = 0; i<oneCharLength; i++){
	      for (int j = 0; j<twoCharLength; j++){
	        System.out.println("@@@@@@@@@@@@");
	        System.out.println(i);
	        System.out.println(j);
	        System.out.println("@@@@@@@@@@@@");
	        if (oneToChar[i] == twoToChar[j]){
	          twoToChar[j] = 0;
	          matches++;
	          System.out.println("@@@@" + matches);
	          break;
	        }
	      }
	    }
	    
	    //logic to see if 2nd String contains enough matches as 1st string
	    System.out.println(matches);
	    if ( oneCharLength == matches ) {
	      System.out.println("TRUE");
	      return true;
	      
	    } 
	    System.out.println("FALSE");
	    return false;
	}

}
