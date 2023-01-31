package menu;

public class StringReverse {


    public String reverseText(String texto) {
        //texto.length -1, por que nuestro for empieza a recorrer desde la posicion 0
        // en este ejemplo hola mundo tiene 10 de longitud, por lo que el length lanzara un 10 de longitud.
        //el for empezara:0,1,2,3,4,5,6,7,8,9, hasta terminar en 10, cubriendo asi en total 11 posiciones en total.
        // Ocacionando asi un desbordamiento de bytes.
        //por ello se resta una posicion al length, para recorrer exactamente los 10 caracteres del String
        // y no provocar un error de desbordamiento de bytes.

        String texto2 = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            texto2 = texto2 + texto.charAt(i);
        }
        System.out.println("Texto recibido: " + texto);

        return texto2;
    }
    //Segunda manera de voltear la cadena de texto.
    // Se crea variable con el tamaño de nuestra cadena y por cada iteracion que realiza el for
    // nuestra variable entera hace un decremento hasta llegar a 0,
    // de esta manera instanciando asi todos los bytes de la cadena y se asigna a un nuevo String.

    public String reverseText2(String texto) {
        String texto2 = "";
        int reverse = texto.length();

        for (int i = 0; i < texto.length(); i++) {
            reverse--;
            texto2 = texto2 + texto.charAt(reverse);
        }
        System.out.println("Texto recibido: " + texto);

        return texto2 ;
    }


}
