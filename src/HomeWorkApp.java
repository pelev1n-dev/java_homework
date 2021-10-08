import sun.security.mscapi.CPublicKey;
import java.util.Arrays;

public class HomeWorkApp
{
    public static void main(String[] args)
    {

        // "Задание 1."
        System.out.println("Задание 1.");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
        changeArray(array);
        System.out.println(Arrays.toString(array));

        // "Задание 2."
        System.out.println("Задание 2.");
        int[] array2 = new int[100];
        System.out.println(Arrays.toString(array2));
        createArray2(array2);
        System.out.println(Arrays.toString(array2));

        //"Задание 3."
        System.out.println("Задание 3.");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array3));
        findBigNumber(array3);
        System.out.println(Arrays.toString(array3));

        //"Задание 4."
        System.out.println("Задание 4.");
        int[][] array4 = new int[5][5];
        System.out.println("First");
        square(array4);
        squareDiagonal(array4);
        System.out.println("Second");
        square(array4);

        //"Задание 5."
        System.out.println("Задание 5.");
        int initialValue = 6;
        int len = 4;
        int[] array5 = getArray(initialValue, len);
        System.out.println(Arrays.toString(array5));


    }

    //1
    public static void changeArray(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++)
        {
            inputArray[i] = 1 - inputArray[i];
        }
    }

    //2
    public static void createArray2(int[] inputArray)
    {
        for (int j = 0; j < inputArray.length; j++)
        {
            inputArray[j] = j + 1;
        }
    }

    //3
    public static void findBigNumber(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++)
        {
            if (inputArray[i] > 6)
            {
                inputArray[i] = inputArray[i] * 2;
            }
        }
    }

    //4
    public static void square(int[][] inputSquare)
    {
        for (int i = 0; i < inputSquare.length; i++)
        {
            System.out.println(Arrays.toString(inputSquare[i]));
        }
    }

    public static void squareDiagonal(int[][] array4)
    {
        for (int i = 0; i < array4.length; i++)
        {
            array4[i][i] = 1;
            array4[i][array4[i].length - 1 - i] = 1;
        }
    }

    //5
    public static int[] getArray(int initialValue, int len)
    {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

}
