package igor.kos.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class AddingRemovingElements {

    public static void main(String[] args) {
        out.println("\n*** Adding and Removing Elements ***\n");

        String[] array_1 = {"red", "green", "blue"};
        ArrayList<String> aList_1 = new ArrayList<>(Arrays.asList(array_1));
        out.println("1. aList_1 = " + aList_1);

        aList_1.add("purple");
        out.println("2. aList_1 = " + aList_1);

        aList_1.add(0, "orange");
        out.println("3. aList_1 = " + aList_1);

        String[] array_2 = {"yellow", "pink", "blue"};
        List<String> list_1= new ArrayList<>(Arrays.asList(array_2));
        out.println("4. list_1 = " + list_1);

        aList_1.addAll(0, list_1);
        out.println("5. aList_1 = " + aList_1);

        String item = aList_1.get(1);
        out.println("6. item = " + item);
        out.println("7. aList_1 = " + aList_1);

        aList_1.set(1, "black");
        out.println("8. aList_1 = " + aList_1);

        aList_1.remove("blue");
        out.println("9. aList_1 = " + aList_1);

        aList_1.remove(2);
        out.println("10. aList_1 = " + aList_1);

        String[] array_3 = {"yellow", "red", "purple"};
        ArrayList<String> aList_2 = new ArrayList<>(Arrays.asList(array_3));
        out.println("11. aList_2 = " + aList_2);

        boolean flag = aList_1.removeAll(aList_2);
        out.println("12. aList1.removeAll() = " + flag);
        out.println("13. aList_1 = " + aList_1);

        int size = aList_1.size();
        out.println("14. aList1.size() = " + size);

        aList_1.clear();
        out.println("15. aList_1 = " + aList_1);

        boolean isEmpty = aList_1.isEmpty();
        out.println("16. aList_1.isEmpty() = " + isEmpty);

    }
}
