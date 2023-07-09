/**
 * Task2
 */
public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && i % j != j) {
                    count += 1;
                }
            }
            if (count <= 2) {
                System.out.print(i + " ");
            }
            count = 0;
        }
    }
}