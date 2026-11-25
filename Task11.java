import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] words = text.trim().split(" +");

        for (int i = 0; i < words.length; i++) {
            String first = words[i].substring(0, 1).toUpperCase();
            String rest = words[i].substring(1).toLowerCase();
            words[i] = first + rest;
        }

        System.out.println(String.join(" ", words));
    }
}
