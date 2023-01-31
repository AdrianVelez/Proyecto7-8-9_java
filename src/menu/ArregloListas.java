package menu;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArregloListas {

    public void listString() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Mundo");
        list.add("array");
        list.add("list");
        System.out.println(list);
        //copiado de arrayList a LinkedList
        LinkedList<String> linked = new LinkedList<String>(list);
        System.out.println(linked);

        //for each para recorrer array list
        System.out.println("Recorrido de ArrayList: ");
        for (String i : list) {
            System.out.println(i);
        }
        System.out.println("Recorrido de LinkedList: ");
        //for iterador para recorrer linkedList
        for (int i = 0; i < linked.size(); i++) {
            System.out.println(linked.get(i));
        }

    }


    public void arrayInt() {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(i);
            System.out.println(lista.get(i));
        }

        lista.removeIf(n -> (n % 2 == 0));
        System.out.println("ArrayList sin numeros pares: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}







