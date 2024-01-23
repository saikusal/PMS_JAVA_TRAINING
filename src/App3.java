import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class App3 {
	
	public static void main(String args[]) {
		
		Integer[] nar = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		//Arrays.stream(nar).forEach(n->System.out.println(n));
		
//		Arrays.stream(nar).forEach(n->{
//		
//		if (n%2==0) 
//			System.out.println(n);
//		});
		
		Stream<Integer> narstream = Arrays.stream(nar);
//    	narstream.forEach(n->System.out.println(n));
		
		narstream
		.map(n->n-1)
		.filter(n->{return n%2==0;})
		.limit(10)
		.skip(1)
		.sorted((a,b)->b-a)
		.map(n->n*2)
		.filter(n->{return n%3==0;})
		.distinct()
//--> TO convert into a list .collect(Collectors.toList())
		.forEach(n->System.out.println(n));
		
//		List data = narstream.filter(n->n%2==0).collect(Collectors.toList())
		
//		for(int i=0; i<nar.length;i++) {
//			
//			System.out.println(nar[i]);
//		}
		
		
		List<String> names = new ArrayList();
		names.add("Sai");
		names.add("Thor");
		names.add("IronMan");
		names.add("SuperMan");
		names.add("Hulk");
		
//		names.stream().forEach(n->System.out.println(n));
		Stream<String> namesStream = names.stream();
		
		namesStream
		.filter(n->n.contains("o"))
		.peek(n->System.out.println(n))
		.filter(n->n.contains("I"))
		.forEach(n->System.out.println(n));

		
//		Stream<String> namesStream = names.stream();
//		
//		names.stream().forEach(n->System.out.println(n));
		
//      Creating a stream from direct values
		Stream<Integer> anyStream = Stream.of(1,2,3,4,6);
//		anyStream.forEach(n->System.out.println(n));
		
		//creating a stream for iteration
		
		Stream<Integer> itrStream = Stream.iterate(1, n->n+1).limit(20);
//		itrStream.forEach(n->System.out.println(n));
		
		List list1=Arrays.asList(23,45,67);
		List list2=Arrays.asList(45,67,98);
		List list3=Arrays.asList(14,67,88);
		
//		List<List<Integer>> mainList = new ArrayList();
//		
//		mainList.add(list1);
//		mainList.add(list2);
//		mainList.add(list3);
//		System.out.println(mainList);
//		
//		List newList = mainList.stream()
////		.flatMap((List l)->{return l.stream();})
//		.flatMap(l->l.stream())
////		.flatMap(l->l.stream().filter(n->n%2==0))
//		.filter(n->n%3==0)
//
//		.collect(Collectors.toList());
////		.forEach(n->System.out.println(n));
//		
//		System.out.println(newList);
		
		List<Integer> data=Arrays.asList(23,45,67,98);
		Integer out= data.stream()
//		.reduce((a,b)->{return a>b?a:b;})
//		.reduce((a,b)->a>b?a:b)
		.reduce((a,b)->a+b)
		.get();
		System.out.println(out);
		
		
	}

}
