package test.skypro;

public class Main {

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
    }
}
