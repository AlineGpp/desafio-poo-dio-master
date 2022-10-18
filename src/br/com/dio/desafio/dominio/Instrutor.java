package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Instrutor {
    private String nomeInstrutor;

    private Set<Curso> cursosMinistrados = new LinkedHashSet<>();

    public Instrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public Set<Curso> getCursosMinistrados() {
        return cursosMinistrados;
    }

    public void setCursosMinistrados(Set<Curso> cursosMinistrados) {
        this.cursosMinistrados = cursosMinistrados;
    }

    public void adicionarCurso(Curso curso) {
        this.cursosMinistrados.add(curso);
    }

}

