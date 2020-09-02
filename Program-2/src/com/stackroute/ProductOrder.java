package com.stackroute;

/*
 *This class contains  methods  to get product and producline item details
 */
public class ProductOrder {

    public static void main(String[] args) {
        Product product = new Product(123, "xxxx", "xxx");
        ProductLineItem productLineItem = new ProductLineItem(101, 1234, product);
        product.getProductDetails();
        productLineItem.getItemDetails();
    }
}
