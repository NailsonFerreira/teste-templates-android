package com.example.testedelistview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FragmentAluno extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final List<Aluno> listAlunos = new ArrayList<>();


        for (int i = 0; i < 12; i++) {
            listAlunos.add(new Aluno("Aluno " + i, "APELIDO " + i));
        }

        ArrayAdapter<Aluno> listaAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, listAlunos);

        AdapterAluno alunoAd = new AdapterAluno(getContext(), listAlunos);


        View view = inflater.inflate(R.layout.fragment_teste, container, false);
        final ListView viewListAlunos = view.findViewById(R.id.lista_alunos_fragment);
        viewListAlunos.setAdapter(alunoAd);

        viewListAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "Aluno: " + listAlunos.get(position).getNome(), Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
