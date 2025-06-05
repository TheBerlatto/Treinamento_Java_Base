package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        //Collections não suportam tipos primitivos, por isso existe o cast implícito
        //Não aceita repetição
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("O tamanho é: " + conjunto.size());

        conjunto.add('X');
        System.out.println("O tamanho é: " + conjunto.size()); //adicionado pois o X é maiúsculo

        //Remove algo
        conjunto.remove('X');
        System.out.println("O tamanho é: " + conjunto.size()); //adicionado pois o X é maiúsculo

        //Verifica se existe algo
        System.out.println(conjunto.contains("Teste"));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        //Diferente do array, o print já sai estruturado
        System.out.println(nums);
        System.out.println(conjunto);

        //União entre dois conjuntos(altera o conteúdo sem uma ordem)
        //conjunto.addAll(nums);
        System.out.println(conjunto);

        //Intersecção entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        //Limpa o conjunto
        conjunto.clear();
        System.out.println(conjunto);
    }
}
