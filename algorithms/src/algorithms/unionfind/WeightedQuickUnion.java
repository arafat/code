/**
 * Quick union is a varient of Union-Find algorithm where Union operation
 * is optimized.
 * Complexity Analysis
 */
package algorithms.unionfind;

import java.util.Arrays;

/**
 *
 * @author arafat
 */
public class WeightedQuickUnion {
    
    private int[] universe;
    private int[] universeWeight;
    
    /**
     * 
     * @param u Array of elements in the universe.
     */
    WeightedQuickUnion(int[] u) {
        universe = u;
        for (int i=0; i<u.length; i++) {
            universeWeight[i] = 1;
        }
        System.out.printf("Universe Created %s", Arrays.toString(universe));
        System.out.println();
    }
    
    private int FindRoot(int ele) {
        while (ele != universe[ele]) {
            ele = universe[ele];
        }
        return ele;
    }
    
    /**
     * 
     * @param ele1 Element in the universe.
     * @param ele2 Element in the universe.
     */
    public void Union(int ele1, int ele2) {
        universe[FindRoot(ele1)] = FindRoot(ele2);
        System.out.printf("Created union between %d and %d", ele1, ele2);
        System.out.println();
    }
    
    /**
     * 
     * @param ele1 Element in the universe.
     * @param ele2 Element in the universe.
     */
    public boolean Find(int ele1, int ele2) {
        return FindRoot(ele1) == FindRoot(ele2);
    }
    
}
