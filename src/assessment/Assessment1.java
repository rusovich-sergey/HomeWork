package assessment;

/*
Напишите программу, которая будет переводить секунды в форматированный вид - часы минуты секунды
Примеры:
1249
20 минут 49 секунд

648958
180 часов 15 минут 58 секунд

Добавьте 3 строчку, которая будет выводить недели, сутки, часы минуты и секунды
Примеры:
648958
180 часов 15 минут 58 секунд
1 неделя 0 суток 12 часов 15 минут 58 секунд

2258521
627 часов 22 минуты 1 секунда
3 недели 5 суток 3 часа 22 минуты 1 секунда
 */

public class Assessment1 {
    public static void main(String[] args) {
        int week, day, hour1, hour2, minute, second;

        int random = (int) (Math.random() * (6_073_260 + 1));   //генерим кол-во секунд, макс - 10 недель
        System.out.println(random);                             //выводим полученное число

        second = random % 60;
        minute = random / 60 % 60;
        hour1 = random / 60 / 60;
        hour2 = random / 60 / 60 % 24;
        day = random / 60 / 60 / 24 % 7;
        week = random / 60 / 60 / 24 / 7;

        if ((hour1 % 100 / 10) == 1)            //определяем предпоследнюю цифру, если == 1, то окончание "часов"
            System.out.print(minute + " часов ");
        else                                     //иначе смотрим по последней цифре
            switch (hour1) {
                case 1:
                    System.out.print(hour1 + " час ");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print(hour1 + " часа ");
                    break;
                default:
                    System.out.print(hour1 + " часов ");
            }

        if ((minute % 100 / 10) == 1)            //определяем предпоследнюю цифру, если == 1, то окончание "минут"
            System.out.print(minute + " минут ");
        else                                     //иначе смотрим по последней цифре
            switch (minute % 10) {
                case 1:
                    System.out.print(minute + " минута ");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print(minute + " минуты ");
                    break;
                default:
                    System.out.print(minute + " минут ");
            }

        if ((second % 100 / 10) == 1)           //определяем предпоследнюю цифру, если == 1, то окончание "секунд"
            System.out.print(second + " секунд");
        else                                     //иначе смотрим по последней цифре
            switch (second % 10) {
                case 1:
                    System.out.print(second + " секунда");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print(second + " секунды");
                    break;
                default:
                    System.out.print(second + " секунд");
            }

        System.out.print("\n");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        switch (week) {
            case 1:
                System.out.print(week + " неделя ");
                break;
            case 2:
            case 3:
            case 4:
                System.out.print(week + " недели ");
                break;
            default:
                System.out.print(week + " недель ");
        }

        if (day == 1)
            System.out.print(day + " сутки ");
        else
            System.out.print(day + " суток ");

        switch (hour2) {
            case 1:
                System.out.print(hour2 + " час ");
                break;
            case 2:
            case 3:
            case 4:
                System.out.print(hour2 + " часа ");
                break;
            default:
                System.out.print(hour2 + " часов ");
        }

        if ((minute % 100 / 10) == 1)            //определяем предпоследнюю цифру, если == 1, то окончание "минут"
            System.out.print(minute + " минут ");
        else                                     //иначе смотрим по последней цифре
            switch (minute % 10) {
                case 1:
                    System.out.print(minute + " минута ");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print(minute + " минуты ");
                    break;
                default:
                    System.out.print(minute + " минут ");
            }

        if ((second % 100 / 10) == 1)           //определяем предпоследнюю цифру, если == 1, то окончание "секунд"
            System.out.print(second + " секунд");
        else                                     //иначе смотрим по последней цифре
            switch (second % 10) {
                case 1:
                    System.out.print(second + " секунда");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print(second + " секунды");
                    break;
                default:
                    System.out.print(second + " секунд");
            }
    }
}