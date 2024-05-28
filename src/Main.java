import desafio.dominio.*;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Mentoria conteudo1 = new Mentoria();
        Curso conteudo2 = new Curso();
        Curso conteudo3 = new Curso();

        conteudo1.setTitulo("mentoria de Java");
        conteudo1.setDescricao("Essa mentoria é para inciantes de POO");
        conteudo1.setData(LocalDate.now());

        conteudo2.setTitulo("Curso PHP");
        conteudo2.setDescricao("Curso é para PHP");
        conteudo2.setCargaHoraria(15);

        conteudo3.setTitulo("Curso Python");
        conteudo3.setDescricao("Curso completo de Python");
        conteudo3.setCargaHoraria(20);

        System.out.println(conteudo1);
        System.out.println(conteudo2);


        Bootcamp bootcamp1 = new Bootcamp();
        Bootcamp bootcamp2 = new Bootcamp();

        bootcamp1.setNome("Trilha Java");
        bootcamp1.setDescricao("Fique fluente em Java em 15 dias");
        bootcamp1.getConteudos().addAll(Arrays.asList(conteudo1, conteudo2));

        bootcamp2.setNome("Trilha Python");
        bootcamp2.setDescricao("Fique fluente em Python em 10 anos");
        bootcamp2.getConteudos().addAll(Arrays.asList(conteudo1, conteudo3));

        Dev dev1 = new Dev();
        dev1.setNome("Carlos");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.printf("Conteudos inscritos de %s são : \n    %s", dev1.getNome(), dev1.getConteudosInscritos());
        System.out.printf("Conteudos concluidos de %s são : \n    %s", dev1.getNome(), dev1.getConteudosConcluidos());


        System.out.println("\n----------------");
        Dev dev2 = new Dev();
        dev2.setNome("Mario");
        dev2.inscreverBootcamp(bootcamp2);

        System.out.printf("Conteudos inscritos de %s são : \n    %s", dev2.getNome(), dev2.getConteudosInscritos());
        System.out.printf("Conteudos concluidos de %s são : \n    %s", dev2.getNome(), dev2.getConteudosConcluidos());

        dev2.progredir();
        System.out.println();

        System.out.printf("Conteudos inscritos de %s são : \n    %s", dev2.getNome(), dev2.getConteudosInscritos());
        System.out.printf("Conteudos concluidos de %s são : \n    %s", dev2.getNome(), dev2.getConteudosConcluidos());
    }
}
