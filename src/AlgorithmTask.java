
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AlgorithmTask {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }


        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String arr : array) {
            System.out.println(arr);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        for (String x : array) {
            if (isNumber(x)) {
                int n = Integer.parseInt(x);
                list.add(n);


            } else str.add(x);

        }

        for (int i = 1; i < str.size(); i++) {
            for (int j = 1; j < str.size() - i + 1; j++) {
                if (isGreaterThan(str.get(j - 1), str.get(j))) {
                    String tmp = str.get(j - 1);
                    str.set(j - 1, str.get(j));
                    str.set(j, tmp);
                }
            }
        }

        Collections.sort(list, Comparator.reverseOrder());
        int n = 0, j = 0;
        for (int i = 0; i < array.length; i++ ){
            if (isNumber(array[i])){
                array[i] = list.get(n).toString();
                n++;
            }
            else{ array[i] = str.get(j);
                j++;}
        }







    }



    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-')
                    || (!Character.isDigit(c) && c != '-')
                    || (i == 0 && c == '-' && chars.length == 1))
            {
                return false;
            }
        }
        return true;
    }
}
