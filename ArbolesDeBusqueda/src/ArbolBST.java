/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Definicion de la clase ArbolBST
 * Esta clase contiene metodos que los traduje del libro de Cairo
 * @author Antonio
 */
public class ArbolBST<T extends Comparable<T>> extends Arbol {
   
    /**
     * Este metodo busca un elemento
     * @param nodo Es un parametro de tipo NodoBinario
     * @param infor Es un parametro de la informacion del nodo
     * @author Antonio
     */
    public void Busqueda_ABB(NodoBinario<T> nodo, T infor){
        if(infor.compareTo(nodo.getDato()) < 0){
            if(nodo.getIzq() == null){
                System.out.println("La informacion no se encuentra en el árbol");
            }else{
                Busqueda_ABB(nodo.getIzq(), infor);
            }
        }else{
            if(infor.compareTo(nodo.getDato()) > 0){
                if(nodo.getDer() == null){
                    System.out.println("La información no se encuentra en el árbol");
                }else{
                    Busqueda_ABB(nodo.getDer(), infor);
                }
            }else{
                System.out.println("La informacion está en el árbol");
            }
        }    
    }
    /**
     * Este metodo busca un elemento
     * @param nodo Es un parametro de tipo NodoBinario
     * @param infor Es un parametro de la informacion del nodo
     * @author Antonio
     */
    public void Busqueda_v1_ABB(NodoBinario<T> nodo, T infor){
       if(nodo != null){
           if(infor.compareTo(nodo.getDato()) < 0){
               Busqueda_v1_ABB(nodo.getIzq(), infor);
           }else{
               if(infor.compareTo(nodo.getDato()) > 0){
                   Busqueda_v1_ABB(nodo.getDer(), infor);
               }else{
                   System.out.println("La informacion se encuentra en el arbol");
               }
           }
       }else{
           System.out.println("La informacion no se encuentra en el árbol");
       } 
    }
    /**
     * Este metodo inserta un elemento en donde le corresponda en el Arbol
     * @param nodo Es un parametro de tipo NodoBinario
     * @param infor Es un parametro de la informacion del nodo
     * @author Antonio
     */
    public void Insercion_ABB(NodoBinario<T> nodo, T infor){
        if(infor.compareTo(nodo.getDato()) < 0){
            if(nodo.getIzq() == null){
                NodoBinario<T> otro = new NodoBinario<T>();
                otro.setIzq(null);
                otro.setDer(null);
                otro.setDato(infor);
                nodo.setIzq(otro);
            }else{
                Insercion_ABB(nodo.getIzq(), infor);
            }
        }else{
            if(infor.compareTo(nodo.getDato()) > 0){
                if(nodo.getDer() == null){
                    NodoBinario<T> otro = new NodoBinario<T>();
                    otro.setIzq(null);
                    otro.setDer(null);
                    otro.setDato(infor);
                    nodo.setDer(otro);
                }else{
                    Insercion_ABB(nodo.getDer(), infor);
                }
            }else{
                System.out.println("El nodo ya se encuentra en el árbol");
            }
        }
    }
    /**
     * Este metodo que inserta un elemento en cualquier parte del arbol que le corresponda
     * @param nodo Es un parametro de tipo NodoBinario
     * @param infor Es un parametro de la informacion del nodo
     * @author Antonio
     */
    public void Insercion_v1_ABB(NodoBinario<T> nodo, T infor){
        if(nodo != null){
            if(infor.compareTo(nodo.getDato()) < 0){
                Insercion_v1_ABB(nodo.getIzq(), infor);
            }else{
                if(infor.compareTo(nodo.getDato()) > 0){
                    Insercion_v1_ABB(nodo.getDer(), infor);
                }else{
                    System.out.println("La informacion ya se encuentra en el árbol");
                }
            }
        }else{
            NodoBinario<T> otro = new NodoBinario<T>();
            otro.setIzq(null);
            otro.setDer(null);
            otro.setDato(infor);
            nodo = otro;
        }
    }
    /**
     * Este metodo que eimina un elemento del arbol 
     * @param nodo Es un parametro de tipo NodoBinario
     * @param infor Es un parametro de la informacion del nodo
     * @author Antonio Azcona
     */
    public void Eliminacion_ABB(NodoBinario<T> nodo, T infor){
        NodoBinario<T> otro = null;
        NodoBinario<T> aux = null;
        NodoBinario<T> aux1 = null;
        boolean bo;
        if(nodo != null){
            if(infor.compareTo(nodo.getDato()) < 0){
                Eliminacion_ABB(nodo.getIzq(), infor);
            }else{
                if(infor.compareTo(nodo.getDato()) > 0){
                    Eliminacion_ABB(nodo.getDer(), infor);
                }else{
                    otro = nodo;
                    if(otro.getDer() == null){
                        nodo = otro.getIzq();
                    }else{
                        if(otro.getIzq() == null){
                            nodo = otro.getDer();
                        }else{
                            aux = nodo.getIzq();
                            bo = false;
                            while(aux.getDer() == null){
                                aux1 = aux;
                                aux = aux.getDer();
                                bo = true;
                            }
                            nodo.setDato(aux.getDato());
                            otro = aux;
                            if(bo == true){
                                aux1.setDer(aux.getIzq());
                            }else{
                                nodo.setIzq(aux.getIzq());
                            }
                        }
                    }
                }
            }
        }else{
            System.out.println("La informacion a eliminar no se encuentra en el arbol");
        }
    }
    /**
     * Este metodo que elimina un elemento en cualquier parte del arbol
     * @param nodo Es un parametro de tipo NodoBinario
     */
    
    //@autor León
    public void eliminaNodo(NodoBinario<T> nodo, Integer direccion){
        NodoBinario<T> otro, aux, aux1;
        if (direccion == -1){
          otro = nodo.getIzq();
        }else{
          otro = nodo.getDer(); 
        }
        if (otro.getDer() == null){
            if (direccion == -1){
              nodo.setIzq(otro.getIzq());
            }else{
                nodo.setDer(otro.getIzq()); 
            }
                    
        }else{
            if (otro.getIzq() == null){
                if (direccion == -1){
                      nodo.setIzq(otro.getDer());
                    }else{
                        nodo.setDer(otro.getDer()); 
                    }
            }else{
                aux = otro.getIzq();
                aux1 = aux;
                while (aux.getDer() != null){
                    aux1 = aux;
                    aux = aux.getDer();
                }
                otro.setDato(aux.getDato());
                if (aux == aux1){
                    otro.setIzq(null);
                }else{                
                  aux1.setDer(null);
                }               
            }
        }
    }
    /**
     * Este metodo que elimina un elemento en cualquier parte del arbol
     * @param nodo Es un parametro de tipo NodoBinario
     * @param dato Es un parametro de la informacion del nodo
     */
    
    //@autor León
    public void eliminar(NodoBinario<T> nodo, T dato){
        NodoBinario<T> aux, otro;
            if (dato.compareTo(nodo.getDato()) < 0){
                if (nodo.getIzq() != null){
                    if (dato.compareTo(nodo.getIzq().getDato()) == 0){
                        // Este es el nodo
                        eliminaNodo(nodo, -1);
                        
                    }else{
                        eliminar(nodo.getIzq(), dato);
                    }
                }
                
            }else{
                if (dato.compareTo(nodo.getDato()) > 0){
                    if (nodo.getDer() != null){
                        if (dato.compareTo(nodo.getDer().getDato()) == 0){
                            // Este es el nodo
                            eliminaNodo(nodo, 1);
                            
                        }else{
                            eliminar(nodo.getDer(), dato);
                        }
                    }
                    
                }
            }
    }
    
    /*
    public void _insertar(NodoBinario<T> raiz, T dato){
        if(dato.compareTo(raiz.getDato()) < 0){
            if(raiz.getIzq() == null){
                raiz.setIzq(new NodoBinario(dato));
            }else{
                if(dato.compareTo(raiz.getDato()) > 0){
                    if(raiz.getDer() == null){
                        raiz.setDer(new NodoBinario(dato));
                    }else{
                        _insertar(raiz.getDer(), dato);
                    }
                }
            }
        }
    }
    public Integer insertar(T dato){
        if(raiz == null){
            raiz = new NodoBinario<T>(dato);
        }else{
            _insertar(raiz, dato);
        }
        return 0;
    }
    
    public void buscar(NodoBinario<T> raiz, T dato){
        if(raiz != null){
            if(dato.compareTo(raiz.getDato()) < 0){ //Voy a la izquierda
                buscar(raiz.getIzq(), dato);
            }else if(dato.compareTo(raiz.getDato()) > 0){ // Voy a la derecha
                buscar(raiz.getDer(), dato);
            }else{
                System.out.println("El objeto se encontró en el arbol");
            }
        }else{
            System.out.println("No se encontró el objeto");
        }
    }
    
    public void busqueda(NodoBinario<T> raiz, T dato){
        if(dato.compareTo(raiz.getDato()) < 0){
            if(raiz.getIzq() == null){
                System.out.println("La informacion no se encuentra en el árbol");
            }else{
                busqueda(raiz.getIzq(), dato);
            }
        }else if(dato.compareTo(raiz.getDato()) > 0){
                if(raiz.getDer() == null){
                    System.out.println("La informacion no se encuentra en el arbol");
                }else{
                    busqueda(raiz.getDer(), dato);
                }         
        }else{
                 System.out.println("La informacion está en el arbol");  
        }
    }*/
    //> Der
    //< Izq    

    @Override
    public String toString() {
        return raiz+"";
    }
}
