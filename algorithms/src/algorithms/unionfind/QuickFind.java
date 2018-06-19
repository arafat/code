/**
 * Quick find is a varient of Union-Find algorithm where Find operation
 * is optimized.
 * Complexity Analysis
 */
package algorithms.unionfind;

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
    
    QuickFind() {
    }
    
}
