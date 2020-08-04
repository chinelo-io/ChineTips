/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.mor.chinelo.tip1;

import java.util.HashMap;

/**
 *
 * @author Marco Antonio Barrios Molina | Chinelo Fundator | www.chinelo.io
 */
public class Product {

    private String id;
    private String tax;
    private String cost;
    private String price;
    private HashMap<String, String> permission; //is that get value.

    public Product() {
        this.permission = new HashMap<>();
        this.permission.put("idOperacionUno", "Descripción Operacion Uno");
        this.permission.put("idOperacionDos", "Descripción Operacion Dos");
        this.permission.put("idOperacionTres", "Descripción Operacion Tres");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public HashMap<String, String> getPermission() {
        return permission;
    }

    public void setPermission(HashMap<String, String> permission) {
        this.permission = permission;
    }

}
