
package src.test.java.hackerrank;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        long min = 1000000000;
        long max = 0;
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++)
        {
            
            sum = sum + arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        scan.close();
        
        System.out.println((sum - max) + " " + (sum - min));
    }

}
