package com.whatsapp.cursoandroid.jamiltondamasceno.whatsapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whatsapp.cursoandroid.jamiltondamasceno.whatsapp.R;
import com.whatsapp.cursoandroid.jamiltondamasceno.whatsapp.adapter.ConversasAdapter;
import com.whatsapp.cursoandroid.jamiltondamasceno.whatsapp.model.Conversa;

import java.util.ArrayList;
import java.util.List;

public class ConversasFragment extends Fragment {

    private RecyclerView recyclerViewConversas;
    private List<Conversa> listaConversa = new ArrayList<>();
    private ConversasAdapter adapter;

    public ConversasFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_conversas, container, false);

        recyclerViewConversas = view.findViewById(R.id.recyclerViewListaConversas);

        //Configurar adapter
        adapter = new ConversasAdapter(listaConversa, getActivity());

        //Configurar recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerViewConversas.setLayoutManager( layoutManager );
        recyclerViewConversas.setHasFixedSize(true);
        recyclerViewConversas.setAdapter( adapter );

        return view;
    }

}
