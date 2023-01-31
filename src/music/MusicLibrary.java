package music;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MusicLibrary implements LibraryInterface {

    ArrayList<Song> arraySong = new ArrayList();
    @Override
    public void addSong(String author, String nameSong, InputStream lyrics) throws IOException {

        String copiaC="";
        byte datos[] = lyrics.readAllBytes();
        for (byte dato: datos){
            System.out.print((char) dato);
        }
        copiaC = new String(datos);

    }

    @Override
    public void inputCopy(InputStream lyrics, PrintStream copy) {

        try {
            byte datos[] = lyrics.readAllBytes();
            for (byte dato: datos){
                System.out.print((char) dato);
            }
            copy.write(datos);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
