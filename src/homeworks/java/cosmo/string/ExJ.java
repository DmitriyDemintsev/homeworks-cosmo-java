package homeworks.java.cosmo.string;

/**
 * Дан массив со строками: {“Дом”, “Стена”, “Машина”, “Телефон”, “Кот”, “Микроволновка”, “Деньги”, “Яхта”}.
 * Необходимо найти в данном массиве самую длинную строку и вывести ее на экран.
 * {...} > Микроволновка
 * <p>
 * Подсказка: используйте метод .length() класса String
 */
public class ExJ {
    public static void main(String[] args) {
        String[] input = {"Дом", "Стена", "Машина", "Телефон", "Кот", "Микроволновка", "Деньги", "Яхта" };
        String max = "";
        for (String in : input) {
            if (in.length() > max.length()) {
                max = in;
            }
        }
        //тоже верно
//        String max = input[0];
//        for (int i = 1; i < input.length; i++) {
//            if (input[i].length() > max.length()) {
//                max = input[i];
//            }
//        }
        System.out.println(max);
    }
}