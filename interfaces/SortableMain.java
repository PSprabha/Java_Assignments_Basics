package interfaces;

import java.util.Scanner;


interface Sortable 
{
 void sort(int[] arr);
}


class BubbleSort implements Sortable 
{
 public void sort(int[] arr) 
 {
     int n = arr.length;
     
     for (int i = 0; i < n - 1; i++) 
     {
         for (int j = 0; j < n - i - 1; j++) 
         {
             if (arr[j] > arr[j + 1])
             {
                 // swap
                 int temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;
             }
         }
     }
 }
}



class QuickSort implements Sortable 
{
 public void sort(int[] arr)
 {
     quickSort(arr, 0, arr.length - 1);
 }

 private void quickSort(int[] arr, int low, int high)
 {
     if (low < high) 
     {
         int pivotIdx = partition(arr, low, high);
         quickSort(arr, low, pivotIdx - 1);
         quickSort(arr, pivotIdx + 1, high);
     }
 }

 private int partition(int[] arr, int low, int high) 
 {
     int pivot = arr[high];
     int i = low - 1;

     for (int j = low; j < high; j++) 
     {
         if (arr[j] < pivot) 
         {
             i++;
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }


     int temp = arr[i + 1];
     arr[i + 1] = arr[high];
     arr[high] = temp;

     return i + 1;
 }
}



class MergeSort implements Sortable 
{
 public void sort(int[] arr)
 {
     mergeSort(arr, 0, arr.length - 1);
 }

 private void mergeSort(int[] arr, int left, int right) 
 {
     if (left < right)
     {
         int mid = (left + right) / 2;

         mergeSort(arr, left, mid);
         mergeSort(arr, mid + 1, right);

         merge(arr, left, mid, right);
     }
 }

 private void merge(int[] arr, int left, int mid, int right)
 {
     int[] temp = new int[right - left + 1];

     int i = left;
     int j = mid + 1;
     int k = 0;

     while (i <= mid && j <= right) 
     {
         if (arr[i] <= arr[j]) 
         {
             temp[k++] = arr[i++];
         }
         else 
         {
             temp[k++] = arr[j++];
         }
     }

     while (i <= mid) 
     {
         temp[k++] = arr[i++];
     }

     while (j <= right) 
     {
         temp[k++] = arr[j++];
     }

     for (int x = 0; x < temp.length; x++) 
     {
         arr[left + x] = temp[x];
     }
 }
}



public class SortableMain
{
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);


     System.out.print("Enter number of elements: ");
     int n = sc.nextInt();

     int[] arr = new int[n];
     System.out.println("Enter elements:");
     for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
     }


     System.out.println("Choose sorting algorithm:");
     System.out.println("1. Bubble Sort");
     System.out.println("2. Quick Sort");
     System.out.println("3. Merge Sort");
     System.out.print("Your choice: ");
     int choice = sc.nextInt();

     Sortable sorter;

     switch (choice) {
         case 1:
             sorter = new BubbleSort();
             break;
         case 2:
             sorter = new QuickSort();
             break;
         case 3:
             sorter = new MergeSort();
             break;
         default:
             System.out.println("Invalid choice. Exiting...");
             return;
     }


     sorter.sort(arr);

     System.out.println("Sorted array:");
     for (int num : arr) {
         System.out.print(num + " ");
     }

     sc.close();
 }
}

