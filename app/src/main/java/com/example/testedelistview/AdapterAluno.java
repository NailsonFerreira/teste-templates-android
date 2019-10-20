package com.example.testedelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterAluno extends BaseAdapter {


    private final Context context;
    private List<Aluno> alunos;

    public AdapterAluno(Context context, List<Aluno> alunos) {
        this.context = context;
        this.alunos = alunos;
    }

    @Override
    public int getCount() {
        return alunos.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view = new TextView(context);
        Aluno aluno = alunos.get(position);
        view.setText(aluno.toString());

        LayoutInflater inflater = LayoutInflater.from(context);
        View inflateView = inflater.inflate(R.layout.content_aluno, null);
        TextView nomeAl = inflateView.findViewById(R.id.nome_aluno);
        TextView apelidoAl = inflateView.findViewById(R.id.apelido_aluno);

        nomeAl.setText(aluno.getNome());
        apelidoAl.setText(aluno.getApelido());

        return inflateView;
    }
}
