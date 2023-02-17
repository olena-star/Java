import java.util.Scanner;

public class JavaBasic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countSecInOneMinute = 60;
        int countMinInOneHour = 60;
        int countHours = n / (countSecInOneMinute * countMinInOneHour);

        System.out.println("Работать осталось " + n + " секунд");

        for (int i = 0; i < 9; i++) {
            if (countHours >= i && countHours < i + 1) {
                System.out.println("Работать осталось " + i + " часов");
            }//1234
        }
    }
}
