import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Instrutor instrutor = new Instrutor("Camila");


        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraria(9);

        Instrutor instrutor1 = new Instrutor("Denilson");

        Curso curso3 = new Curso();
        curso3.setTitulo("curso javascript");
        curso3.setDescricao("descrição curso javascript");
        curso3.setCargaHoraria(10);

        instrutor1.adicionarCurso(curso3);

        Curso curso4 = new Curso();
        curso4.setTitulo("curso kotlin");
        curso4.setDescricao("descrição curso kotlin");
        curso4.setCargaHoraria(10);
        instrutor.adicionarCurso(curso4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java");
        bootcamp.setDescricao("descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);



        Dev dev = new Dev();
        dev.setNome("João");
        dev.inscreverBootcamp(bootcamp);
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);

        System.out.println("Olá, " + dev.getNome() + "! Você está inscrito no bootcamp!");


        System.out.println("Olá, " + dev.getNome() + "!" + " os outros cursos disponíveis além do bootcamp são:");
        dev.cursosDisponiveis(instrutor);
        dev.cursosDisponiveis(instrutor1);







    }

}
