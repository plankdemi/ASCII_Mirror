import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> list = convertToList(number);
        System.out.println(list);


        // Write your code here.
    }

    public static List<Integer> convertToList(int number) {

        List<Integer> list = new ArrayList<>();
        String str = String.valueOf(number);

        for (int i = 0; i < str.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }

        Collections.sort(list);

        // Write your code here.
        return list;
    }
}
