package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Offer e Add -> Adicionam elementos na fila
        //Diferença é o comportamento quando a fila está CHEIA
        fila.add("Ana"); //Se cheio -> Exceção.
        fila.offer("Bia"); //Se cheio -> Simplesmente não adiciona.
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //Peek e Element -> obtem o próximo elemento da fila sem remover
        //Diferença é o comportamento quando a fila está VAZIA
        System.out.println(fila.peek()); //Se vazio, retorna nulo
        System.out.println(fila.element()); //Se vazio, retorna uma exceção

        //Poll -> obtem o próximo elemento da fila REMOVENDO
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        //fila.clear();
        //fila.isEmpty();
        //fila.size();
    }
}
