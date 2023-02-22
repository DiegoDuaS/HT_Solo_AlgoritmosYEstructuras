/**
 * @author: Diego Duarte
 * 
 * @since:20/02/2023
 **/
public class Factory {

    public static <E> IStack<E> createStack(Integer type, Integer type2) {
        switch(type) {
            case 1:
                return new ArrayLists<E>();
            case 2:
                return new DoubleLinked<E>();
            case 3:
                return createListaStack(type2);
            default:
                throw new IllegalArgumentException("No es válido");
        }
    }

        public static <E> IStack<E> createListaStack(Integer type) {
        switch(type) {
            case 1:
                return new Linked<E>();
            case 2:
                return new DoubleLinked<E>();
            default:
                throw new IllegalArgumentException("No es válido");
        }
    }



}

