import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;

import java.util.*;
import java.util.stream.Stream;

class StackUtil
{
	// Iterate through Stack in Java
	public static void main (String[] args)
	{
		// if we use Stack, output will be [1, 2, 3]
		Stack<Integer> stack = new Stack<>();

		// if we use Deque, output will be [3, 2, 1]
		// Deque<Integer> stack = new ArrayDeque<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		/* Using Iterator */
		
		// 1. Using Iterator to iterate through Stack
		Iterator<Integer> itr = stack.iterator();

		// hasNext() returns true if the stack has more elements
		while (itr.hasNext())
		{
			// next() returns the next element in the iteration
			System.out.println(itr.next());
		}
		
		// 2. Using enhanced for loop (uses Iterator internally)
		for (Integer item: stack) {
			System.out.println(item);
		}

		/* Java 8 and above */

		// 3. Java 8 - get stream and use lambda expression
		stack.stream().forEach(S -> System.out.println(S));

		// 4. Java 8 - get stream and provide method reference
		stack.stream().forEach(System.out::println);

		// 5. Java 8 - Stream.of() + toArray() + forEach()
		Stream.of(stack.toArray()).forEach(System.out::println);

		// 6. Java 8 - stack inherit forEach() from Iterable interface
		stack.forEach(System.out::println);

		// 7. Java 8 - iterator() is inherited from Collection interface
		stack.iterator().forEachRemaining(System.out::println);


		/* using Enumeration */

		// 8. convert the stack into a vector and use Enumeration interface
		@Deprecated
		Enumeration<Integer> enumeration = new Vector(stack).elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		// 9. Collections.enumeration() returns an enumeration
		enumeration = Collections.enumeration(stack);
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}


		/* Converting Stack to String using toString() function */

		// 10. calling toString() on stack
		System.out.println(stack.toString());

		// 11. using Stream.of()
		Stream.of(stack.toString()).forEach(System.out::println);


		/* Converting Stack to Array using toArray() function */

		Integer[] arr = null;

		// 12. use Stack.toArray(Integer[]) that returns an Integer[] array
		arr = stack.toArray(new Integer[stack.size()]);
		System.out.println(Arrays.toString(arr));

		// 13. without allocating any memory (JVM will take care)
		arr = stack.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr));

		// 14. use Stack.toArray() that returns an Object[] array
		System.out.println(Arrays.toString(stack.toArray()));

		// 15. Java 8 - Streams + method references
		System.out.println(Arrays.toString(
								stack.stream().toArray(Integer[]::new)
						));

		// 16. Java 8 - Streams + lambda expressions
		arr = stack.stream().toArray(n -> new Integer[n]);
		System.out.println(Arrays.toString(arr));

		// 17. using FluentIterable class from Guava Library
		arr = FluentIterable.from(stack).toArray(Integer.class);
		System.out.println(Arrays.toString(arr));

		// 18. using Iterables class from Guava Library
		arr = Iterables.toArray(stack, Integer.class);
		System.out.println(Arrays.toString(arr));
	}
}