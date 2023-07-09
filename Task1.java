// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 
// (произведение чисел от 1 до n)

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Введите значение n: ");
        int data = input.nextInt();
       
        for (int i = 1; i <= data; i++) {
            int number = (i * (i + 1)) / 2;
            System.out.print(number + ", ");
        }    
    }
}