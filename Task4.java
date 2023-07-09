//4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Scanner;
public class Task4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


       System.out.print("Введите уровнение без пробелов, 8 символов: ");
       String data = input.nextLine();

       if (data.length() == 8) {
        
       }else {
            System.out.print("Введенное значение не соответвует требованям!");
       }

    }
}