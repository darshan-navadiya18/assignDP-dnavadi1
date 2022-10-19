
public abstract class Person {

	private ProductMenu theProductMenu;
	protected Person(ProductMenu productMenu){
		this.theProductMenu = productMenu;
	}
	public abstract void showMenu();


	public void showAddButton() {

	}


	public void showViewButton() {

	}

	public void showRadioButton() {

	}


	public void showLabels() {

	}


	public abstract ProductMenu CreateProductMenu();

}
