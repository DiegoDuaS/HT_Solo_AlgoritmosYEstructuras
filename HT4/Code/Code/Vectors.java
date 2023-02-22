import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Vector;
/**
 * @author: Diego Duarte
 * 
 * @since:19/02/2023
 **/
public class Vectors<E> implements IStack<E> {
    private Vector<E> stack;

    public Vectors() {
        stack = new Vector<E>();
    }

    public void push(E item) {
        stack.add(item);
    }

    public E pull() throws EmptyStackException {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }
}


