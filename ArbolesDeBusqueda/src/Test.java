/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Definicion de la Clase Test
 * @author Antonio Azcona
 */
public class Test {
    /**
     * Metodo para ejecutar el programa
     * @param args Es un parametro por default
     */
    public static void main(String[] args) {
    /**
     * Creacion de una instancia de ArbolBST
     */
    ArbolBST<Integer> arbolBST = new ArbolBST<Integer>();
    /**
     * Metodo que inserta un dato a la raiz
     * @param NodoBinario
     */
    arbolBST.setRaiz(new NodoBinario(0));
    arbolBST.Insercion_ABB(arbolBST.getRaiz(), 20);
    arbolBST.Insercion_ABB(arbolBST.getRaiz(), 13);
    arbolBST.Insercion_ABB(arbolBST.getRaiz(), 19);
    arbolBST.Insercion_ABB(arbolBST.getRaiz(), 15);
    arbolBST.Insercion_ABB(arbolBST.getRaiz(), 12);
    arbolBST.Insercion_ABB(arbolBST.getRaiz(), 32);
    
    arbolBST.posorden(arbolBST.getRaiz());
    System.out.println();
        
    arbolBST.Busqueda_ABB(arbolBST.getRaiz(), 15);
    arbolBST.Busqueda_v1_ABB(arbolBST.getRaiz(), 32);
    System.out.println();
    
    arbolBST.eliminar(arbolBST.getRaiz(), 19);
    //arbolBST.Eliminacion_ABB(arbolBST.getRaiz(), 19);
    
    arbolBST.posorden(arbolBST.getRaiz());
    
    }
    //BTreePrinter.printNode(arbolBST.getRaiz());
}