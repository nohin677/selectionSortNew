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
        int min;
        
        for(int o = 0; o < nums.length; o++){
            System.out.print("What is a number?: ");
            nums[o] = input.nextInt();
        }
        
        
        for(int i = 0; i < nums.length; i++){
            min = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            
            if(min != i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        
    }
}
    

