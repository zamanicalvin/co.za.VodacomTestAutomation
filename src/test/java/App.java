record Product(int pNumber, String pName){
    static int regNo = 100;
    public int getRegNumber(){
        return regNo;
    }
}
public class App {
    public static void main(String[] args) {
        Product p1 = new Product (1111, "Ink Bottle");
    }
}
