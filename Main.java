public class Main {
    public static void main(String[] args) {
//        ProduceProductMenu pm = new ProduceProductMenu();
//        try{
//            pm.showMenu();
//
//        }catch (Exception e){
//
//        }

//        MeatProductMenu pm = new MeatProductMenu();
        try{
            Buyer buyer = new Buyer(new ProduceProductMenu());
            buyer.showMenu();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
