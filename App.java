/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblacktree;

public class App {

    public static void main(String[] args) {

    	RedBlackTree tree = new RedBlackTree();
       
        tree.insert(10);
        tree.traverseGraph();
        tree.insert(20);
        tree.traverseGraph();
        tree.insert(30);
        tree.traverseGraph();
        tree.insert(15);
      
        tree.traverseGraph();
    }
}

