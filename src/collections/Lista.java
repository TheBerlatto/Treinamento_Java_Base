package collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        Usuario u1 = new Usuario("Luiza");
        listaUsuarios.add(u1);
        listaUsuarios.add(new Usuario("Eduardo"));
        listaUsuarios.add(new Usuario("Vini"));
        listaUsuarios.add(new Usuario("Ancelotti"));
        listaUsuarios.add(new Usuario("Rodrygo"));
        listaUsuarios.add(new Usuario("Alisha"));

        //Exibindo o elemento de indice 3 da lista
        System.out.println("Terceiro elemento da lista -> " + listaUsuarios.get(3));

        //Removendo pelo índice
        System.out.println("O usuário " + listaUsuarios.get(1).nome + " será removido!");
        listaUsuarios.remove(1);
        //Isso vai dar certo pois o equals e hashcode estão certos na clase Usuario
        listaUsuarios.remove(new Usuario("Alisha"));

        System.out.println("Percorrendo a lista...");
        for (Usuario u : listaUsuarios){
            System.out.println(u);
        }
    }
}
