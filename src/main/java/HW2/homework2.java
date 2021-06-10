package HW2;

public class homework2 {
    public static void main(String[] args) {
        System.out.println(doOne(12, 7));
        doTwo(-7);
        doTree(7);
        doFour(" 7 ", 6);
        doFive(1);


    }

    static boolean doOne(int a, int b) {
        System.out.println("\nРешение задания 1.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //
    static void doTwo(int a) {
        System.out.println("\nРешение задания 2.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    //
    static boolean doTree(int a) {
        System.out.println("\nРешение задания 3.");
        if (a < 0) return true;
        else return false;
    }

    //
    static void doFour(String str, int n) {
        System.out.println("\nРешение задания 4.");
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    //
    static void doFive(int year) {
        System.out.println("\nРешение задания 5.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}
