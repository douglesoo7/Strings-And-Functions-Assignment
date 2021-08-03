import java.util.Scanner;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        First Method
        --------------

        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                continue;
            System.out.print(str.charAt(i));
        }
        */

        /*
        Second Method
        --------------

        String str = sc.next();
        String c = sc.next();
        System.out.println(str.replace(c,""));

        */
    }

}
