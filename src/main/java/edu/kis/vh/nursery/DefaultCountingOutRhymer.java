package edu.kis.vh.nursery;
//
public class DefaultCountingOutRhymer {

    public static final int INDICATOR = 11;
    public static final int STACK_MAX_SIZE = 12;
    public static final int EMPTY = -1;
    public static final int INDEX = -1;
    final private int[] NUMBERS = new int[STACK_MAX_SIZE];
//
    public int total = INDEX;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INDEX;
    }

    public boolean isFull() {
        return total == INDICATOR;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total--];
    }

}
