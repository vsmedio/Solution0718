import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран порядковый номер первого элемента,
нарушающего такую упорядоченность (нумерация начинается с 1).
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList <String> lst = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            lst.add(sc.nextLine());
        }

        for (int i=0; i<lst.size()-1; i++) {
            if (lst.get(i).length()>lst.get(i+1).length()) {
                System.out.println(i+1);
                break;
            }
        }


    }
}
