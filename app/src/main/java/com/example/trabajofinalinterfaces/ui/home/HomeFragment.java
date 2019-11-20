package com.example.trabajofinalinterfaces.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.trabajofinalinterfaces.ItemAdapter;
import com.example.trabajofinalinterfaces.ItemPerrito;
import com.example.trabajofinalinterfaces.R;
import android.os.Bundle;
import android.widget.ListView;

public class HomeFragment extends Fragment {


    ListView simpleList;
    private HomeViewModel homeViewModel= null;

    ItemPerrito perritosList[] = {new ItemPerrito("Se Perdio"),
            new ItemPerrito("Ayuda!"),
            new ItemPerrito("Encontrado"),
            new ItemPerrito("Me Perdi"),
            new ItemPerrito("Ayudame")};

    int fotos[] = {R.drawable.perrito, R.drawable.perrito, R.drawable.perrito, R.drawable.perrito, R.drawable.perrito, R.drawable.perrito};




    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {





        homeViewModel =  ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
               // getActivity().setContentView(R.layout.fragment_home);
                simpleList = (ListView) getActivity().findViewById(R.id.simpleListView);
                ItemAdapter itemAdapter = new ItemAdapter(getActivity().getApplicationContext(), perritosList, fotos);
                simpleList.setAdapter(itemAdapter);
            }
        });



        return root;
    }
}