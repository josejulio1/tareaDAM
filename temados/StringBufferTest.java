package dam.temados;

/**
 * Clase para realizar pruebas con la
 * clase StringBuffer
 * @author José Julio
 * @version 1.0
 */
public class StringBufferTest {
    public static void main(String[] args) {
        // Creación de un objeto de tipo StringBuffer con valor
        // Hola Mundo. StringBuffer es una clase mutable.
        StringBuffer stringBuffer = new StringBuffer("Hola Mundo");

        /*
         * Método append: permite juntar un valor de cualquier tipo
         * de dato con el String
         */
        stringBuffer.append(1234); // Tipo int
        System.out.println(stringBuffer); // Hola Mundo1234

        /*
         * Método delete: elimina toda la cadena que haya desde
         * la posición inicial que le hayamos indicado hasta
         * la posición final que le indiquemos
         */
        stringBuffer.delete(10, stringBuffer.length());
        System.out.println(stringBuffer); // Hola Mundo

        /*
         * Método deleteCharAt: elimina un carácter específico de la
         * cadena que le especifiquemos
         */
        stringBuffer.deleteCharAt(0); // H
        System.out.println(stringBuffer); // ola Mundo

        /*
         * Método insert: permite insertar en el StringBuffer un valor
         * de cualquier tipo de dato en una posición específica de la
         * cadena
         */
        stringBuffer.insert(4, true);
        System.out.println(stringBuffer); // ola trueMundo

        /*
         * Método reverse: revierte o pone invertida la cadena
         */
        stringBuffer.reverse();
        System.out.println(stringBuffer); // odnuMeurt alo

        /*
         * Método replace: reemplaza todo el texto que haya desde una
         * posición inicial definida hasta una posición final definida,
         * y como tercer parámetro, se le pasa la cadena que se quiere
         * cambiar en ese rango indicado
         */
        stringBuffer.replace(10, stringBuffer.length(), "Hola");
        System.out.println(stringBuffer); // odnuMeurt Hola

        /*
         * Método setCharAt: establece una posición indicada de la cadena
         * un carácter que le indiquemos, pudiendo incluso reemplazar un
         * carácter de una posición
         */
        stringBuffer.setCharAt(4, 'm');
        System.out.println(stringBuffer); // odnumeurt Hola

        /*
         * Método setLength: permite establecer la longitud máxima del
         * objeto de la clase StringBuffer
         */
        stringBuffer.setLength(100);
        System.out.println(stringBuffer.capacity()); // 100
    }
}
