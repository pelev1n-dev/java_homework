public class HomeWorkApp {
    public static void main(String[] args) {
        //1
        int a = 3;
        int b = 8;
        boolean isBetween = checkSum(a, b);
        System.out.println(isBetween);
        //2
        int number = -3;
        checkNumber(number);
        //3
        int c = 5;
        boolean isNegative = isNegative(c);
        System.out.println(isNegative);
        //4
        printString("test", 4);
        //5
        boolean leap = leapYear(2021);
        System.out.println(leap);
    }
    //1
    public static boolean checkSum (int a, int b ) {
        int sum = a + b;
        return 10 < sum && sum <= 20;
    }
    //2
    public static void checkNumber(int number)
    {
        if (number >= 0) {
            System.out.println("Число положительное!");
        }
        else {
            System.out.println("Число отрицательное!");
        }
    }
    //3
    public static boolean isNegative(int c) {
        return c < 0;
    }
    //4
    public static void printString(String text, int count)
    {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
    //5
    public static boolean leapYear(int year)
    {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        else if (year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
