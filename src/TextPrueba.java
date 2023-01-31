import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TextPrueba {


    public static void main(String[] args) throws IOException {



        //Apertura de explorador de archivos
        try {

            Process p = new ProcessBuilder("explorer.exe","C:\\Users\\salmerof\\IdeaProjects\\Proyecto Music Library").start();
        } catch (IOException e) {
            e.printStackTrace();
        }


        InputStream lyrics = new FileInputStream("C:\\Users\\salmerof\\IdeaProjects\\Proyecto Music Library\\" +"s1.txt");
        PrintStream out =new PrintStream(lyrics.toString() );



        String palabra = "world";
        ArrayList<String> ordena=new ArrayList<>();

        byte datos[] = lyrics.readAllBytes();

        String copiaC = "";
        for (byte dato: datos){
            //System.out.print((char) dato);
        }
        copiaC = new String(datos);
        /*System.out.println(copiaC);
        System.out.println();

        ordena.add(copiaC);
        System.out.println(ordena);
*/
        Map<String,String> cancion = new HashMap<>();

        cancion.put("strokes", copiaC);
        cancion.put("nirvana", copiaC);
        System.out.println(cancion);


        ;


    }
}
