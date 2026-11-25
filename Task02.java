import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        text = text.toLowerCase();

        int count = 0;
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    count++;
                }
            }
        }

        System.out.println("Consonants = " + count);
    }
}
