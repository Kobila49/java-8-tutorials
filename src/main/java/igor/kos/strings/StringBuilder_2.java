package igor.kos.strings;

import static java.lang.System.out;

public class StringBuilder_2 {

    public static void main(String[] args) {
        out.println("\n*** Using StringBuilder, Part 2 ***\n");

        StringBuilder strBldr1 = new StringBuilder("Hello");

        strBldr1.append(" ").append("there");
        out.println(strBldr1);

        StringBuilder strBldr2 = new StringBuilder(" World");
        strBldr1.append(strBldr2);
        out.println(strBldr1);

        StringBuilder strBldr3 = new StringBuilder();
        strBldr3.append(3.1)
                .append(4)
                .append(" is PI = ")
                .append(true);

        out.println(strBldr3);

        int idx = strBldr3.indexOf(".");
        out.println(idx);

        Character chr = strBldr3.charAt(idx);
        out.println(chr);

        strBldr1 = new StringBuilder("Hi There!");
        strBldr1.replace(2, 3, "-*-");
        out.println(strBldr1);

        strBldr1.deleteCharAt(3);
        out.println(strBldr1);

        strBldr1.delete(2, 4);
        out.println(strBldr1);

        strBldr1.insert(2, " ");
        out.println(strBldr1);

        String str1 = strBldr1.substring(0,2);
        out.println(str1);

    }
}
