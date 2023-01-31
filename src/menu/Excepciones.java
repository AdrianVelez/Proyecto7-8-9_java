package menu;

import java.math.BigDecimal;

public class Excepciones {

    public void dividePorCero() throws ArithmeticException{
        //BigDecimal decimal=new BigDecimal(10);
        //BigDecimal cero=new BigDecimal(0);
        //resul = decimal.divide(cero);

        int a=10;
        int b=0;
        int result;
        try {
            result=a/b;
            System.out.println("Demo codigo");

        } catch (ArithmeticException e) {
            //Exepcion hecha
            throw new ArithmeticException("Esto no puede hacerse");
            //throw e; Lanza una excepcion de la clasae ArithmeticExeption predeterminada.

        }



    }

}
