/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selectionsort;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author nohin6777
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many numbers?: ");
        int n = input.nextInt();
        int[] nums = new int[n];
       
        
        for(int o = 0; o < nums.length; o++){
            System.out.print("What is a number?: ");
            nums[o] = input.nextInt();
        }
       
        
      
        System.out.println(Arrays.toString(SelectionSorting.sorting(nums)));
        
    }
}
    

