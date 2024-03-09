package test;

import java.lang.reflect.Constructor;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MultiThreading {
	//	@Override
	//	public void run() {
	//		Thread currentThread = Thread.currentThread();
	//		for (int i = 1; i <= 10; i++) {
	//			System.out.println(i + " from " + currentThread.getName());
	//		}
	//		System.out.print(currentThread.getPriority());
	//
	//	}
	//
	//	public static void main(String[] args) {
	//		MultiThreading m = new MultiThreading();
	//		m.start();
	//		Thread currentThread = Thread.currentThread();
	//		currentThread.setPriority(MAX_PRIORITY);
	//		for (int i = 1; i <= 10; i++) {
	//			System.out.println(i + " from " + currentThread.getName());
	//		}
	//		//Thread currentThread = Thread.currentThread();
	//		//String name = currentThread.getName();
	//		//int priority = currentThread.getPriority();
	//		//System.out.println(name+" "+priority);
	//		//currentThread.setPriority(MAX_PRIORITY);
	//
	//		System.out.println(currentThread.getPriority());
	//	}
	
	
	
	
	
	// **********predefined functional interfaces****************//
	
	//@SuppressWarnings("unused")
//	public static void main(String[] args) {
//
//		Function<String, Integer> t = s -> s.length();
//		System.out.println(t.apply("hello"));
//		//String apply = t.apply("hello");
//
//		UnaryOperator<Integer> uo = num -> Integer.min(num, 1000);
//		System.out.println(uo.apply(989));
//
//		BiFunction<String, Integer, Character> bf = (st, in) -> st.charAt(in);
//		System.out.println(bf.apply("warning", 5));
//
//		BinaryOperator<Integer> bo = (t1, t2) -> t1 + t2;
//		System.out.println(bo.apply(10, 20));
//
//		Predicate<Integer> p = n -> n % 2 == 0;
//		System.out.println(p.test(23));
//
//		BiPredicate<String, String> bp = (s1, s2) -> s1.equalsIgnoreCase(s2);
//		System.out.println(bp.test("dorababu", "veerababu"));
//
//		Consumer<String> c = st -> {
//			
//			System.out.println(st.replace('a', 'z'));
//		};
//		c.accept("dorababu");
//
//		BiConsumer<String, String> bc = (s1, s2) -> {
//			String s3=s1.concat(s2);
//			System.out.println(s3);
//		};
//		bc.accept("dorababu", " reddipalli");
//
//		Supplier<Integer> s = () -> 2000;
//		System.out.println(s.get());
//
//	}
	Integer addition(Integer a,Integer b) {
		return a+b;
	}
	public static void main(String[] args) throws Exception {
		//MultiThreading m = MultiThreading.class.newInstance();
		Constructor<MultiThreading> constructor = MultiThreading.class.getConstructor();
		MultiThreading m = constructor.newInstance();
		MyInterface mi=m::addition;
		System.out.println(mi.sum(50, 50));
	}
	

}
