import java.util.Scanner;
// Дано целое число, не меньшее 2. Выведите его НАИБОЛЬШИЙ делитель (число, на которое введенное число делится без остатка),
// отличный от самого этого числа.

// Level2
//Вклад в банке составляет x рублей. Ежегодно он увеличивается на p процентов, после чего дробная часть копеек отбрасывается.
// Каждый год сумма вклада становится больше. Определите, сколько будет на счету через k лет.
// До начала программирования решите эту задачу на бумаге - возьмите p=10, k=2, x = 1000
//Обе задачи решаются через for
public class HausAufGabe {


    public static void main(String[] args){
        System.out.print("Vvod: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        if (n > 2) System.out.println(findDivisor(n));
    }

    public static int findDivisor (int n){
        for (int i = 2; i < Integer.MAX_VALUE; i++){
            if (n % i == 0) return i;
        }
        return 0;
    }
}