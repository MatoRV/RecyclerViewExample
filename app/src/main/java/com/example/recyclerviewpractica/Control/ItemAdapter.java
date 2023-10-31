package com.example.recyclerviewpractica.Control;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpractica.Model.Item;
import com.example.recyclerviewpractica.R;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    // Instancia de la lista de Items
    private List<Item> itemList = new ArrayList<>();

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }


    // Este método crea un nuevo view para el RecyclerView obteniendo el contenido del layout item_list.xml
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    // Este método sirve para actualizar el view de un elemento recibiendo la posicion del elemento correspondiente
    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ViewHolder holder, int posicion) {
        Item item = itemList.get(posicion);
        holder.tvItemCodigo.setText("Codigo: "+item.getItemCodigo());
        holder.tvItemDescripcion.setText(item.getItemDescripcion());
        holder.tvItemFabricante.setText("Fabricante: "+item.getItemFabricante());
        holder.tvItemCategoria.setText("Categoria: "+item.getItemCategoria());
        holder.tvPrecio.setText("Precio: "+item.getItemPrecio()+"€");
    }

    // Este método sirve para obtener la cantidad de Items
    @Override
    public int getItemCount() {
        return itemList.size();
    }

    // Clase que extiende el RecyclerView en la que se declara lo que contiene cada ItemViewHolder
    // Optimiza la vista, facilita la asignación de datos
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvItemCodigo;
        TextView tvItemDescripcion;
        TextView tvItemFabricante;
        TextView tvItemCategoria;
        TextView tvPrecio;

        public ViewHolder(View view) {
            super(view);
            tvItemCodigo = view.findViewById(R.id.textViewCodigo);
            tvItemDescripcion = view.findViewById(R.id.textViewDescripcion);
            tvItemFabricante = view.findViewById(R.id.textViewFabricante);
            tvItemCategoria = view.findViewById(R.id.textViewCategoria);
            tvPrecio = view.findViewById(R.id.textViewPrecio);
        }
    }
}
