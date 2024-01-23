import java.util.*;
import java.util.stream.Stream;


public class App2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Product1> products= new ArrayList<Product1>();
			
		for (int i=0;i<2;i++) { 
		
		System.out.println("Enter your name");
		String name=sc.next();
		
		System.out.println("Enter the price");
		int price=sc.nextInt();
		
		System.out.println("Enter the Category");
		String category =sc.next();
		
		System.out.println("Enter quantity");
		int quantity=sc.nextInt();
		
			
		Product1 P2= new Product1(name, price, category, quantity);
				
		products.add(P2);
		};
		
//		for(Product1 p:products)System.out.println(p);
		
		//System.out.println(products.get(0));
		
//		Stream<String> namesStream = products.stream();
		Stream<Product1> productStream = products.stream();
		System.out.println("Enter :");
		String category=sc.next();
		productStream.filter(n->n.getName().equalsIgnoreCase(category))
		.forEach(product1->System.out.println(product1));
		
				
				
	}
	
	

}
