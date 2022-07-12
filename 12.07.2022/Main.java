import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringLikeArray{
    public static void task1(String[] array) {

        Pattern p = Pattern.compile("([A-Z])");

        for (int i = 0; i < array.length; i++) {
            Matcher m = p.matcher(array[i]);

            StringBuilder strb = new StringBuilder();

            while (m.find()) {
                m.appendReplacement(strb, "_$0");
            }

            m.appendTail(strb);
            array[i] = strb.toString().toLowerCase();

        }

    }
    public static String task2(String str) {

        Pattern pattern = Pattern.compile("word");
        Matcher m = pattern.matcher(str);
        StringBuilder strbuild = new StringBuilder();

        while (m.find()) {
            m.appendReplacement(strbuild, "letter");
        }

        m.appendTail(strbuild);

        return strbuild.toString();
    }
    public static int task3(String s) {

        char[] a = new char[s.length()];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = s.charAt(i);
            if (a[i] > 48 && a[i] < 57) {
                count++;
            }
        }

        return count;
    }
    public static int task4(String s) {

        char[] a = new char[s.length()];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = s.charAt(i);
            if (a[i] > 48 && a[i] < 57 && (i == a.length - 1 || a[i + 1] <= 48 || a[i + 1] >= 57)) {
                count++;
            }
        }

        return count;
    }
    public static String task5(String str) {

        str = str.trim();
        StringBuilder res = new StringBuilder();

        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ' || array[i - 1] != ' ') {
                res.append(array[i]);
            }
        }

        return res.toString();
    }
}
public class Main {
    public static void main(String args[]) {

    }
}