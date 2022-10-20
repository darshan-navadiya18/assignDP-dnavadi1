import java.util.List;

public class ProductIterator implements ListIterator {

	private ClassProductList classProductList;
	private List<Product> productList;
	private int position=0;

	public ProductIterator(List<Product> productList) {
		this.productList = productList;
	}


	@Override
	public boolean hasNext() {
		return position < productList.size() && productList.get(position) != null;

	}


	@Override
	public Product Next() {
		Product product = productList.get(position);
		position += 1;
		return product;
	}


	@Override
	public void MoveToHead() {
		position=0;

	}


	@Override
	public void Remove() {

	}

}
