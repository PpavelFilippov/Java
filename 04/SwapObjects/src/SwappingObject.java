public class SwappingObject <T> {
    private T objectData;

    public SwappingObject(T objectData) { this.objectData = objectData; }

    public T getObjectData() { return objectData; }

    public static void swapObjects(SwappingObject first, SwappingObject second) throws ClassCastException {
            if (first.getObjectData().getClass() == second.getObjectData().getClass()){
                Object tmpObject = second.objectData;
                second.objectData = first.objectData;
                first.objectData = tmpObject;
            } else throw new ClassCastException("Cannot swap objects with different types");
    }

}
