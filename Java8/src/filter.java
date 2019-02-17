import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter {
public static void main(String[] args) {
	List<String> names=Arrays.asList("Rahtod","Kiran","Aarav");
	List<String> result=names.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
System.out.println(result);
}
}
