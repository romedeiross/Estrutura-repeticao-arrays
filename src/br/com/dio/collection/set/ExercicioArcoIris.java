package br.com.dio.collection.set;
import java.util.*;

public class ExercicioArcoIris {
    public static void main(String[] args) {
        //Crie uma conjunto contendo as cores do arco-íris
        Set<String> cores = new HashSet<>();
        cores.add("vermelho");
        cores.add("laranja");
        cores.add("amarelo");
        cores.add("verde");
        cores.add("azul");
        cores.add("anil");
        cores.add("violeta");

        //a) Exiba todas as cores o arco-íris uma abaixo da outra;
        System.out.println("Exibindo todas as cores o arco-íris uma abaixo da outra:");
        for (String cor : cores) {
            System.out.println(cor);
        }
        //b) A quantidade de cores que o arco-íris tem;
        System.out.println("\nO arco-íris tem " + cores.size() + " cores ");

        //c) Exiba as cores em ordem alfabética;
        System.out.println("\nOrdem alfabética das cores");
        Set<String> ordemCores = new TreeSet<>(cores);
        System.out.println(ordemCores);

        //d) Exiba as cores na ordem inversa da que foi informada;
        System.out.println("\nOrdem inversa das cores");
        Set<String> ordemInversa = new LinkedHashSet<>(
                Arrays.asList("vermelho", "amarelo", "violeta", "laranja", "verde", "azul", "anil"));
        System.out.println(cores);

        List<String> coresArcoIrisList = new ArrayList<>(ordemInversa);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        // e) Exiba todas as cores que começam com a letra ”v”;
        System.out.println("\nExibindo cores que começam com a letra v: ");
        for (String cor : cores) {
            if (cor.startsWith("v"))
                System.out.println(cor);
        }

        // f) Remova todas as cores que não começam com a letra “v”;
        System.out.println("\nRemovendo cores que começam com a letra v: ");
        Iterator<String> removeCoresLetraV = cores.iterator();
        while (removeCoresLetraV.hasNext()) {
            if (removeCoresLetraV.next().startsWith("v")) removeCoresLetraV.remove();
        }
        System.out.println(cores);

        // g) Limpe o conjunto;
        System.out.println("\nLimpando o conjunto: ");
        cores.clear();

        // h) Confira se o conjunto está vazio;
        System.out.println("\nO conjunto está vazio? " + cores.isEmpty());

    }
}
