import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassProductList extends ArrayList {

	private ProductIterator productIterator;

	private ReminderVisitor reminderVisitor;

	private List<Product> products;

	public ClassProductList() {
		products = new ArrayList<>();
		File file = new File(
				"textFiles/ProductInfo.txt");

		try {
			BufferedReader br
					= new BufferedReader(new FileReader(file));
			Scanner sc = new Scanner(file);
			String st;

			while (sc.hasNextLine()){
				st = sc.nextLine();
				String[] dict = st.split(":");
				products.add(new Product(dict[1], dict[0]));
//				if(dict[0].equals("Produce")){
//					System.out.println(dict[1]);
//				}

			}

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void accept(NodeVisitor visitor) {
		for (Product product: products
			 ) {
			visitor.visitProduct(product);
		}
	}
	public ListIterator createIterator() {
		return new ProductIterator(this.products);
	}
}
