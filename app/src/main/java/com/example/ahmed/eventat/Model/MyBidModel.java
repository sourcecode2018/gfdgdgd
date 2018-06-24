package com.example.ahmed.eventat.Model;

public class MyBidModel {
    private String productName;
    private String productSellingPricce;
    private String productVidValue;
    private String ID;
    private int productImage;
    private String ProductDescri;

    public MyBidModel(String productName, String productSellingPricce, String productVidValue, String ID, int productImage, String productDescri) {
        this.productName = productName;
        this.productSellingPricce = productSellingPricce;
        this.productVidValue = productVidValue;
        this.ID = ID;
        this.productImage = productImage;
        ProductDescri = productDescri;
    }

    public String getProductSellingPricce() {
        return productSellingPricce;
    }

    public String getProductVidValue() {
        return productVidValue;
    }

    public String getID() {
        return ID;
    }

    public int getProductImage() {
        return productImage;
    }

    public String getProductName() {

        return productName;
    }

    public String getProductDescri() {
        return ProductDescri;
    }
}
