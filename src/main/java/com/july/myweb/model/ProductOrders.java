/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.july.myweb.model;

/**
 *
 * @author Loi Dinh Oct 20, 2020
 * @version 1.0
 */
public class ProductOrders {
    private int orderId;
    private int productId;
    private int quantityProduct;
    private String nameProduct;

    public ProductOrders(int orderId, int productId, int quantityProduct, String nameProduct) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantityProduct = quantityProduct;
        this.nameProduct = nameProduct;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    
    
}
