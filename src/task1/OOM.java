package task1;

import java.util.LinkedList;
import java.util.List;

class OOM {
    static final List<Object[]> arrays = new LinkedList<>();

    public static void main(String[] a) {
        grabAllMemory();
    }

    public static void grabAllMemory() {
        for (int i=0; ;i++ ) {
            arrays.add(new Object[100000000]);
            System.out.println(i+ " what?");

        }
    }


}