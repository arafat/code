package recursivebinarysearch;

import java.util.Scanner;
import java.io.IOException;



/**
 *
 * @author arafat
 */
public class RecursiveBinarySearch {
    
    /**
     * Binary search implementation, static method to perform binary search
     * on given space for a given key.
     * @param space Array of elements comprise search space.
     * @param key element to look for in seach space.
     * @return boolean, true if key exists in space else false.
     */
    private static boolean BinarySearch(int[] space, int key) {
        int low = 0;
        int hi = space.length-1;
        int index = 0;
        boolean found = false;
        while (hi >= low) {
            System.out.println(low);
            System.out.println(hi);
            int mid = (hi+low)/2;
            if (key == space[mid]) {
                found = true;
                index = mid;
                break;
            } else if (key > space[mid]) {
                low = mid +1;
            } else {
                hi = mid - 1;
            }            
        }
        System.out.println(index);
        return found;
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
