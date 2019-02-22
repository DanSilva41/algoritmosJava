import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {

    static List<String> columnNames(int n)
    {
        List<String> result = new ArrayList<String>();
        int i = 0;
        while(n > 0) {
            result.add(helper(i));
            i++;
            n--;
        }
        return result;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);

        int _columns = Integer.parseInt(in.nextLine().trim());

        List<String> result = columnNames(_columns);

        System.out.println(String.join(", ", result));
    }

    static String helper(int i) {

        return i < 0 ? "" : helper((i / 26) - 1) + (char)(65 + i % 26);
    }
}
