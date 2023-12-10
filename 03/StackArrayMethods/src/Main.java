public class Main {
    public static void main(String[] args) {
        StackArray<String> stringStack = new StackArray<>(32);

        stringStack.push("Alpha");

        System.out.println("Is stack empty: " + stringStack.empty());

        String poppedItem = stringStack.pop();

        System.out.println("Popped element: " + poppedItem);
        System.out.println("Is stack empty: " + stringStack.empty());

        for( int i = 0 ; i < 10; i++)
        {
            stringStack.push(i + " item");
        }

        System.out.println("Last item of stack is " + stringStack.peek());

        while (!stringStack.empty())
        {
            System.out.println("The " + stringStack.pop() + " was popped");
        }

        System.out.println("Is stack empty: " + stringStack.empty());

        stringStack.push("CheckPeek");
        System.out.println("Peeking top item: " + stringStack.peek());
        System.out.println("Is stack empty: " + stringStack.empty());
    }
}
