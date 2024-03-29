package assessment.assessment7;

/*
Реализовать класс Pair, который будет создержать 2 значения любого типа.
Класс умеет выводить:

first() - возвращает 1ый элемент
last() - возвращает 2ой элемент
swap() - меняет элементы местами
replaceFirst() - заменяет 1ый элемент на новый
replaceLast() - заменяет 2ой элемент на новый
 */

public class Pair<T, K> {
    private T value1;
    private K value2;

    public Pair(T value1, K value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T first () {
        return value1;
    }

    public K last () {
        return value2;
    }

    public Pair<K, T> swap() {

        return new Pair<>(value2, value1);
    }

    public void replaceFirst(T newValue) {
        this.value1 = newValue;
    }

    public void replaceLast(K newValue) {
        this.value2 = newValue;
    }
}
