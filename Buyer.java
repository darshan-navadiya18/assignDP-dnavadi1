import java.util.Objects;

public class Buyer extends Person {

	Buyer(ProductMenu productMenu) {
		super(productMenu);
	}

	public void showMenu() {
		MeatProductMenu meatProductMenu = new MeatProductMenu();
		ProduceProductMenu productMenu = new ProduceProductMenu();
		String[] theProductMenuArr = theProductMenu.toString().split("@");
		String[] meatProductMenuArr = meatProductMenu.toString().split("@");

		if (theProductMenuArr[0].equals(meatProductMenuArr[0]) ){
			meatProductMenu.showMenu();

		} else{
			productMenu.showMenu();
		}

	}



	public ProductMenu CreateProductMenu() {
		return null;
	}

}
