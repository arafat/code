package recursivebinarysearch;

import java.util.Scanner;
import java.io.IOException;



/**
 *
 * @author arafat
 */
public class RecursiveBinarySearch {
    
    /**
     * 
     */

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int input;
        int size;
        System.out.print("Please enter search space size:");
        size = scn.nextInt();
        //size = dis.readInt();
        System.out.print(size);
        int[] space = new int[size];
        for (int i=0; i<size; i++) {
            System.out.print(
                "Please enter a positive integer to build search space:");
            input = scn.nextInt();
            space[i] = input;
        }
    }
    
}
