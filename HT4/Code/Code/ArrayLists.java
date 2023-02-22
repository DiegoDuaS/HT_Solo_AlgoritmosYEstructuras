/**
 * @author: Sofia Garcia, Diego Duarte, Marcela Cordon (HT2 Grupo 9)
 * 
 * @since:30/01/2023
 **/

 import java.util.ArrayList;
 import java.util.EmptyStackException;
 import java.util.NoSuchElementException;
 
 public class ArrayLists<E> implements IStack<E> {
 
     ArrayList<E> elementos = new ArrayList<E>();
  
     /** agrega un operando al stack
      * @param item
      */
     public void push(E item) { 
         elementos.add(item);
     }
 
     /** quita operandos del stack
      * @param (empty()
      * @return E
      * @throws EmptyStackExceptionif (empty())
      */
     public E pull() throws EmptyStackException { // 
         if (empty()) {
             throw new NoSuchElementException("No se puede realizar la acción -pop- en un stack vacío.");
 
         }
         return elementos.remove(elementos.size() - 1);
     }
 

     /** revisa si tiene elementos o no 
      * @return boolean
      */
     public boolean empty() { 
         return elementos.isEmpty();
 
     }
     
     /** regresa la cantidad de elementos
      * @return int
      */
     public int size() { 
        return elementos.size();

    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return null;
    }
 
 
 
 }