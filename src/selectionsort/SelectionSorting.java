/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selectionsort;

/**
 *
 * @author nohin6777
 */
public class SelectionSorting {
    public static int[] sorting(int[] nums){
          int min;
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
        return nums;
    }
}
