import java.util.*;
import java.util.Scanner;

public class distinctnumbers5 {
    public static void main(String[]args) {
        //*distinct numbers */

        try (/*
                 * Write a program that reads in ten numbers and displays
                 *the number of distinct numbers and the distinct numbers separated by exactly one
                *space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
                *Read a number and store it to an array if it is new. If the number is already in the
                *array, ignore it.) After the input, the array contains the distinct numbers. Here is
                *the sample run of the program:
                 */
        Scanner console = new Scanner(System.in)) {
            int[] distinct = new int[10];
            int count = 0;
            int dis =0;
            System.out.println("Enter 10 Numbers");
            while (count<10){
               distinct[count]=console.nextInt();
               count++;
            }
            Arrays.sort(distinct);
            for(int i=0; i<distinct.length-1;i++){
               if(distinct[i]!=distinct[i+1]){
                dis++;
                System.out.print(distinct[i]+" ");
               }
            }
            System.out.print(" "+distinct[distinct.length-1]);
            System.out.println();
            System.out.println("Total Unique Elements are: "+dis);
        }
    }
}
