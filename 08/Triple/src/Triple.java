public class Triple <T extends Comparable<T>> {
    private T first, second, third;
    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() { return first; }
    public T getSecond() { return second; }
    public T getThird() { return third; }

    @Override
    public String toString() {
        return "Triple: { " + first + ", " + second + ", " + third + " }";
    }

    public boolean equals(Triple<T> triple) {
        if (triple.getFirst().getClass() == this.getFirst().getClass() &&
                triple.getSecond().getClass() == this.getSecond().getClass() &&
                triple.getThird().getClass() == this.getThird().getClass() &&
                triple.getFirst() == this.getFirst() && triple.getSecond() == this.getSecond()
                && triple.getThird() == this.getThird()) {
            return true;
        } else return false;
    }

    public T min() throws InabilityCompleteOperationException {
        if (first.compareTo(second) < 0 && first.compareTo(third) < 0) {
            return first;
        } else if (second.compareTo(first) < 0 && second.compareTo(third) < 0) {
            return second;
        } else if (third.compareTo(first) < 0 && third.compareTo(second) < 0) {
            return third;
        } else throw new InabilityCompleteOperationException("Impossible to find min value");

    }
    public T max() throws InabilityCompleteOperationException {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
            return first;
        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            return second;
        } else if (third.compareTo(first) > 0 && third.compareTo(second) > 0) {
            return third;
        } else throw new InabilityCompleteOperationException("Impossible to find max value");
    }
    public T mean() throws InabilityCompleteOperationException{
        if (first.compareTo(second) == 0 || second.compareTo(third) == 0 || first.compareTo(third) == 0)
            throw new InabilityCompleteOperationException("Impossible to find mean value");
        if (first.compareTo(second) > 0) {
            if (first.compareTo(third) < 0) return first;
            else return (second.compareTo(third) > 0 ? second : third);
        } else {
            if (second.compareTo(third) < 0) return second;
            else return first.compareTo(third) > 0 ? first : third;
        }
    }


}
class InabilityCompleteOperationException extends Exception {
    public InabilityCompleteOperationException(String error) {
        super(error);
    }
}

