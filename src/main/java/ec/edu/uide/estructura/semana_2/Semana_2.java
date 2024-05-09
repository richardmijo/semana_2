/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.uide.estructura.semana_2;

/**
 *
 * @author desarrollo
 */
public class Semana_2 {
    
    // arreglo unidimensional
    private int [] arreglo1 = new int [10];
    
    private int [] arreglo2 = {1,2,3,4};
    
    //Un arreglo es una colección secuencial de elementos que tienen el mismo tipo
    private Object[] arreglo3 = {"22", 22, Boolean.FALSE, Long.parseLong("22")};
    
    
    // multidimensional
    private int [][][][] arreglo4 = new int[10][20][10][40];
    
    
    private Persona[] arreglo5 = new Persona[10];

    public static void main(String[] args) {
        Semana_2 clase= new Semana_2();
        clase.recorrido();
    }
    
    public void recorrido(){
        for(int dato: arreglo2){
            System.out.println(dato);
        }
    }
}
