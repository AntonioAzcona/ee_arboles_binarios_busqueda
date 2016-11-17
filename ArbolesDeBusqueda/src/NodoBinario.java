/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class NodoBinario<T> {
    // Declaracion de los atributos
    private T dato;
    private NodoBinario<T> izq;
    private NodoBinario<T> der;
    /**
     * Declaracion del constructor
     * @param dato Es un parametro que representa el valor del nodo
     */
    public NodoBinario(T dato){
        this.dato = dato;
        izq = der = null;
    }
    /**
     * Declaracion del constructor
     */
    public NodoBinario(){
        dato = null;
        izq = der = null;
    }
    /**
     * Declaracion del contructor
     * @param izq Es un parametro que representa la referencia izquierda
     * @param dato Es un parametro que representa el valor del nodo
     * @param der Es un parametro que representa la referencia derecha
     */
    public NodoBinario(NodoBinario<T> izq, T dato, NodoBinario<T> der){
        this.izq = izq;
        this.dato = dato;
        this.der = der;
    }
    /**
     * Metodo que devuelve el dato
     * @return dato El dato
     */
    public T getDato() {
        return dato;
    }
    /**
     * Metodo del dato y no devuelve nada
     * @param dato Es un parametro del dato del Nodo
     */
    public void setDato(T dato) {
        this.dato = dato;
    }
    /**
     * Metodo que devuelve la referencia izquierda
     * @return izq La referencia izquierda
     */
    public NodoBinario<T> getIzq() {
        return izq;
    }
    /**
     * Metodo de la referrencia izquierda y no devuelve nada
     * @param izq Es un parametro de tipo NodoBinario
     */
    public void setIzq(NodoBinario<T> izq) {
        this.izq = izq;
    }
    /**
     * Metodo que devuelve la referencia derecha
     * @return der La referencia derecha
     */
    public NodoBinario<T> getDer() {
        return der;
    }
    /**
     * Metodo de la referrencia derecha y no devuelve nada
     * @param der Es un parametro de tipo NodoBinario
     */
    public void setDer(NodoBinario<T> der) {
        this.der = der;
    }
    /**
     * Metodo que nos devuelve el dato del NodoBinario
     * @return dato
     */
    @Override
    public String toString() {
        return dato+"";
    }

}
