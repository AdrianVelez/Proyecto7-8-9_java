package menu;

import java.io.*;

public class Ficheros {

    public void recorridoFichero(InputStream fileIn) throws IOException {

        // otra manera de leer archivo por pedazos es con un arreglo de  bytes:
        // fileIn.read(new byte[5]);

        //De esta manera se lee por buffer
        BufferedInputStream buffer = new BufferedInputStream(fileIn);
        int datos2 = buffer.read();
        while (datos2 != -1) {
            System.out.print((char) datos2);
            datos2 = buffer.read();

        }
//De esta manera se lee por bytes.
/*
       byte datos[] = fileIn.readAllBytes();
       for (byte dato: datos){
            System.out.print((char) dato);
       }
*/
    }

    public void copiadoFichero( InputStream fileIn, PrintStream fileOut) throws IOException {

        //copiado.
        try {
            byte in[] = fileIn.readAllBytes();
            fileOut.write(in);
            fileOut.print("\n");
            fileOut.println("'Copia de InputStream'" );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
