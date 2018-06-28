/**
 * Quick union is a varient of Union-Find algorithm where Union operation
 * is optimized.
 * Complexity Analysis
 */
package algorithms.unionfind;

import java.util.Arrays;

/**
 *
 * Its an improvement over QuickUnion algorithm.
 * One problem with QuickUnion was that in worst case trees may get very tall
 * e.g.: If you end up attaching long trees to small one.
 * 
 * Weighted Quick Union make sure that always a smaller tree is attached to
 * longer tree, that way the overall height of the tree is always less.
 * 
 * Maintain a weight array which initially store every node with weight 1,
 * before merging 2 tree compare weights of the roots of both the tree and
 * attach shorter one to longer one, also update the weight of the root of
 * final tree.
 * 
 * If in a Union operation 2 trees have same root which means that they are
 * already connected then then we don't have to make another attempt for a
 * redundant connection as it may effect the weight of the root.
 * 
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
        universeWeight = new int[u.length];
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
        int root1 = FindRoot(ele1);
        int root2 = FindRoot(ele2);
        if (root1 == root2) {
            System.out.println("Already connected");
            return;
        }
        if (universeWeight[root1] > universeWeight[root2]) {
            universe[root2] = root1;
            universeWeight[root1] += universeWeight[root2];
        } else {
            universe[root1] = root2;
            universeWeight[root2] += universeWeight[root1];
        }
        System.out.printf("New universe %s", Arrays.toString(universe));
        System.out.println();
        System.out.printf("Final universe weights %s", Arrays.toString(
                universeWeight));
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
