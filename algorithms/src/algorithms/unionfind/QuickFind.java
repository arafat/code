/**
 * Quick find is a varient of Union-Find algorithm where Find operation
 * is optimized.
 * Complexity Analysis
 */
package algorithms.unionfind;

import java.util.Arrays;

/**
 * It maintains a set of connected components, a connected component is a
 * graph with connected nodes, if 2 nodes in question belongs to same connected
 * components then we can say that they are connected or reachable else not.
 * 
 * All the nodes are maintained as an array with array indeces representing the
 * nodes and array values are used to create and maintain connected components.
 * All nodes which belong to the same connected component will have same value
 * in the array, so every Union operation will involve changing array entries
 * to maintain connected components.
 * On the other hand Find operation involves on check if 2 nodes have same value
 * in array if they have then they are connected else not.
 */
public class QuickFind {
    
    private int[] universe;
    
    /**
     * 
     * @param u Array of elements in the universe.
     */
    QuickFind(int[] u) {
        universe = u;
        System.out.printf("Universe Created %s", Arrays.toString(universe));
        System.out.println();
    }
    
    /**
     * 
     * @param ele1 Element in the universe.
     * @param ele2 Element in the universe.
     */
    public void Union(int ele1, int ele2) {
        int newRoot = universe[ele2];
        int oldRoot = universe[ele1];
        for (int i=0; i<universe.length; i++) {
            if (universe[i] == oldRoot) universe[i] = newRoot;
        }
        System.out.printf("Created union between %d and %d", ele1, ele2);
        System.out.println();
    }
    
    /**
     * 
     * @param ele1 Element in the universe.
     * @param ele2 Element in the universe.
     * @return true/false whether there is a connection or not.
     */
    public boolean Find(int ele1, int ele2) {
        return universe[ele1] == universe[ele2];
    }
    
}
