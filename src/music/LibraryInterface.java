package music;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public interface LibraryInterface {


    void addSong(String author, String nameSong, InputStream lyics) throws IOException;

    void inputCopy( InputStream lyrics, PrintStream copy);
}
