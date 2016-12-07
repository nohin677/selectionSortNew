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
        
        int c;
        
        //sets a scanner to take the user's input
        Scanner input = new Scanner(System.in);
        
        //prompts the user for a number of numbers
        System.out.print("How many numbers?: ");
        int n = input.nextInt();
        String answer;
        int[] nums = new int[n];
        
        //prompts the user for either random or normal number selection
        System.out.print("Random or normal?: ");
        answer = input.next();
        
        //if the user wants random, this code runs
        if (answer.equalsIgnoreCase("R")) {
            
            //generates the amount random numbers that the user wanted between 1 and 10
            for (int k = 0; k < n; k++) {
                int rand = (int) (Math.random() * (10 - 1) + 1);
                nums[k] = rand;
            }
            
            //outputs the array and the elapsed time
            outputting(nums);
            
        //if the user want normal number selection, this code runs
        } else if (answer.equalsIgnoreCase("n")) {
            
            //prompts the user for a number as many times as the user wants
            for (int o = 0; o < nums.length; o++) {
                System.out.print("What is a number?: ");
                nums[o] = input.nextInt();
            }
            //outputs the array and the elapsed time
            outputting(nums);
        }
        

    }
    
    /**
     * prints the array and the elapsed time
     * pre: none
     * post: the array and elapsed time are printed
     * @param nums 
     */
    public static void outputting(int[] nums) {
        System.out.println(Arrays.toString(SelectionSorting.sorting(nums)));
        System.out.println(SelectionSorting.Duration());
        System.out.println(SelectionSorting.comparisons() + " comparisons");
    }
}
