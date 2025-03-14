package bloodtestscheduler;

import java.util.Stack;

public class NoShowStack 
{
    
    private Stack<Patient> stack;
    private static final int MAX_SIZE = 5;
    
    public NoShowStack() 
    {
        this.stack = new Stack<>();
    }
    
    public void pushNoShow(Patient p) //pushes no show 
    {
        if (stack.size() == MAX_SIZE) 
        {
           
        }
        stack.push(p);
    }
    
    public Patient popNoShow() 
    {
        if (!stack.isEmpty()) 
        {
            return stack.pop();
        }
        return null;
    }
    
    public int size() 
    {
        return stack.size();
    }
    
    @Override
    public String toString() 
    {
        return "NoShowStack: " + stack.toString();
    }
}
