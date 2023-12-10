public class Main {
    public static void main(String[] args) {
        //Checking standard triple with different elements
        Triple<Integer> intNormalTriple = new Triple<>(47, 23, 53);
        System.out.println("Integer " + intNormalTriple);

        try {
            System.out.println("Min in integer normal triple: " + intNormalTriple.min());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Mean in integer normal triple: " + intNormalTriple.mean());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Max in integer normal triple: " + intNormalTriple.max());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

        //Checking triple in which every element is equal
        Triple<Integer> intAllEqualTriple = new Triple<>(1, 1, 1);

        try {
            System.out.println("Min in integer equivalent triple: " + intAllEqualTriple.min());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Mean in integer equivalent triple: " + intAllEqualTriple.mean());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Max in integer equivalent triple: " + intAllEqualTriple.max());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

        //Checking triple in which two of elements are equal
        Triple<Integer> intTwoEqualTriple = new Triple<>(1, 2, 1);

        try {
            System.out.println("Min in integer two equivalent triple: " + intTwoEqualTriple.min());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Mean in integer two equivalent triple: " + intTwoEqualTriple.mean());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Max in integer two equivalent triple: " + intTwoEqualTriple.max());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

        //Checking other triple methods
        Triple<String> stringTriple1 = new Triple<>("first", "second", "third");
        Triple<String> stringTriple2 = new Triple<>("first", "second", "third");
        Triple<String> stringTriple3 = new Triple<>("third", "first", "second");

        System.out.println("String triples: " + stringTriple1 + ", " + stringTriple2 + ", " + stringTriple3);

        System.out.println("Getter methods example: ");
        System.out.println("First elem of String Triple №1: " + stringTriple1.getFirst());
        System.out.println("First elem of String Triple №2: " + stringTriple1.getSecond());
        System.out.println("First elem of String Triple №3: " + stringTriple1.getThird());

        System.out.println("Check, if string triples are equal: ");
        System.out.println("Is String People №1 equal to String People №2: " + stringTriple1.equals(stringTriple2));
        System.out.println("Is String People №1 equal to String People №3: " + stringTriple1.equals(stringTriple3));

        try {
            System.out.println("Min in string triple: " + stringTriple3.min());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Mean in string triple: " + stringTriple3.mean());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Max in string triple: " + stringTriple3.max());
        } catch (InabilityCompleteOperationException e) {
            System.out.println(e.getMessage());
        }

    }
}
