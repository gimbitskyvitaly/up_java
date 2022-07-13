class StringLikeObject {

    public static int task1(String s) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static String task2(String s) {
        StringBuilder x = new StringBuilder(s);

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a') {
                x.insert(i + 1, 'b');
            }
        }

        return x.toString();
    }

    public static boolean task3(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static String task4() {
        String s = "информатика";
        StringBuilder e = new StringBuilder();

        e.append(s.charAt(7)).append(s.substring(3, 5)).append(s.charAt(7));

        return e.toString();
    }

    public static int task5(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }

    public static String task6(String s) {
        StringBuilder x = new StringBuilder(s);

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != ' ') {
                x.insert(i + 1, x.charAt(i));
                i++;
            }
        }

        return x.toString();
    }

    public static String task7(String s) {
        StringBuilder e = new StringBuilder();

        boolean l = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < e.length(); j++) {
                if (s.charAt(i) == e.charAt(j)) {
                    l = true;
                }
            }
            if (!l && s.charAt(i) != ' ') {
                e.append(s.charAt(i));
            }
            l = false;
        }

        return e.toString();
    }

    public static String task8(String s) {

        String[] a = s.split(" ");

        int max = 0;
        int ind = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > max) {
                max = a[i].length();
                ind = i;
            }
        }

        return a[ind];
    }

    public static int[] task9(String s) {

        int[] x = new int[2];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 64 && s.charAt(i) < 91) {
                x[0]++;
            }

            if (s.charAt(i) > 97 && s.charAt(i) < 122) {
                x[1]++;
            }
        }

        return x;
    }

    public static int task10(String s) {

        String[] a = s.split("[.?!]");

        return a.length;
    }

}
public class Main {
    public static void main(String args[]){
    }
}
