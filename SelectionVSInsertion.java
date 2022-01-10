package Offlines;

import java.util.Random;


    /*
     Time Complexity: O(n^2)
     Space: O(1)
     Best case : Already Sorted
     Worst Case : Reverse Order
     */
public class SelectionVSInsertion {

    void SelectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int i_min = i;
            for(int j = i+1;j<n;j++){
                if(arr[i_min]>arr[j]){
                    i_min = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[i_min];
            arr[i_min] = t;
        }
    }

    void InsertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int value = arr[i];
            int hole = i;

            while(hole>0 && arr[hole-1]>value){
                arr[hole] = arr[hole-1];
                hole = hole-1;
            }
            arr[hole] = value;
        }
    }
    /*
     Time Complexity: O(n^2)
     Space: O(1)
     Insertion sort takes maximum time to sort,
     if elements are sorted in reverse order.
     And it takes minimum time O(n) when elements are already sorted.
     */

    public static void main(String[]args){
        SelectionVSInsertion s = new SelectionVSInsertion();
        Random random = new Random();
        //int [] narr  ={10,100,200,500,1000,2000,5000,10000};
        int [] narr = {10,20,43,67,87};
        for (int n : narr) {
            int[] randomArray = new int[n];

            for (int j = 0; j < n; j++) {
                randomArray[j] = random.nextInt(10009);
            }
            //01740405985
            long start1 = System.nanoTime();
            s.SelectionSort(randomArray);
            long end1 = System.nanoTime();
            long timeElapsed1 = end1 - start1;

            //         Below part for Insertion Sort     //

            for (int j = 0; j < n; j++) {
                randomArray[j] = random.nextInt(10009);
            }

            long start2 = System.nanoTime();
            s.InsertionSort(randomArray);
            long end2 = System.nanoTime();
            long timeElapsed2 = end2 - start2;

            System.out.println("The time taken for " + n + " random numbers " + "in SELECTION Sort is : " + timeElapsed1 + " nanoseconds");
            System.out.println("The time taken for " + n + " random numbers " + "in INSERTION Sort is : " + timeElapsed2 + " nanoseconds");
        }
    }
}
