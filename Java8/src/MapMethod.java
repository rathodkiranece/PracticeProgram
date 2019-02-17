import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

	
	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(3,2,4,5,6);		
		List<Integer> square=number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
			
		
	}
}
