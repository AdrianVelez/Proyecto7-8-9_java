import menu.*;
import music.MusicLibrary;
import music.Song;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArithmeticException, IOException {
        Arreglos array = new Arreglos();
        ArregloListas list = new ArregloListas();
        Excepciones excepcion = new Excepciones();
        Ficheros fichero = new Ficheros();

        //******************
        Song song = new Song();
        MusicLibrary musicLibrary = new MusicLibrary();

        Scanner scan = new Scanner(System.in);

        System.out.println("""
                Menu: 1.- String reverse\s
                2.-Array unidimensional.
                3.-Array bidimensional\s
                4.-Vectores\s
                5.-ArrayList String\s
                6.-ArrayList Int\s
                7.-Division por cero\s
                8.-Inputstream\s
                9.-Copia de InputStream a PrintStream\s 
                10.-Sorpresa\s
                """);

        int menu = scan.nextInt();
        switch (menu) {

            case 1:
                StringReverse texto = new StringReverse();
                System.out.println(texto.reverseText("hola mundo"));
                System.out.println(texto.reverseText2("Hola mundo cruel"));
                break;

            case 2:
                System.out.println("Ingresa tamaño de Array String: ");
                int size = scan.nextInt();
                array.arrayUnidimesional(size);
                break;

            case 3:
                System.out.println(" Ingresa primera dimension: ");
                int size1 = scan.nextInt();
                System.out.println(" Ingresa segunda dimension: ");
                int size2 = scan.nextInt();
                array.arrayBidimensional(size1, size2);
                break;

            case 4:
                array.vectorDefault();
                System.out.println("\nCrea Vector con valor inicial y de incremento: ");
                System.out.println("Ingresa capacidad inicaial de vector: ");
                int capa1 = scan.nextInt();
                System.out.println("Ingresa Incremento de Vector: ");
                int capa2 = scan.nextInt();
                array.creaVector(capa1, capa2);
                break;

            case 5:
                list.listString();
                break;

            case 6:
                list.arrayInt();
                break;

            case 7:
                excepcion.dividePorCero();
                break;
            case 8:
                try {
                    InputStream fileIn = new FileInputStream("C:\\Users\\salmerof\\IdeaProjects\\File.txt");
                    PrintStream fileOut = new PrintStream("C:\\Users\\salmerof\\IdeaProjects\\Destino.txt");

                    try {
                        //Recorrido de fichero
                        fichero.recorridoFichero(fileIn);
                        System.out.println("Lectura exitosa!!");
                    } catch (IOException e) {
                        System.out.println("No se pudo leer fichero: " + e.getMessage());
                    }

                } catch (FileNotFoundException e) {
                    System.out.println(" El fichero no se encontro: " + e.getMessage());
                }
                break;

                case 9:
                    InputStream fileIn = new FileInputStream("C:\\Users\\salmerof\\IdeaProjects\\File.txt");
                    PrintStream fileOut = new PrintStream("C:\\Users\\salmerof\\IdeaProjects\\Destino.txt");
                    //copiado de Input a Print
                    fichero.copiadoFichero(fileIn, fileOut);
                    System.out.println("Copiado Exitoso a Carpeta de destino.");
                    break;

            case 10:

                Map<String, String> songs = new HashMap<>();

                try {
                    Process p = new ProcessBuilder("explorer.exe","C:\\Users\\salmerof\\IdeaProjects\\Proyecto7-8-9_java\\src\\music\\Proyecto Music Library\\Lyrics desordenado").start();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                    int op=0;
                    do {
                        try {

                            System.out.println("Ingresa nombre de fihero: ");
                        String name = scan.next();
                        InputStream lyrics = new FileInputStream("C:\\Users\\salmerof\\IdeaProjects\\Proyecto7-8-9_java\\src\\music\\Proyecto Music Library\\Lyrics desordenado\\" + name + ".txt");

                            System.out.println("Ingrese Artista: ");
                            //Solo de esa manera el nextLine dejo de saltar lineas, concatenando otro string.
                            String author = scan.next().concat(scan.nextLine());

                            System.out.println("Ingrese titulo de lyrics correcto: ");
                            String nameSong = scan.nextLine();

                            //Se crea Input a Print de manera ordenada y correcta
                            PrintStream copy = new PrintStream("C:\\Users\\salmerof\\IdeaProjects\\Proyecto7-8-9_java\\src\\music\\Proyecto Music Library\\Lyrics ordenado\\" + author +"_" + nameSong +".txt");

                        songs.put(author, nameSong);
                            for (Map.Entry<String, String> entry : songs.entrySet()) {
                                System.out.println("Artista: " + entry.getKey() + ", Nombre de Cancion: " + entry.getValue());
                            }
                            musicLibrary.inputCopy(lyrics,copy);
                            musicLibrary.addSong(nameSong, author, lyrics);

                            System.out.println("\n ************************");
                            System.out.println();
                        System.out.println("Presiona 1 para continuar o 0 para salir:");
                        op = scan.nextInt();

                        }catch (IOException e ){
                            System.out.println("El archivo no se encuentra. "+ e.getMessage());
                            System.out.println("Presione 1 para continuar o presione 0 para salir: ");
                            op = scan.nextInt();
                        }

                    } while (op == 1);

                //Muestra ventana de ficheros ordenados.
                    System.out.println("Ficheros ordenados: ");
                try {
                    Process p = new ProcessBuilder("explorer.exe","C:\\Users\\salmerof\\IdeaProjects\\Proyecto7-8-9_java\\src\\music\\Proyecto Music Library\\Lyrics ordenado").start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }

    }
}