import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        System.out.println("введите длинну массива");
        int n = ok.nextInt();
        System.out.println("заполните массив");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = ok.nextInt();
        }
        System.out.println("ваш массив: " + Arrays.toString(num));
        System.out.println(findMajorityElement(num));
    }

    public static int findMajorityElement(int[] num) {
        int green = 0;
        int count = 0;

        // Найти возможного кандидата на мажоритарный элемент
        for (int i = 0; i < num.length; i++) {
            if (count == 0) {
                green = num[i];//присвоение текущего элемента
            }
           if (num[i]==green){
               count++;
           }
           else{
               count--;
           }
        }

        // Проверить, является ли кандидат мажоритарным элементом
        count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == green) {
                count++;
            }
        }
        if (count>num.length/2){
            return green;
        }
        else{
            return 0;
        }
    }
}