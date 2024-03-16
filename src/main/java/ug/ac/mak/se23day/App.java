package ug.ac.mak.se23day;

/**
 * Hello world!
 */
public final class App {
    public static int evaluate(String expression) {
        int sum = 0;
        for (String summad : expression.split("\\+"))
            sum += Integer.valueOf(summad);
        return sum;
    }
}
