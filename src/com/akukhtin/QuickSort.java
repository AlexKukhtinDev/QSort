package com.akukhtin;

public class QuickSort {

  public static void qsort(char [] items){
      qs(items,0,items.length-1);
  }
    private static void qs(char[] items, int left, int right) {
      int aLeft;
      int aRight;
      char x;
      char y;

      aLeft = left;
      aRight = right;
      x = items[(left + right) / 2];
      do {
          while ((items[aLeft] < x)&&(aLeft < right))aLeft++;
          while ((x<items[aRight])&&(aRight > left))aRight--;
          if (aLeft <= aRight){
              y = items[aLeft];
              items[aLeft] = items[aRight];
              items[aRight] = y;
              aLeft++;aRight--;
          }
      }while (aLeft<= aRight);
      if (left < aRight)qs(items,left,aRight);
      if (aLeft < right)qs(items,aLeft,right);
    }
}
