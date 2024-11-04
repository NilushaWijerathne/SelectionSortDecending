/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraytest;

import java.util.Arrays;



/**
 *
 * @author Nilusha Udayangani
 */
public class SelectionSortDecending {
Integer[] a;
    
    public SelectionSortDecending(Integer[] a){
        this.a = a;
    }
    
    public void SelectionSort(Integer[] a){
        int n = a.length;
        for(int i = 0; i<n - 1; i++){
            int max_idx = i; // first one think he is tallest
            for(int j = i + 1; j < n; j++){
                if (a[j] > a[max_idx]){
                    max_idx = j;
                }
                 System.out.println(
                         "i = "
                         + (i)
                         + "; j = "
                         + (j)
                         + "; cur_max = "
                         + a[max_idx]
                         + "; "
                         + Arrays.deepToString(a)
                         );
            }
            swap (i,max_idx);
        }
    }
    public void swap(int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
      public static void main(String[] args){
          Integer[] a = {76,6,107,92,21,23,5,9,8,8143};
          SelectionSortDecending sorter = new SelectionSortDecending(a);
                System.out.println("Arrays before Sorting:" + Arrays.deepToString(a));
                
                sorter.SelectionSort(a);
                
                System.out.println("Arrays after Sorting:" + Arrays.deepToString(a));
                
            }

    
    
    }
   