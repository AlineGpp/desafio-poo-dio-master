import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Instrutor instrutor = new Instrutor("Camila");
        instrutor.adicionarCurso(curso1);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraria(9);

        Instrutor instrutor1 = new Instrutor("Denilson");
        instrutor1.adicionarCurso(curso2);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso javascript");
        curso3.setDescricao("descrição curso javascript");
        curso3.setCargaHoraria(10);

        instrutor1.adicionarCurso(curso3);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java");
        bootcamp.setDescricao("descrição bootcamp java");

        bootcamp.cursosDisponiveis(instrutor);
        bootcamp.cursosDisponiveis(instrutor1);



    }

}
