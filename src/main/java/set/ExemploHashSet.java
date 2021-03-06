package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(4.0);
        notasAlunos.add(2.0);
        notasAlunos.add(23.0);
        notasAlunos.add(14.0);
        notasAlunos.add(55.0);

        System.out.println(notasAlunos);

        //notasAlunos.remove(3.8);

        notasAlunos.add(44.0);

        System.out.println(notasAlunos);

        System.out.println("Tamanho do Hashset: " + notasAlunos.size());

        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Double nota: notasAlunos){
            System.out.println("-->" + nota);
        }

        notasAlunos.clear();

        System.out.println("O HashSet está vazio? " + notasAlunos.isEmpty());
    }
}
