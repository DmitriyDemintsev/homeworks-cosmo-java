package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";

        String[] arr = input.split(" ");

        StringBuilder str = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--){
            str.append(arr[i]).append(" ");
        }

        String strRes = str.toString()
                .trim()
                .replace("?", "")
                .toLowerCase()
                .replaceFirst("д", "Д")
                + "?";

        System.out.println(strRes);
    }
}