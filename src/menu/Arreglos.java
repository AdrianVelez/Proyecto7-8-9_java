package menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Arreglos {
    Scanner scan = new Scanner(System.in);

    public void arrayUnidimesional(int size){
        //creacion de array unidimencional
        String arryUni[] = new String[size];

        //rellenado
        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese cadena numero " + i + " :");
            String lee = scan.next();
            arryUni[i] = lee;
        }
        //impresion de arreglo
        System.out.println("Array: "+ java.util.Arrays.toString(arryUni));

        //recorrido de arreglo
        for (int i = 0; i < arryUni.length; i++) {
            System.out.println(arryUni[i]);
        }
    }

    public void arrayBidimensional(int size1, int size2) {
        //crea
        int arrayBi[][] = new int[size1][size2];
        int dato;
        //rellena
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.println("Ingrese la posicion [" + i + "] [" + j + "] del arreglo:");
                dato = scan.nextInt();
                arrayBi[i][j] = dato;
            }
        }
        //muestra
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.println("Arreglo [" + i + "] [" + j + "] dato: "+ arrayBi[i][j]);

            }
        }
    }

    public int aux=0;

    public void creaVector(int vini, int vfin) {
        Vector<Integer> vector = new Vector<>(vini, vfin);
        for (int i = 0; i <= vini; i++) {
            System.out.println("Ingresa el valor de la posicion: " + aux + " del Vector.");
            vector.add(scan.nextInt());
            aux++;

            //Al superar el tamaño de capacidad inicial, el vector aumenta en proporcion
            //al segundo valor que recibe, siendo asi su capacidad de elemento, si tuvieramos un vector con
            //capacidad inicial de 1000 ELementos, al superar esa cantidad, se estaria creando un vector mas,
            //con eL doble de elementos, ocasionando asi una carga de memoria muy grande para el procesador.
            //como en el sig ejemplo que cada ve incrementa su capacidad.

            if (aux > vini) {
                System.out.println("Superaste la capacidad del vector: " + vini);
                vini = vector.capacity();
                System.out.println(vector.toString());
                System.out.println("capacidad nueva: " + vini + "\n");
            }

            System.out.println("Desea eliminar alguna posicion: " +
                    "\n1.-si" +
                    "\n2.-no" +
                    "\n3.-Salir");
            int opcion = scan.nextInt();
            if (opcion == 1) {
                System.out.println("posicion: ");
                vector.remove(scan.nextInt());
                System.out.println(vector.toString());
                vini = vector.capacity();

            }
            if (opcion == 2) {
                System.out.println(vector.toString());
                vini = vector.capacity();

            }
            if (opcion == 3) {
                System.exit(0);
            }

        }

        System.out.println(vector);
    }

    public void vectorDefault(){
        Vector<Integer> vector=new Vector<Integer>();
        vector.add(2);
        vector.add(3);
        vector.add(5);
        vector.add(7);
        vector.add(8);
        System.out.println("Ejemplo de Vector de 5 elementos: "+ vector);
        System.out.println("tamaño: "+ vector.size());
        vector.remove(1);
        vector.remove(1);
        System.out.println("Se elimina elemento 2 y 3:");
        System.out.println(vector);
        System.out.println("capacidad: "+ vector.capacity());
    }
}


