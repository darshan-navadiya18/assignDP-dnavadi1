import javax.swing.plaf.metal.MetalLookAndFeel;
import java.util.Objects;

public class Buyer extends Person {

	Buyer(ProductMenu productMenu) {
		super(productMenu);
	}

	public void showMenu() {
			theProductMenu.showMenu();


	}



	public ProductMenu CreateProductMenu() {
		return null;
	}

}
