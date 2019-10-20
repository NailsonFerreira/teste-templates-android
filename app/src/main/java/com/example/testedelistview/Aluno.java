package com.example.testedelistview;

public class Aluno {

    private String nome;
    private String apelido;

    public Aluno(String nome, String idade) {
        this.nome = nome;
        this.apelido = idade;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return nome + " - " + apelido;
    }
}
