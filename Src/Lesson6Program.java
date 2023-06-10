import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Lesson6Program {
    public static void main(String[] args) {
        //int[][][] array = new int[10][10][10];
        //int[][] array = new int[][]{{1,2,3}, {123,123,123,432}, {2,3,4}};
        int[][] array = new int[3][3];
        int lengthArray = array.length;
        for (int i = 0; i < lengthArray; i++) {
            System.out.println(array[i].length);
        }
        System.out.println(lengthArray);
//        array[0] = new int[10];
//        array[1] = new int[1];
//        array[2] = new int[2];
//        array[3] = new int[3];
//        array[4] = new int[4];
//        array[5] = new int[5];
//        array[6] = new int[5];
//        array[7] = new int[7];
//        array[8] = new int[8];
//        array[9] = new int[9];
        //double[] array = new double[10];
        //boolean[] array = new boolean[10];
        //char[] array = new char[10];
        Random random = new Random();
        int num = random.nextInt(100_000) + 11;
        //int num = 112324;
        int temp = num;
        int sum = 0;

        //0, 1, 1,2,3,5,8,13,21,34,55,89
        int a = 0;
        int b = 1;
        for (int i = 0; i < 10; i++) {
            int sumAB = a + b;
            a = b;
            b = sumAB;
            System.out.print(sumAB + "\t");
        }
        //            int tmp = array[j - 1];
//                    array[j - 1] = array[j];
//                    array[j] = tmp;
//
//        int firstNum = temp % 10;
//        temp /= 10;
//        int secondNum = temp % 10;
//        temp /= 10;
//        int thirdNum = temp % 10;
//        temp /= 10;
//        int forthNum = temp % 10;
//        System.out.println(firstNum);
//        System.out.println(secondNum);
//        System.out.println(thirdNum);
//        System.out.println(forthNum);
//
//        sum = firstNum + secondNum + thirdNum + forthNum;
//        System.out.println(sum);

        for (int i = 0; i < 4; i++) {
            sum += temp % 10;
            temp = temp / 10;
        }

        System.out.println("Сума чисел числа = " + num + " = " + sum);
        //Integer[] array = new Integer[10];
        //Double[] array = new Double[10];
        //Boolean[] array = new Boolean[10];
        //Character[] array = new Character[10];

        //System.out.println(Arrays.deepToString(array));
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = random.nextInt(100);
//            }
//        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
//        }

//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        //System.out.println(array[array.length-1]);

        //alhorytm reverse
//        for (int i = 0; i < array.length /2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }

        //int[] arr = new int[]{9, 5, 2, 8, 7, 1};

        // bubble sort
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = array.length - 1; j > i; j--) {
//                if (array[j - 1] > array[j]) { // change on <
//                    int tmp = array[j - 1];
//                    array[j - 1] = array[j];
//                    array[j] = tmp;
//                }
//            }
//        }
        //reverse buble sort long way
//        for (int i = array.length - 1; i >=0 ; i--) {
//            for (int j = 0; i > j; j++) {
//                if (array[j + 1] > array[j]) {
//                    int tmp = array[j + 1];
//                    array[j + 1] = array[j];
//                    array[j] = tmp;
//                }
//            }
//        }
        //Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < 10; i++) {
//            System.out.print(array[i] + "\t");
//        }
//        for (int i = array.length - 1; i >= 0 ; i--) {
//            System.out.print(array[i] + "\t");
//        }
    }
}
