import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] words = text.trim().split(" +");

        System.out.println("Words = " + words.length);
    }
}
