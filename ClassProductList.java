
public class ClassProductList extends ArrayList {

	private ProductIterator productIterator;

	private ReminderVisitor reminderVisitor;

	private Product[] product;

	public void accept(NodeVisitor visitor) {
		for (Product product:product
			 ) {
			visitor.visitProduct(product);
		}
	}

	@Override
	public ListIterator createIterator(ListIterator iterator) {
		return new ProductIterator();
	}
}
