package com.example.recyclerviewpractica.Model;


public class Item {

    private int itemCodigo;
    private String itemDescripcion;
    private String itemFabricante;
    private String itemCategoria;
    private String itemPrecio;

    public Item(int itemCodigo,String itemDescripcion,String itemFabricante,String itemCategoria, String itemPrecio) {
        this.itemCodigo = itemCodigo;
        this.itemDescripcion = itemDescripcion;
        this.itemFabricante = itemFabricante;
        this.itemCategoria = itemCategoria;
        this.itemPrecio = itemPrecio;
    }
    public int getItemCodigo() {
        return itemCodigo;
    }

    public String getItemDescripcion() {
        return itemDescripcion;
    }

    public String getItemFabricante() {
        return itemFabricante;
    }

    public String getItemCategoria() {
        return itemCategoria;
    }

    public String getItemPrecio() {
        return itemPrecio;
    }
}
