package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioArrayList {

    public static void main(String[] args) {

        List<String> pessoas = new ArrayList<>();

        pessoas.add("Juliana");
        pessoas.add("Pedro");
        pessoas.add("Carlos");
        pessoas.add("Larissa");
        pessoas.add("João");

        System.out.println(pessoas);

        pessoas.set(2, "Roberto");
        System.out.println(pessoas);

        System.out.println(pessoas.get(1));

        System.out.println(pessoas.get(4));

        pessoas.remove("João");

        System.out.println(pessoas.size());

        System.out.println(pessoas.contains("Juliano"));

        List<String> pessoasNovas = new ArrayList<>();

        pessoasNovas.add("Ismael");
        pessoasNovas.add("Rodrigo");

        pessoas.addAll(pessoasNovas);
        System.out.println(pessoas);

        Collections.sort(pessoas);
        System.out.println(pessoas);

        System.out.println("Lista esta vazia? " + pessoas.isEmpty());

    }
}
