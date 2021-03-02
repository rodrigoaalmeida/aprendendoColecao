package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemplosArrayList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        System.out.println("Elemento dois da lista: " + nomes.get(2));

        System.out.println("tamanho da lista: " + nomes.size());

        System.out.println("Busca de objeto na lista: " + nomes.contains("Anderson"));

        System.out.println("Busca de objeto na lista: " + nomes.contains("Fernando"));

        System.out.println("Mostra se lista esta vazia: " + nomes.isEmpty());

        System.out.println("Busca por indice: " + nomes.indexOf("Carlos"));

        for (String nomeDoItem: nomes){
            System.out.println("-->" + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("---->" + iterator.next());
        }

        nomes.clear();//limpa a lista toda

        System.out.println("Mostra se lista esta vazia: " + nomes.isEmpty());


    }
}
