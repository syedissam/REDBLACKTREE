/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblacktree;

/**
 *
 * @author iSSAM
 */
public interface Tree {
    public Node getMax();
    public Node getMin();
    public void insert(int data);
    public void remove(int value);
    public void traverseGraph();
}