package homeworks.java.cosmo.string;

/**
 * Создайте программу,
 * которая на вход получает строку “Мама мыла Милу мылом!” и выводит её в обратном порядке.
 * Мама мыла Милу мылом! -> !молым улим алым амаМ
 * <p>
 * Подсказка: используйте метод .reverse() класса StringBuilder
 */
public class ExB {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";
        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse());
        //тоже рабочее
//        String str = sb.reverse().toString();
//        System.out.println(str);
    }
}