import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
    private String username="";
    private String password="";

    public int getUserType() {
        return userType;
    }

    private int userType=0;
    HashMap<String, String> buyers = new HashMap<>();
    HashMap<String, String> sellers = new HashMap<>();

    public void getCredentials(){
        File buyerInfo = new File(
                "textFiles/BuyerInfo.txt");
        File sellerInfo = new File(
                "textFiles/SellerInfo.txt");

        try {
            Scanner sc = new Scanner(buyerInfo);
            Scanner scanner = new Scanner(sellerInfo);
            String st;

            while (sc.hasNextLine()){
                st = sc.nextLine();
                String[] temp = st.split(":");
                buyers.put(temp[0], temp[1]);

            }
            while(scanner.hasNextLine()){
                st = scanner.nextLine();
                String[] temp = st.split(":");
                sellers.put(temp[0], temp[1]);
            }
//            for (String key:
//                 buyers.keySet()) {
//                System.out.println(key+ " "+buyers.get(key));
//            }
//            for (String key:
//                    sellers.keySet()) {
//                System.out.println(key+ " "+sellers.get(key));
//            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        return ;
    }
    public boolean login(){
        Scanner in = new Scanner(System.in);
        System.out.println("Username: ");
        username = in.nextLine();
        System.out.println("Password: ");
        password = in.nextLine();
        getCredentials();
        if(buyers.containsKey(username)){
            if(password.equals(buyers.get(username))){
                System.out.println("Welcome! "+ username + " You are a Buyer");
                userType=0;
                return true;
            }else{
                System.out.println("Invalid Credentials for this Buyer");
                return false;
            }
        } else if (sellers.containsKey(username)){
            if(password.equals(sellers.get(username))){
                System.out.println("Welcome! "+ username + " You are a Seller");
                userType=1;

                return true;
            }else{
                System.out.println("Invalid Credentials for this Seller");
                return false;

            }
        }else{
            System.out.println("No such user exist in the database");
            return false;
        }
//        System.out.println(username);
//        System.out.println(password);

    }

}
