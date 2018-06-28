/**
 * Quick union is a varient of Union-Find algorithm where Union operation
 * is optimized.
 * Complexity Analysis
 */
package algorithms.unionfind;

import java.util.Arrays;

/**
 * It maintains a set of trees collectively called forest, if 2 nodes in
 * question belongs to same tree which means they have same root then we can
 * say that they are connected or reachable else not.
 * 
 * All the nodes are maintained as an array with array indeces representing the
 * nodes and array values are used to create and maintain trees.
 * A Union operation involves changing the root of one tree to point to the
 * root of other tree which essentially means merging 2 trees.
 * On the other hand Find operation involves some work, in find we have to
 * figure out the roots of 2 nodes if they are same then we both nodes are
 * connected or reachable else not.
 */
public class QuickUnion {
    
    private int[] universe;
    
    /**
     * 
     * @param u Array of elements in the universe.
     */
    QuickUnion(int[] u) {
        universe = u;
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
