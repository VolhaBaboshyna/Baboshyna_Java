package by.homework.lessons.Task6;

public class Task6 {
    public static void main(String[] args) {
        /*
        System.out.println("Task 1");
        int array []={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if ((i%2)==0){
                System.out.print(array[i] + " ");
            } else {
                array[i]=0;
                System.out.print(array[i] + " ");
            }
        }
        */

//        System.out.println("Task 2");
//        int array[] = {1, 2, 3, 4, 5};
//        int[] array1 = new int[array.length + 1];
//        int i;
//        for (i = 0; i < array1.length; i++) {
//            if (i == array.length) {
//                array1[i] = 0;
//                System.out.print(array1[i] + " ");
//            } else {
//                array1[i] = array[i];
//                System.out.print(array1[i] + " ");
//            }
//        }

//        System.out.println("Task 3");
//        int array[] = new int[]{12, 65, 22, 500, 84, 11};
//        int i = 0, max=array[i], min=array[i], maxi = i, mini = i;
//        for (i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                maxi = i;
//                max=array[i];
//            }
//            if (array[i] < min) {
//                mini = i;
//                min=array[i];
//            }
//
//        }
//        array[maxi] = 1000;
//        array[mini] = -1000;
//        for (i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//    }

        System.out.println("Task 4");
        int[] array = new int[]{12, 650, 22, 500, 84, 11};
        int i, ii;
        for (i = 0; i < array.length; i++) {
            for (int j = array.length-1; j>i; j--) {
                if (array[j] < array[j - 1]) {
                    ii = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = ii;
                }
            }
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
