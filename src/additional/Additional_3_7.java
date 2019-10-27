package additional;

/*
Проверка гипотезы Сиракуз:
Возьмем любое натуральное число.
Если оно четное - разделим его пополам, если нечетное - умножим на 3, прибавим 1 и разделим пополам.
Повторим эти действия с вновь полученным числом.
Гипотеза гласит, что независимо от выбора первого числа рано или поздно мы получим 1
 */

public class Additional_3_7 {
    public static void main(String[] args) {
        long x = (int) (Math.random() * (999_999_999 + 1));

        while (x != 1) {
            if (x % 2 == 0)
                x /= 2;
            else
                x = (x * 3 + 1) / 2;
            System.out.println(" " + x);
        }
    }
}