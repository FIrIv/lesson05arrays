package test.skypro;
import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray (int min, int max, int length) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max-min) + min;
        }
        return arr;
    }

    public static int[][] generateRandomArray (int min, int max, int length1, int length2) {
        java.util.Random random = new java.util.Random();
        int[][] arr = new int[length1][length2];
        for (int i = 0; i < arr.length; i++)
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = random.nextInt(max-min) + min;
        }
        return arr;
    }

    public static void myPrintArray (int[][] myMatrix) {
        for (int[] row : myMatrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // задание 1
        int i = 0;
        int[] myArrayInt = new int [3];
        for (i=0; i<myArrayInt.length; i++) {
            myArrayInt[i]=i+1;
        }
        float[] myArrayFloat = {1.57f,7.654f,9.986f};
        boolean[] myArrayBoolean = new boolean[] {true, false};

        // задание 2
        for (i=0; i<myArrayInt.length-1; i++) {
            System.out.print(myArrayInt[i] + ", ");
        }
        System.out.println(myArrayInt[i]);

        for (i=0; i<myArrayFloat.length; i++) {
            System.out.print(myArrayFloat[i]);
            if (i<myArrayFloat.length-1) System.out.print(", ");
        }
        System.out.println();

        for (i=0; i<myArrayBoolean.length; i++) {
            if (i<myArrayBoolean.length-1) System.out.print(myArrayBoolean[i] + ", ");
            else System.out.println(myArrayBoolean[i]);
        }

        // задание 3
        for (i=myArrayInt.length-1; i>0; i--) {
            System.out.print(myArrayInt[i] + ", ");
        }
        System.out.println(myArrayInt[i]);

        for (i=myArrayFloat.length-1; i>=0; i--) {
            System.out.print(myArrayFloat[i]);
            if (i>0) System.out.print(", ");
        }
        System.out.println();

        for (i=myArrayBoolean.length-1; i>=0; i--) {
            if (i>0) System.out.print(myArrayBoolean[i] + ", ");
            else System.out.println(myArrayBoolean[i]);
        }

        // задание 4
        for (i=0; i<myArrayInt.length; i++) {
            if (myArrayInt[i] % 2 !=0) myArrayInt[i] +=1;
            if (i<myArrayFloat.length-1) System.out.print(myArrayInt[i] + ", ");
            else System.out.println(myArrayInt[i]);
        }

        // массивы, часть 2
        int[] arr = generateRandomArray(100_000, 200_000, 30);
        int day = 0;

        // задание 1
        int spendingPerMonth = 0;
        for (day=0; day<arr.length; day++) {
            spendingPerMonth += arr[day];
        }
        System.out.println("Траты итого за месяц: " + spendingPerMonth + " руб.");

        // задание 2
        int minSpendingPerMonth = arr[0];
        int maxSpendingPerMonth = arr[0];
        for (day=1; day<arr.length; day++) {
           if (minSpendingPerMonth>arr[day]) minSpendingPerMonth=arr[day];
           if (maxSpendingPerMonth<arr[day]) maxSpendingPerMonth=arr[day];
        }
        System.out.println("Минимальные дневные траты за день: " + minSpendingPerMonth + " руб.");
        System.out.println("Максимальные дневные траты за день: " + maxSpendingPerMonth + " руб.");

        // задание 3
        float averageSpendingPerMonth = 0f;
        averageSpendingPerMonth = (float) spendingPerMonth / arr.length;
        System.out.println("Средние дневные траты за день: " + averageSpendingPerMonth + " руб.");

        // задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int symb=reverseFullName.length - 1; symb>=0; symb--) {
            System.out.print(reverseFullName[symb]);
        }
        System.out.println();

        // задачи повышенной сложности
        System.out.println();
        // задание 5
        int[][] diaMatrix = generateRandomArray(0, 10, 3, 3);
        System.out.println("Сгенерирована матрица: ");
        myPrintArray(diaMatrix);
        int diaElem = 1;
        for (int i5 = 0; i5 < diaMatrix.length; i5++)
            for (int j5 = 0; j5 <diaMatrix[i5].length; j5++) {
                if (i5==j5 || i5==diaMatrix.length-j5-1) diaMatrix[i5][j5] = diaElem;
            }
        System.out.println("<" + diaElem + "> по диагонали: ");
        myPrintArray(diaMatrix);

        // задание 6
        int[] arrayMain = {8,6,3,7,9};
        int[] arrayTemp = new int[5];
        System.out.println(" Начальный массив: " + Arrays.toString(arrayMain));
        int i6=0;
        for (i6 = 0; i6 < arrayMain.length; i6++) {
            arrayTemp[i6] = arrayMain[arrayMain.length-i6-1];
        }
        for (i6 = 0; i6 < arrayMain.length; i6++) {
            arrayMain[i6] = arrayTemp[i6];
        }
        System.out.println(" Обратно: " + Arrays.toString(arrayMain));

        // задание 7
        int[] arrayMain7 = arrayMain;
        int temp = 0;
        System.out.println(" Начальный массив: " + Arrays.toString(arrayMain7));
        for (int i7 = 0; i7 < arrayMain7.length/2; i7++) {
            temp = arrayMain7[arrayMain7.length-i7-1];
            arrayMain7[arrayMain7.length-i7-1] = arrayMain7[i7];
            arrayMain7[i7] = temp;
        }
        System.out.println(" Обратно: " + Arrays.toString(arrayMain7));

        // задание 8
        int[] arrayToFindOne = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1, -1};
        int sumToFindOne = -2;
        Arrays.sort(arrayToFindOne);
        System.out.println("Единственная пара: ");
        boolean isFind = false;
        for (int i8 = 0; i8 < arrayToFindOne.length && !isFind; i8++)
            for (int j8 = i8+1 ; j8 <arrayToFindOne.length && !isFind; j8++){
                if (arrayToFindOne[i8]+arrayToFindOne[j8] == -2) {
                    System.out.println(arrayToFindOne[i8] + " + " + arrayToFindOne[j8] + " = " + sumToFindOne);
                    isFind = true;
                }
            }

        // задание 9
        int[] arrayToFind = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1, -1};
        int sumToFind = -2;
        System.out.println("Все пары: ");
        for (int i9 = 0; i9 < arrayToFind.length; i9++)
            for (int j9 = i9+1 ; j9 <arrayToFind.length; j9++){
                if (arrayToFind[i9]+arrayToFind[j9] == -2) {
                    System.out.println(arrayToFind[i9] + " + " + arrayToFind[j9] + " = " + sumToFind);
                }
            }
    }
}
