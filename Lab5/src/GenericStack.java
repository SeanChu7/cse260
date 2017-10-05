import java.util.ArrayList;
public class GenericStack<E> extends ArrayList<E>{
	public int getSize() {
		return size();
	}
	
	public E peek() {
		return get(getSize() - 1);
	}
	public void push(E o) {
		add(o);
	}
	
	public E pop() {
		E o = remove(getSize() - 1);
		return o;
	}
	
	public boolean isEmpty() {
		return isEmpty();
	}
	
	public String toString() {
		return "stack: " + toString();
	}
}
