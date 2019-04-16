
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) throws Exception {
		try {
			
			Set<String> set = new HashSet<String>(Arrays.asList(new String[] {"A", "B", "C", "D", "E"}));
			combination(new StringBuffer(), set);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void combination(StringBuffer input, Set<String> set) {
		for (String x : set) {
			StringBuffer buffer = new StringBuffer(input.toString());
			buffer.append(x);
			
			if (set.size() > 1) {
				Set<String> copy = new HashSet<String>();
				copy.addAll(set);
				copy.remove(x);
				combination(buffer, copy);
			} else {
				System.out.println(buffer.toString());
			}
		}
	}
	
}
