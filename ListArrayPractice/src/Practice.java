import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrays
		String[] colors = {"red", "blue", "yellow"};
		System.out.println(colors[0]);
		int s = colors.length;
		
		String[][] board = new String[3][];
		// Staircase array
		board[0] = new String[1];
		board[1] = new String[2];
		board[2] = new String[3];
	}
	
	public static void Lists() {
		//List of Strings
		List<String> color = new ArrayList<>();
		color.add("Yellow");
		color.add("Blue");
		color.add("Red");
		
		int s = color.size();
		String blue = color.get(1);
		
		List<String> colors = Arrays.asList("red", "blue", "yellow");
	}
	
	public static class MyList {
		
		String[] store = new String[4];
		int size = 0;
		
		
		
		/**
		 * Adds a string to the List
		 * @param s
		 */
		public void add(String s) {
			store[size] = s;
			if (store.length == size) {
				String[] tmp = new String[size+10];
				
				for(int i=0; i<store.length; i++) {
					tmp[i] = store[i];
				}
				
				store = tmp;
			}
			store[size] = s;
			size++;
		}
		
		
		
		
		/**
		 * Returns the current size of the list
		 * @return the current size of the list
		 */
		public int size() {
			return size;
		}
		
		
		
		/**
		 * Returns the string at the position passed in 
		 * 
		 * @param 
		 * @return the string at the position passed in i
		 */
		public String get(int i) {
			if (i>=0 && i<size) {
				return store[i];
			}
			return null;
		}
		
		
		
		/**
		 * Removed the element from the list at the given position
		 *	 
		 */
		public void remove(int i) {
			for (int j=i; j < size-1 ; j++) {
				store[j] = store[j+1];
				store[j+1] = null;
			}
			size--;
		}
		
	}

}
