import java.util.Scanner;

/**
 * @author Dante Sarotti
 * @version 0.1
 */
public class Herramientas {

    /**
     * Lee una cadena de caracteres desde la entrada estándar hasta recibir un asterisco.
     * 
     * @param scanner Un escaner de texto para recoger la entrada por teclado.
     * @param entrada Un String donde se guardará la entrada del usuario.
     * @return Un string con todos los caracteres que introdujo el usuario hasta el asterisco.
     */
    public static String solicitarTexto(){
        Scanner scanner = new Scanner(System.in);
        String entrada;

        //Establece "*" como caracter de salida.
        scanner.useDelimiter("\\*");
        entrada = scanner.next();
        scanner.close();
        return entrada;
    }
}