package com.akukhtin;

public class QSDemo {
    public static void main(String[] args) {
        char [] array = {'c','b','v','h','j','k','r','a','o','m'};
        int i;
        System.out.print("Original Array: ");
        for ( i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();

        QuickSort.qsort(array);

        System.out.print("Quick Sort: ");
        for ( i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
