import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // ----------------------------------------------------------------
        Curso cursoN = new Curso();
        cursoN.setTitulo("Curso Java");
        cursoN.setDescricao("POO em Java");
        cursoN.setCargaHoraria(10);

        Curso cursoB = new Curso();
        cursoB.setTitulo("Curso Js");
        cursoB.setDescricao("JJavaScript");
        cursoB.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao da mentoria ");
        mentoria.setData(LocalDate.now());

        // -----------------------------------------------------------------------
        /*System.out.println(cursoN);
        System.out.println(cursoB);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Boot Java Developer");
        bootcamp.getConteudos().add(cursoN);
        bootcamp.getConteudos().add(cursoB);
        bootcamp.getConteudos().add(mentoria);

        Dev devMateus = new Dev();
        devMateus.setNome("MK");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos" + devMateus.getConteudosInscritos());
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("----");
        System.out.println("\nConteudos Inscritos" + devMateus.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos" + devMateus.getConteudosConcluidos());
        System.out.println("XP:" + devMateus.calcularTotXp());

        System.out.println("----------------------------------------------------------------");

        Dev devJP = new Dev();
        devJP.setNome("João");
        devJP.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos" + devJP.getConteudosInscritos());
        devJP.progredir();
        devJP.progredir();
        devJP.progredir();
        devJP.progredir();
        System.out.println("----");
        System.out.println("\nConteudos Inscritos" + devJP.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos" + devJP.getConteudosConcluidos());
        System.out.println("XP:" + devJP.calcularTotXp());



    }
}
