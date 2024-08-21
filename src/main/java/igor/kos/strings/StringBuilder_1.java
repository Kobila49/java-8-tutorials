package igor.kos.strings;

import static java.lang.System.out;

public class StringBuilder_1 {

    public static void main(String[] args) {
        out.println("\n*** Using StringBuilder, Part 1 ***\n");

        String str1 = new String("Xello");
        out.println(str1);
        String str2 = str1.replace('X', 'H');
        out.println(str2);
        out.println(str1 == str2);

        StringBuilder strBldr1 = new StringBuilder("Xello");
        out.println(strBldr1);

        StringBuilder strBldr2 = strBldr1.replace(0, 1, "H");
        out.println(strBldr2);
        out.println(strBldr1);
        out.println(strBldr1 == strBldr2);

        strBldr1 = new StringBuilder();
        out.println(strBldr1.length());
        out.println(strBldr1.capacity());

        strBldr1 = new StringBuilder(100);
        out.println(strBldr1.length());
        out.println(strBldr1.capacity());

        strBldr1 = new StringBuilder("Hello");
        out.println(strBldr1.length());
        out.println(strBldr1.capacity());
    }
}
