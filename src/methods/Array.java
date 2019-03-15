package methods;

/**
 * Clase array con método de búsqueda lineal
 * @author german
 * @version 1.0
 * @since 15/3/2019
 */

public class Array {

    private int[] array = {5, 1, 22, 9, 12, 6, 8, 15, 21, 18, 17, 2, 11, 16};
    private int pos = 0;

    /**
     * Método de búsqueda lineal
     * @param x
     * @return sw
     */
    public boolean busquedaLineal(int x){
        boolean sw = false;

        for (int i = 0; i < array.length && !sw; i++) {
            if (array[i] == x){
                sw = true;
                pos = i;
            }
        }
        return sw;
    }

    /**
     * Getter de la posición del número buscado en el array
     * @return pos
     */
    public int getPos() {
        return pos;
    }
}
