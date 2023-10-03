
public class Tarea1 {
    
    /** 
     * @param args argumentos de entrada
     */
    public static void main(String[] args) {

        //Solicitar al usuario que introduzca el texto
        System.out.println("Introduzca una cadena de caracteres. Finalice con \"*\"");
        String resultado = Herramientas.solicitarTexto();
        System.out.println("\n------\nResultado:\n------\n");

        //Mostrar el resultado
        System.out.println(resultado);
    }
}