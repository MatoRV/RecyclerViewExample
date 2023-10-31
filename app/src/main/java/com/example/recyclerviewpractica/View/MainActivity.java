package com.example.recyclerviewpractica.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.recyclerviewpractica.Control.ItemAdapter;
import com.example.recyclerviewpractica.Model.Item;
import com.example.recyclerviewpractica.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Instancia de RecyclerView
    private RecyclerView mRecyclerView;
    // Instancia del adaptador
    private ItemAdapter itemAdapter;

    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa el RecyclerView
        mRecyclerView = findViewById(R.id.recycler_view);

        itemList = new ArrayList<>();
        itemList.add(new Item(1,"ADAPTADOR DVI MACHO A HDMI HEMBRA","OEM","Accesorios","3.91"));
        itemList.add(new Item(2,"SOPLADOR DE POLVO","CRC","Accesorios","4.81"));
        itemList.add(new Item(3,"EXTREME III 4GB","Sandisk","Almacenamiento","26.05"));
        itemList.add(new Item(4,"LS11 2.0 STEREO","Logitech","Audio/Video","12.48"));

        // Configura el adaptador
        itemAdapter = new ItemAdapter(itemList);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(itemAdapter);

    }
}