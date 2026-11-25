import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String result = text.replace(' ', '_');

        System.out.println(result);
    }
}
