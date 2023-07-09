// Реализовать простой калькулятор
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение первого элемента: ");
        int a = input.nextInt();

        System.out.print("Введите значение второго элемента: ");
        int b = input.nextInt();

        System.out.printf("Укажите требуемую операцию: %nСложение  - 1 %nВычетание - 2 %nУмножение - 3 %nДеление   - 4");
        System.out.println("");
        int n = input.nextInt();

        switch (n) {
            case 1:
                System.out.print(a + b);
                break;
            case 2:
                System.out.print(a - b);
                break;
            case 3:
                System.out.print(a * b);
                break;
            case 4:
                System.out.print(a / b);
                break;
            default:
                System.out.println("Операция не выполнима!");
                break;
        }
    }
}
