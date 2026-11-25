import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (text.indexOf(ch) == text.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }
        }
    }
}
