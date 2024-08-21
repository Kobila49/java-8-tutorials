package igor.kos.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {

    public static void main(String[] args) {
        String[] array = {"red", "green", "blue"};
        List<String> list = new ArrayList<>(Arrays.asList(array));

        list.sort(Comparator.naturalOrder());
    }
}
