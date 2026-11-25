import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (!Character.isDigit(ch)) {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
