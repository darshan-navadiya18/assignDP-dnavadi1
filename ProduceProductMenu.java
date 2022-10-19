import java.io.*;
import java.util.Scanner;

public class ProduceProductMenu extends ProductMenu {

	public void showMenu() {
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
				if(dict[0].equals("Produce")){
					System.out.println(dict[1]);
				}

			}

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public void showAddButton() {

	}


	public void showRadioButton() {

	}


	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
