
public abstract class Person {

	protected ProductMenu theProductMenu;
	//TODO: make theProductMenu private and add a Getter method.
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
