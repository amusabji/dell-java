
public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n = 8;
	    String s = "UDDDUDUU";
		System.out.println(countingValleys(n, s));
	}
	
	static int countingValleys(int n, String s) {
		int position = 0;
		int numOfValleys = 0;
		
		char[] steps = s.toCharArray();
		for (int i=0; i<n; i++) {
			if (steps[i] == 'U') {
				position++;
			} else if (steps[i] == 'D'){
				if (position == 0) {
					numOfValleys++;
				}
				position--;
			}
		}
		
		return numOfValleys;
    }

}
