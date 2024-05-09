/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ec.edu.uide.estructura.semana_2;

/**
 * Estructura de datos: funcionamiento de los arreglos
 *
 * @author richard
 */
public class Semana_2 {

    // arreglo unidimensional
    private int[] arreglo1 = new int[10];

    private int[] arreglo2 = { 2, 4, 21, 5, 8, 1, 10, 15, 7, 3};

    //Un arreglo es una colección secuencial de elementos que tienen el mismo tipo
    private Object[] arreglo3 = {"22", 22, Boolean.FALSE, Long.parseLong("22")};

    // multidimensional
    private int[][][][] arreglo4 = new int[10][20][10][40];

    // implementacion de arreglos irregulares (las direcciones de cada persona representan un arreglo irregular)
    private Persona[] arreglo5 = new Persona[10];

    public static void main(String[] args) {
        Semana_2 clase = new Semana_2();
        clase.ejecutar();
        
    }

    // formas de recorrer un arreglo
    public void recorrido(int[] arr) {
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arreglo2[i]);
        }*/

        // implementaciop optimizada
        for (int dato : arr) {
            System.out.println(dato);
        }
    }
    
    public void ejecutar(){
        // comprobar que esta desordenado
        System.out.println(">>>> 1. arreglo normal");
        recorrido(arreglo2);
        
        int[] arregloOrdenado = ordenamientoBurbuja(arreglo2);
        System.out.println(">>>> 2. arreglo ordenado");
        recorrido(arregloOrdenado);
        
        int indice =  busquedaBinaria(arregloOrdenado, 15);
        System.out.println(">>>> 3. busqueda binaria");
        System.out.println("\n\nel indice es: "+indice);
        
    }

    /**
     * Ordena un arreglo utilizando el algoritmo de ordenamiento burbuja.
     * @param arr Arreglo de enteros que será ordenado.
     * @return Arreglo ordenado.
     */
    public int[] ordenamientoBurbuja(int[] arr) {
        int n = arr.length; // Tamaño del arreglo
        boolean huboIntercambio; // Bandera para controlar si se hicieron intercambios en una pasada

        // Realizar pasadas sobre el arreglo
        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false; // Inicialmente no se han hecho intercambios

            // Comparar elementos adyacentes y hacer intercambios si es necesario
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] con arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    huboIntercambio = true; // Marcar que se ha hecho un intercambio
                }
            }

            // Si no se hicieron intercambios, el arreglo ya está ordenado
            if (!huboIntercambio) {
                break;
            }
        }

        return arr; // Devolver el arreglo ordenado
    }
    
    
    /**
     * Realiza una búsqueda binaria en un arreglo de enteros ordenado.
     * @param arr El arreglo ordenado donde se realizará la búsqueda.
     * @param clave El valor a buscar en el arreglo.
     * @return La posición del valor buscado en el arreglo, o -1 si el valor no se encuentra.
     */
    public static int busquedaBinaria(int[] arr, int clave) {
        int left = 0;              // Inicio del rango de búsqueda
        int right = arr.length - 1; // Fin del rango de búsqueda

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calcular el punto medio para evitar overflow

            // Verificar si el elemento está en la posición mid
            if (arr[mid] == clave) {
                return mid; // Elemento encontrado
            }

            // Decidir si buscar en la mitad izquierda o derecha
            if (arr[mid] < clave) {
                left = mid + 1; // Buscar en la mitad derecha
            } else {
                right = mid - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // Elemento no encontrado
    }
}
