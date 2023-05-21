import java.util.*;

public class day41 {
    static boolean match(String first, String second) {
        if (first.length() == 0 && second.length() == 0)
            return true;
        if (first.length() > 1 && first.charAt(0) == '*') {
            int i = 0;
            while (i + 1 < first.length() && first.charAt(i + 1) == '*')
                i++;
            first = first.substring(i);
        }
        if (first.length() > 1 && first.charAt(0) == '*' &&
                second.length() == 0)
            return false;
        if ((first.length() > 1 && first.charAt(0) == '?') ||
                (first.length() != 0 && second.length() != 0 &&
                        first.charAt(0) == second.charAt(0)))
            return match(first.substring(1),
                    second.substring(1));
        if (first.length() > 0 && first.charAt(0) == '*')
            return match(first.substring(1), second) ||
                    match(first, second.substring(1));
        return false;
    }

    static void test(String first, String second) {
        if (match(first, second))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter first String: ");
            String first = input.next();
            System.out.println("Enter second String: ");
            String second = input.next();
            test(first, second);
        }
    }
}