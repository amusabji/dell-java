import java.util.Arrays;

public class SockMerchant {

	public static void main(String[] args) {
	    int n = 9;

	    int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println(sockMerchant(n, ar));
    
	}
	
	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int match = 0;
        for (int i = 0; i<n-1; i++) {
        	if (ar[i] == ar[i+1]) {
        		match++;
        		i++;
        	}
        }
        return match;
    }
}
