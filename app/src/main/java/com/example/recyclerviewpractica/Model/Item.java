package com.example.recyclerviewpractica.Model;


// @Entity(tableName = "articulos")
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

    // Esta clase simplemente es para declarar lo que contiene cada Item
    /*
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "codigo")
    private int itemCodigo;

    @NonNull
    @ColumnInfo(name = "descripcion")
    private final String itemDescripcion;

    @NonNull
    @ColumnInfo(name = "fabricante")
    private final String itemFabricante;

    @NonNull
    @ColumnInfo(name = "categoria")
    private final String itemCategoria;

    @NonNull
    @ColumnInfo(name = "precio")
    private final double itemPrecio;

    public Item(@NonNull String itemDescripcion, @NonNull String itemFabricante, @NonNull String itemCategoria, double itemPrecio) {
        this.itemDescripcion = itemDescripcion;
        this.itemFabricante = itemFabricante;
        this.itemCategoria = itemCategoria;
        this.itemPrecio = itemPrecio;
    }

     */

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
