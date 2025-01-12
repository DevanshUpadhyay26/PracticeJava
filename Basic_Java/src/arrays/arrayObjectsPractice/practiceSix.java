package arrays.arrayObjectsPractice;


import java.util.Scanner;

class Product{

    private String productName;
    private int productPrice;

    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
//    public String toString(){
//        return "ProductName " + productName + "\n" +
//                "Product Price " + productPrice;
//    }
}

public class practiceSix {

    public static Product[] getSortedPrice(Product[] products){

        for (int i = 0 ; i < products.length - 1 ; i++){
            for(int j = 0; j < products.length - i -1; j++){
                if(products[j].getProductPrice() > products[j+1].getProductPrice()){
                    Product temp = products[j];
                    products[j] = products[j+1];
                    products[j+1] = temp;
                }
            }
        }
        return products;}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[3];
        for (int i = 0; i < products.length ; i++) {
            String productName = sc.nextLine();
            int productPrice = sc.nextInt();sc.nextLine();
            products[i] = new Product(productName,productPrice);
        }

        Product[] getSortedPrice = getSortedPrice(products);


        for (int i = 0; i <getSortedPrice.length ; i++) {
            System.out.println("ProductName " + products[i].getProductName()+ "\n" +
                    "Product Price " + products[i].getProductPrice());
        }


    }
}
