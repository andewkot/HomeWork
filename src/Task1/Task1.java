package Task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.lang.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел требуется вывести?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] originNumbers = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите ENTER: ");
        int min = originNumbers[0];
        for (int i = 0; i < size; i++) {
            if (min > originNumbers [i])
                min = originNumbers[i];
        }
        System.out.println("Минимальное число: " + min);

        }
    }

//Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль
//    public static void main(String[] args) {
//        int value = Scanner.nextInt();
//        int sum = 0;
//        int com = 1;
//        while (value != 0) {  //подсчитать сумму чисел
//            sum = sum + value % 10;
//            value = value / 10;
//        }
//        System.out.println("Cумма введённых чисел: " + sum);
       /* while (value != 0) {   //подсчитать произведения чисел
        com *= value % 10;
        value = value / 10;
    }
        System.out.println("Произведение введённых чисел: " + com);*/


//        int s=0, p=1;
//        for(int i=0; i<args.length; i++)
//        {
//            int atata=Integer.parseInt(args[i]);
//            s=s + atata;
//            p=p * atata;
//        }
//        System.out.println("Sum = " + s);
//        System.out.println("Product of numbers = "+ p);



/*
//Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Hello " + str.nextLine() + "!");
    }
//Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void main(String args[]){
        StringBuffer strb = new StringBuffer("1 2 3 4 5 6 7 8 9 10");
        System.out.println("String buffer  = " + strb);

        // Тут Реверсит
        strb.reverse();
        System.out.println("String buffer after reversing = " + strb);
    }
//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void main(String[] args) {
        System.out.println("Enter your password and press Enter.");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        scan.close();
        if (name.equals("12345")) {
            System.out.println("Correct password, " + name);
        } else {
            System.out.println("The password is not correct");
        }
    }
    // 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your password: ");
        String pass1 = scanner.next();
        String pass2 = "andrew";
        if (pass1.equals(pass2)) {
            System.out.println("Password is OK");
        } else {
            System.out.println("Password is Wrong");
        }
    }

//5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вывести целые числа");
        int value = scanner.nextInt();
        int sum = 0;
        int com = 1;
        while (value != 0) { //подсчитываем сумму чисел
            sum = sum + value % 10;
            value = value / 10;
        }
        System.out.println("Сумма введенных чисел: " + sum);
        while (value != 0) {
            com *= value % 10;
            value = value / 10;
        }
        System.out.println("Произведение введённых чисел: " + com);
    }

 */
/*
//6.Ввести с консоли n целых чисел. На консоль вывести:
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел требуется вывести?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] originNumbers = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите ENTER: ");
        for (int i = 0; i < size; i++) {
            originNumbers[i] = scanner.nextInt();
        }
        }

// 6.1. Четные и нечетные числа.
        for (int i = 0; i < size; i++) {
            if (originNumbers[i] % 2 != 0) {
                System.out.println("Нечетное число: " + originNumbers);
            } else if (originNumbers[i] % 2 == 0) {
                System.out.println("Четное число: " + originNumbers);
            }
        }
//6.2. Наименьшее число.

int min = originNumbers[0];
        for (int i = 0; i < size; i++) {
            if (min > originNumbers[i])
                min = originNumbers[i];
        }
        System.out.println("Минимльное число:" + min);
//6.2. Наибольшее число.
int max = originNumbers[0];
        for (int i = 0; i < size; i++) {
            if (max < originNumbers[i])
                max = originNumbers[i];
        }
        System.out.println("Максимальное число:" + max);
 // 6.3. Числа, которые делятся на 3 или на 9.
 for (int i = 0; i < size; i++)
            if ((originNumbers[i] % 3 == 0) || (originNumbers[i] % 9 == 0))
        System.out.println("Число, которое делится на 3 или 9: " + originNumbers[i]);

// 6.4. Числа, которые делятся на 5 и на 7.
for (int i = 0; i < size; i++)
            if ((originNumbers[i] % 5 == 0) && (originNumbers[i] % 7 == 0))
                System.out.println("Число, которое делится на 5 и 7: " + originNumbers[i]);
//6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
  int a = 0, b = 0, c = 0;
        for (int j = 0; j < size; j++)
            if ((originNumbers[j] > 99) && (originNumbers[j] < 1000)) {
                a = originNumbers[j] / 10 / 10;
                b = originNumbers[j] / 10 % 10;
                c = originNumbers[j] % 100 % 10;
                if (a != b && a != c && b != a && b != c && c != a && c != b)

                    System.out.println("3х-значное число в десятичной записи которых нет одинаковых цифр: " + originNumbers[j]);
            }
// 6.6. «Счастливые» числа.
int a1 = 0, b1 = 0;
        for (int j = 0; j < size; j++)
            if ((originNumbers[j] > 99999) && (originNumbers[j] < 1000000)) {

                a1 = originNumbers[j] / 1000; // выделение 1й 3ки чисел
                b1 = originNumbers[j] % 1000; // выделение 2й 3ки чисел

                int sum = 0;
                int sum1 = 0;
                while (a1 != 0) {  //подсчитать сумму 1й тройки чисел
                    sum = sum + a1 % 10;
                    a1 = a1 / 10;
                }

                while (b1 != 0) {  //подсчитать сумму 2й тройки чисел
                    sum1 = sum1 + b1 % 10;
                    b1 = b1 / 10;
                }

                if (sum == sum1) {
                    System.out.println("Счастливое число: " + originNumbers[j]);
                }
            }
 */