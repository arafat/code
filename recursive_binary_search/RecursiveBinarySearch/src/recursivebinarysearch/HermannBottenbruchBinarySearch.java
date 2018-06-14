package recursivebinarysearch;

import java.util.Scanner;
import java.io.IOException;


/**
 *
 * @author arafat
 */
public class HermannBottenbruchBinarySearch {
    
    /**
     * Binary search implementation, static method to perform binary search
     * on given space for a given key.
     * This implementation is proposed by Hermann Bottenbruch in 1962
     * https://en.wikipedia.org/wiki/Binary_search_algorithm
     * It takes one less comparison per iteration but one more iteration on
     * average.
     * @param space Array of elements comprise search space.
     * @param key element to look for in seach space.
     * @return boolean, true if key exists in space else false.
     */
    private static boolean BinarySearch(int[] space, int key) {
        int low = 0;
        int hi = space.length-1;
        int mid;
        while (hi > low) {
            System.out.println(low);
            System.out.println(hi);
            // We have to calculate ceiling value here.
            mid = (int) Math.ceil((hi+low)/2.0);
            if (key < space[mid]) {
                hi = mid-1;
            } else {
                low = mid;
            }
        }
        return space[low] == key;
    }
    
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
        System.out.print(size);
        int[] space = new int[size];
        for (int i=0; i<size; i++) {
            System.out.print(
                "Please enter a positive integer to build search space:");
            input = scn.nextInt();
            space[i] = input;
        }
        System.out.print("Please enter the number to search for:");
        int key = scn.nextInt();
        System.out.println(BinarySearch(space, key));
    }
    
}
