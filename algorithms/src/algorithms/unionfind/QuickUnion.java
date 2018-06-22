/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.unionfind;

/**
 *
 * @author arafat
 */
public class QuickUnion {
    
    private int[] universe;
    
    QuickUnion(int[] u) {
        universe = u;
    }
    
    private int FindRoot(int ele) {
        while (ele != universe[ele]) {
            ele = universe[ele];
        }
        return ele;
    }
    
    public void Union(int ele1, int ele2) {
        universe[FindRoot(ele1)] = FindRoot(ele2);
    }
    
    public boolean Find(int ele1, int ele2) {
        return FindRoot(ele1) == FindRoot(ele2);
    }
    
}
