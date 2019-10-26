package offset;

/*
Имеется прямоугольное отверстие размера a на b.
Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r
Примеры работы программы:
6
8
5
Картонка с радиусом 5 закрывает полностью отверстие размера 6 * 8
3
4
2
Картонка с радиусом 2 не закрывает полностью отверстие размера 3 * 4
 */

public class Offset1 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10.0 + 1.0);
        int b = (int) (Math.random() * 10.0 + 1.0);
        int r = (int) (Math.random() * 10.0 + 1.0);

        System.out.println("Размеры прямоугольного отверстия: " + a + " * " + b);
        System.out.println("Радиус круглой картонки: " + r);

        double c = Math.pow(a, 2) + Math.pow(b, 2);
        c = Math.sqrt(c);

        if (c > r * 2) {
            System.out.println("\nКартонка с радиусом " + r + " не закрывает полностью отверстие размера " + a + " * " + b);
        } else {
            System.out.println("\nКартонка с радиусом " + r + " закрывает полностью отверстие размера " + a + " * " + b);
        }
        System.out.println("\nТ.к. диагональ отверстия равна: " + c);
    }
}