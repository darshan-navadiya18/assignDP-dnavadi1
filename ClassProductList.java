import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassProductList extends ArrayList {

	private ProductIterator productIterator;

	private ReminderVisitor reminderVisitor;
	Facade f = new Facade();
	private List<Product> products;

	public ClassProductList() {
		products = f.getTheProductList();
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
