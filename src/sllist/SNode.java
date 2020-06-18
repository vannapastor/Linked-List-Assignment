/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sllist;

/**
 *
 * @author user
 */
class SNode<T> {
     private T  element;
    private SNode next;
    
    //constructor of SNode
    public SNode(T element, SNode next){
        this.element = element;
        this.next = next;
    }

    /**
     * @return the element
     */
    public T getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * @return the next
     */
    public SNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(SNode next) {
        this.next = next;
    }
    
    
}

