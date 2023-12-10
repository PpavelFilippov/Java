import java.util.Arrays;

public class StackArray<T> {
    private T[] stackArray;
    private int capacity = 0;

    public StackArray(int capacity) {
        this.stackArray = (T[]) new Object[capacity];
    }

    public boolean empty() {
        return capacity == 0;
    }

    public T peek() {
        return stackArray[capacity - 1];
    }

    public void push(T item) {
        if(capacity == stackArray.length)
            stackArray = Arrays.copyOf(stackArray, 2 * stackArray.length);
        stackArray[capacity] = item;
        capacity++;
    }

    public T pop() {
        if (capacity == 0)
            return null;
        capacity--;
        T poppedItem = stackArray[capacity];
        stackArray[capacity] = null;
        return poppedItem;
    }

}
