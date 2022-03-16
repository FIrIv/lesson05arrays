package test.skypro;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
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
        int[] arr = generateRandomArray();
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
    }
}
