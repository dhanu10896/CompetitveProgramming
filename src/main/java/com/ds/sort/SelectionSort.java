package com.ds.sort;

import static com.ds.sort.SortUtil.exch;
import static com.ds.sort.SortUtil.less;

public class SelectionSort {
        public static void sort(int[] a) {
            int n = a.length;
            for (int i = 0; i < n; i++) {
                int min = i;
                for (int j = i+1; j < n; j++) {
                    if (less(a[j], a[min])) min = j;
                }
                exch(a, i, min);
            }
        }
    }