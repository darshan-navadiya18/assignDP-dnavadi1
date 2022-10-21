import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facade {
	Scanner sc = new Scanner(System.in);
	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;


//	private ClassProductList theProductList;

	public List<Product> getTheProductList() {
		return theProductList;
	}

	private List<Product> theProductList = new ArrayList<>();

	private Person thePerson;


	public boolean login() {
		Login login = new Login();
		login.login();
		this.UserType = login.getUserType();
		createUser(new UserInfoItem());
		return false;
	}


	public void addTrading() {

	}


	public void viewTrading() {

	}

	public void decideBidding() {

	}


	public void discussBidding() {

	}


	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {
		if(UserType == 0){
			System.out.println("What do you want to buy? \n 1. Meat \n 2. Produce");
			int choice = Integer.parseInt(sc.nextLine());
			nProductCategory=choice;
			Buyer buyer = new Buyer(nProductCategory);
			buyer.CreateProductMenu();
			buyer.showMenu();

		}else{
			System.out.println("What do you want to buy? \n 1. Meat \n 2. Produce");
			int choice = Integer.parseInt(sc.nextLine());
			nProductCategory=choice;
			Seller seller = new Seller(nProductCategory);
			seller.CreateProductMenu();
			seller.showMenu();
			createProductList();
			SelectProduct();
		}
	}

	public void createProductList() {
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
				theProductList.add(new Product(dict[1], dict[0]));

			}

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}	}


	public void attachProductToUser() {

	}

	public Product SelectProduct() {
		System.out.println("Select product: ");
		String p = sc.nextLine();
//		System.out.println(p);
		for (Product product:
			 theProductList) {
			if(product.getName().toLowerCase().equals(p)){
				theSelectedProduct = product;
				System.out.println("you selected:  "+theSelectedProduct.getName());
				return product;
			}
		}

		return null;
	}

	public void productOperation() {

	}

}
