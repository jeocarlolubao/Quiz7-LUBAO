/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz7lubao;

import generaltreeexample.AbstractTree;
import java.util.ArrayList;
import java.util.List;
import positionexample.Position;

/**
 *
 * @author Jeo
 */
public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {

    @Override
    public Position<E> sibling(Position<E> p) {
        Position<E> parent = parent(p);

        if (parent == null) {
            return null;
        }

        if (p == left(parent)) {
            return right(parent);
        } else {
            return left(parent);
        }
    }

    @Override
    public int numChildren(Position<E> p) {
        int count = 0;
        if (left(p) != null) {
            count++;
        }
        if (right(p) != null) {
            count++;
        }
        return count;
    }

    @Override
    public Iterable<Position<E>> children(Position<E> p) {
        List<Position<E>> snapshot = new ArrayList<>(2);
        if (left(p) != null) {
            snapshot.add(left(p));
        }
        if (right(p) != null) {
            snapshot.add(right(p));
        }

        return snapshot;
    }

    @Override
    public Position<E> left(Position<E> p) throws IllegalArgumentException {


        if (numChildren(p) == 0) {
            throw new IllegalArgumentException("no such child exists");
        } else {
            return (Position<E>) left(p).getElement();
        }

    }

    @Override
    public Position<E> right(Position<E> p) throws IllegalArgumentException {
        if (numChildren(p) == 0) {
            throw new IllegalArgumentException("no such child exists");
        } else {
            return (Position<E>) right(p).getElement();
        }
    }
    
//    public void showBinaryTree(){
//        
//        
//    }
    
    

}
