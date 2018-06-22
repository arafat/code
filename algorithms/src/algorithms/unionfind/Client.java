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
        QuickUnion qf = new QuickUnion(universe);
        while (true) {
            System.out.print(
                "Enter 'u' for Union and 'f' for Find and 'e' to exit: ");
            command = scn.next();
            switch(command) {
                case "u":
                    System.out.println(
                            "Enter 2 elements to create union.");
                    System.out.print("First Element: ");
                    int ele1 = scn.nextInt();
                    System.out.print("Second Element: ");
                    int ele2 = scn.nextInt();
                    qf.Union(ele1, ele2);
                    break;
                case "f":
                    System.out.println(
                            "Enter 2 elements to find the connection");
                    System.out.print("First Element: ");
                    int ele3 = scn.nextInt();
                    System.out.print("Second Element: ");
                    int ele4 = scn.nextInt();
                    System.out.printf(
                            "Are they connected?: %s", qf.Find(ele3, ele4));
                    System.out.println();
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
