import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //exercise 1
       // boolean isWeekend = true;
        //boolean isRain = false;
       // boolean canWalk = false;

       // if (isWeekend && !isRain) {
        //    canWalk = true;
        //}
        //System.out.println(canWalk);
        boolean isWeekend = scanner.nextBoolean();
        boolean isRain = scanner.nextBoolean();
        boolean canWalk;
        if(isWeekend == true && isRain == false)
        { canWalk = true;
            System.out.println(canWalk);}
        else {canWalk = false;
            System.out.println(canWalk);}

        boolean isEdekaOpen = scanner.nextBoolean();
        boolean isReweOpen = scanner.nextBoolean();
        сanBuy(isEdekaOpen, isReweOpen);
    }

    public static boolean сanBuy(boolean edeka, boolean rewe) {
        if (edeka == true && rewe == true) {
            System.out.println("Я могу купить еду,это магазины Едека и Реве");
            return true;
        } else if (edeka == true && rewe == false) {
            System.out.println("Я могу купить еду,это магазин Едека ");
            return true;
        } else if (edeka == false && rewe == true) {
            System.out.println("Я могу купить еду,это магазин Реве");
            return true;
        } else return false;
    }
}