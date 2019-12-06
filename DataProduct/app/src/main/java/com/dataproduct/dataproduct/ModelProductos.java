package com.dataproduct.dataproduct;

public class ModelProductos {
    private String Product;
    private int valor,cantidad,total;


    public ModelProductos() {
    }

    public ModelProductos(String product, int valor, int cantidad, int total) {
        Product = product;
        this.valor = valor;
        this.cantidad = cantidad;
        this.total = total;

    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public int getTol1() {
        return total;
    }

    public void setTol1(int tol1) {
        this.total = total;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
