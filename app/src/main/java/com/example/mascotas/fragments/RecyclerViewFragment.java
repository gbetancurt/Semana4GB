package com.example.mascotas.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mascotas.DatosMascota;
import com.example.mascotas.R;
import com.example.mascotas.adapter.MascotaAdaptador;

import java.util.ArrayList;


public class RecyclerViewFragment extends Fragment {
    ArrayList<DatosMascota> mascotas;
    private RecyclerView ListaMascotas;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        ListaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }
    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        ListaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<DatosMascota>();
        mascotas.add(new DatosMascota("Rex",R.drawable.perro1));
        mascotas.add(new DatosMascota("Tiki",R.drawable.perro2));
        mascotas.add(new DatosMascota("Toreto",R.drawable.perro3));
        mascotas.add(new DatosMascota("Alighieri",R.drawable.perro4));
        mascotas.add(new DatosMascota("Bethoven",R.drawable.perro5));
        mascotas.add(new DatosMascota("Joaquin",R.drawable.perro6));
        mascotas.add(new DatosMascota("Nagasaki",R.drawable.perro7));
    }

}
