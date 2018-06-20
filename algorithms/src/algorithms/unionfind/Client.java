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
        String command;
        System.out.print("Please enter universe size: ");
        universeSize = scn.nextInt();
        int[] universe = new int[universeSize];
        System.out.println("Please add elements to your Universe");
        for (int i=0; i<universeSize; i++) {
            System.out.print("Please enter element to be added to Universe: ");
            universe[i] = scn.nextInt();
        }
        System.out.printf("Universe: %s", Arrays.toString(universe));
        System.out.println();
        QuickFind qf = new QuickFind(universe);
        while (true) {
            System.out.print(
                "Enter 'u' for Union and 'f' for Find and 'e' to exit: ");
            command = scn.next();
            switch(command) {
                case "u":
                    System.out.println("Call Union");
                    break;
                case "f":
                    System.out.println("Call Find");
                    break;
                case "e":
                    System.out.println("Exit Universe!");
                    break;
                default:
                    System.out.println("Please enter u/f/e only.");
            }
            if (command.equals("e")) break;
        }
        System.out.println("Exiting universe.");
    }
    
}
