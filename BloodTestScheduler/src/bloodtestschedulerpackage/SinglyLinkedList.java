package bloodtestscheduler;

public class SinglyLinkedList 
{
    
    // class for node
    private class Node 
    {
        Patient data;
        Node next;
        
        public Node(Patient data) 
        {
            this.data = data;
            this.next = null;
        }
    }
    
    
    private Node head;
    private int size;
    
    public SinglyLinkedList() 
    {
        head = null;
        size = 0;
    }
    
    public void add(Patient p) 
    {
    }
    
    public int size() 
    {
        return size;
    }
    
    @Override
    public String toString() 
    {
        return "SinglyLinkedList with " + size + " Patient(s)";
    }
}
