/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.text.DecimalFormat;

/**
 *
 * @author nohin6777
 */
public class SelectionSorting {
    private static int c;
    public static double duration;
    /**
     * 
     * @param nums
     * @return 
     */
    public static int[] sorting(int[] nums) {
        
        long startTime = System.nanoTime();
        int min;
        for (int i = 0; i < nums.length; i++) {
            min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
                c = nums.length*(i+1);
            }

            if (min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        long endTime = System.nanoTime();
        duration = endTime - startTime;
        return nums;
    }

    public static String Duration() {
        DecimalFormat formatter = new DecimalFormat("##.##########" + " seconds");
        return formatter.format(duration / 1000000000);
        
    }
    
    public static int comparisons(){
        return c;
    }
}
