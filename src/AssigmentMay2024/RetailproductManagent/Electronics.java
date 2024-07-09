package AssigmentMay2024.RetailproductManagent;

public class Electronics extends Product {

    private int warrantyPeriod;

    public static void main(String[] args) {
        var objectElectroin=new Electronics("Ipad",200,5);
        objectElectroin.printElectronicInfo();
    }

    public Electronics(String productName, double price, int warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {return warrantyPeriod;}
    public void setWarrantyPeriod(int warrantyPeriod) {this.warrantyPeriod = warrantyPeriod;}

    public  void printElectronicInfo(){
        System.out.println("Product Name:"+getProductName());
        System.out.println("Price :"+getPrice()+" $");
        System.out.println("Warranty Period :"+getWarrantyPeriod()+" Months");
    }
}
