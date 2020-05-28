package java8basic;

import java.util.Arrays;
import java.util.stream.IntStream;

/*https://gpcoder.com/3973-lop-collectors-trong-java-8/
*/
public class ReducingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		  int result = IntStream.of(1, 2, 3, 4).reduce(0, (a, b) -> a + b);
	int result1 = Arrays.stream(numbers).reduce(0, Integer::sum);
	
		  System.out.println(result1); // 10
	}

}
