import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        StringBuilder sb = new StringBuilder(text);
        sb.reverse();

        System.out.println(sb.toString());
    }
}
