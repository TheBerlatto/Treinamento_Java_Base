package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Criando HashSet com tipo amarrado
        //Set<String> listaAprovados = new HashSet<>(); NÃO RESPEITA A ORDEM DE INSERÇÃO
        TreeSet<String> listaAprovados = new TreeSet<String>(); //ORDEM ALFABÉTICA
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Mateus");
        listaAprovados.add("Eduardo");
        listaAprovados.add("Francesco");

        for (String candidato : listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n : nums){
            System.out.println(n);
        }
    }
}
