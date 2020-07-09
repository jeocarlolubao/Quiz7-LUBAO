/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz7lubao;

import positionexample.Position;
import quiz7lubao.LinkedBinaryTree.Node;

/**
 *
 * @author Jeo
 */
public class Quiz7LUBAO {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        Node<String> node1 = new Node<>("node1", null, null, null);
        Node<String> node2 = new Node<>("node2", node1, null, null);
        Node<String> node3 = new Node<>("node3", node1, null, null);

        //tree2
        Node<String> node4 = new Node<>("node4", node2, null, null);
        Node<String> node5 = new Node<>("node5", node3, null, null);
        Node<String> node6 = new Node<>("node6", node3, null, null);

//        LinkedBinaryTree<String> tree = new LinkedBinaryTree<>();
        LinkedBinaryTree<Node> tree = new LinkedBinaryTree<>();

//        tree.addRoot("root");
//        tree.addLeft(tree.root(), "left child of root");
//        tree.addRight(tree.root(), "right child of root");
        tree.addRoot(node1);

        tree.addLeft((Position) node1, node2);
        tree.addRight((Position) node1, node3);

        tree.addLeft((Position) node2, node4);
        tree.addLeft((Position) node3, node5);
        tree.addRight((Position) node3, node6);
        
        // binary tree illustration
        //          node1  ----> root
        //         /    \
        //        node2  node3
        //        /      /   \
        //     num4   node5  node6

//        LinkedBinaryTree<Node> tree2 = new LinkedBinaryTree<>();
//        
//        tree2.addLeft((Position) node2, node4);
//        tree2.addLeft((Position) node3, node5);
//        tree2.addRight((Position) node3, node6);


        System.out.println("root: " + tree.root().getElement().getElement());
        System.out.println("left child: " + tree.left((Position) node1).getElement());
        System.out.println("right child: " + tree.right((Position) node1).getElement());

        System.out.println("left child of node2: " + tree.left((Position) node2).getElement());
        System.out.println("sibling of node6: " + tree.left((Position) node3).getElement());

        System.out.println();
        System.out.println("sibling of node3: " + tree.sibling((Position) node3).getElement());
        System.out.println("number of children of node1: " + tree.numChildren((Position) node1));
        System.out.println("Parent of node2: " + tree.parent((Position) node2).getElement());
        System.out.println("number of children of node3: " + tree.numChildren((Position) node3));
        System.out.println("Sibling of node6: " + tree.sibling((Position) node6).getElement());
        
        

        // binary tree illustration
        //          node1  ----> root
        //         /    \
        //        node2  node3
        //        /      /   \
        //     node4   node5  node6
        // System.out.println("displaying the tree\n");
        
//        System.out.println("root: " + tree.root().getElement());
//        System.out.println("left child: " + tree.left(tree.root()).getElement());
//        System.out.println("right child: " + tree.right(tree.root()).getElement());
//        
    }

}
