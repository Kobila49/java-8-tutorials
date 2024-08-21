package igor.kos.primitives_and_wrappers;

import java.util.ArrayList;
import java.util.List;

public class Wrappers {


    public static void main(String[] args) {
        Integer a = new Integer(5);
        Integer b = 5;

        System.out.println("Min value of integer is: " + a.MIN_VALUE);
        System.out.println("Max value of integer is: " + b.MAX_VALUE);

        int a1 = 10;
        int b1 = 10;

        System.out.println("Are a1 and b1 equal? " + (a1 == b1));
        System.out.println("Are a and b equal? " + (a == b));

        System.out.println("Is the value of a equal to the value of b? " + (a.intValue() == b.intValue()));
        System.out.println("Is a and b equal using equals method? " + a.equals(b));
        System.out.println("Is a and b equal at class level? " + a.compareTo(b));

        Float f = b.floatValue();
        double ff = a.doubleValue();

        List<Integer> myList = new ArrayList<>();
        for(int i = 0; i < 52; i ++) {
            myList.add(i);
        }

        Boolean isSomething = null;

        if (isSomething == null) {
            System.out.println("isSomething is null");
        }
    }
}
