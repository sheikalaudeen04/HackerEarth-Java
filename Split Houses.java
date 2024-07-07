import java.util.Scanner;

public class VillageFences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        String village = scanner.nextLine();
        scanner.close();

        // Check if it's possible to place fences
        if (village.contains("HH")) {
            System.out.println("NO");
        } else {
            // Place fences
            String result = village.replace('.', 'B');
            System.out.println("YES");
            System.out.println(result);
        }
    }
}