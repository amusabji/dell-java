
public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		long n = 10;
		repeatedString(s, n);
				
	}
	
	static long repeatedString(String s, long n) {
		//ans = # of a's in string multiplier
		long ans = 0;
		char[] c = s.toCharArray();
		int length = c.length;
		int numOfAs = 0;
		// count numOfAs in string before repeating.
		for (int i = 0; i<length; i++) {
			if (c[i] == 'a') {
				numOfAs++;
			}
		}
		
//		find multiplier..
		int divide = (int) (n/numOfAs);
		System.out.println(divide);
		
		int remainder = (int) (n%length);
		System.out.println(remainder);
		
		
		
		return ans;
    }

}
