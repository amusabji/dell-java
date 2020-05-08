import java.util.ArrayList;
import java.util.List;


public class FindFulcrum {
//  Input:
// 	4
//	12
//	13
//	14
//	15
	
//	output: -1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();		
		
		int a = findFulcrum(numbers);
		System.out.println(a);
	}
	
	public static int findFulcrum(List<Integer> numbers) {
        numbers.add(12);
        numbers.add(34);
        numbers.add(23);
        
        
        System.out.println(numbers);
		return numbers.indexOf(12);
    }

}
