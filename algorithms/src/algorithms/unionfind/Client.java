/*
 * Client class to test algorithm implementation.
 */
package algorithms.unionfind;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Client class to test implementation.
 */
public class Client {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int universeSize;
        int element;
        String command = "e";
        System.out.print("Please enter universe size: ");
        universeSize = scn.nextInt();
        int[] universe = new int[universeSize];
        System.out.print("Please add elements to your Universe");
        for (int i=0; i<universeSize; i++) {
            System.out.print("Please enter element to be added to Universe: ");
            element = scn.nextInt();
        }
        System.out.printf("Universe: %s", Arrays.toString(universe));
        while (command != "e") {
            System.out.print(
                "Enter 'u' for Union and 'f' for Find and 'e' to exit: ");
            command = scn.next();
            System.out.printf("Command: %s", command);
        }
        System.out.println("Exiting universe.");
    }
    
}
