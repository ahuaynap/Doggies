package com.example.trabajofinalinterfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class PerritosLista extends AppCompatActivity {
    ListView simpleList;
    private ItemAdapter itemAdapter= null;

    ItemPerrito perritosList[] = {new ItemPerrito("Se Perdio"),
            new ItemPerrito("Ayuda!"),
            new ItemPerrito("Encontrado"),
            new ItemPerrito("Me Perdi"),
            new ItemPerrito("Ayudame")};

    int fotos[] = {R.drawable.perrito, R.drawable.perrito, R.drawable.perrito, R.drawable.perrito, R.drawable.perrito, R.drawable.perrito};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perritos_lista);

        simpleList = (ListView) findViewById(R.id.simpleListView);
        itemAdapter = new ItemAdapter(getApplicationContext(), perritosList, fotos);
        simpleList.setAdapter(itemAdapter);
    }


}
