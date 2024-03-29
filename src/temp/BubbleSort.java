package temp;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        // на каждым шаге справа будет появляться отсортированный элемент
        for (int i = 0; i < arr.length - 1; i++) {
            // оптимизация алгоритма если элементы уже упорядочены
            boolean noSwaps = true;
            // перемещение самого большого элемента вправо
            for (int j = 0; j < arr.length - i - 1; j++) {
                //если два соседних элемента стоят в неправильом порядке - происходит их перестановка
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // меняем значение если была хотя бы 1 перестановка
                    noSwaps = false;
                }
            }
            // если не было перестановок - выходим из цикла
            if (noSwaps) {
                break;
            }
        }
        System.out.println("");
        for(int i: arr)
            System.out.print(i + " ");
    }
}
