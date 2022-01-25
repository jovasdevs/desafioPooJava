package br.com.jovas.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Do Básico ao Avançado");
        curso1.setCargaHoraria(60);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Do Básico ao Avançado");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Desafio Programação Orientada Objeto");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Básico");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJovas = new Dev();
        devJovas.setNome("Jovas");
        devJovas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jovas: " + devJovas.getConteudosInscritos());
        devJovas.progredir();
        System.out.println("=============================================================================================================");
        System.out.println("Conteúdos Inscritos Jovas: " + devJovas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jovas: " + devJovas.getConteudosConcluidos());
        System.out.println("XP: " + devJovas.calcularTotalXp());

        System.out.println("===============");

        Dev devGigi = new Dev();
        devGigi.setNome("Gigi");
        devGigi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gigi: " + devGigi.getConteudosInscritos());
        devGigi.progredir();
        System.out.println("==============================================================================================================");
        System.out.println("Conteúdos Inscritos Gigi: " + devGigi.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Gigi: " + devGigi.getConteudosConcluidos());
        System.out.println("XP: " + devGigi.calcularTotalXp());

    }

}
