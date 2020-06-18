
package sllist;

public class SLList {



    
    public static void main(String[] args) {
        SNode<String> node1 = new SNode<>("node1", null);
        SNode<String> node2 = new SNode<>("node2", null);
        SNode<String> node3 = new SNode<>("node3", null);
        SNode<String> node4 = new SNode<>("node4", null);
        SNode<String> node5 = new SNode<>("node5", null);
      
         
        SList<String> sList = new SList<>();
        
        sList.addFirst(node1);
        sList.addFirst(node2);
        sList.addFirst(node3);
        sList.addFirst(node4);
        sList.addFirst(node5);

         
        System.out.println("\nBefore removeFirst()");
        sList.showList();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
       
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
       
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
         System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
         System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
         System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
         System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
        
        
    }
}