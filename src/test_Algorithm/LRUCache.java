package test_Algorithm;
import java.util.*;

public class LRUCache {
	    DoubleLinkedListNode head;
	    DoubleLinkedListNode end;
	    Hashtable aHash;
	    int iCapacity;
	    int iNoofElements;
	    
	    public LRUCache(int capacity) {
	        iCapacity=capacity;
	        iNoofElements=0;
	        aHash=new Hashtable(iCapacity);
	    }
	    
	    //Should be O(1)
	    public int get(int key) {
	    // 
	        if(aHash.containsKey(key)) 
	        {
	            //get the node from hashtable 
	            DoubleLinkedListNode aNode=(DoubleLinkedListNode)aHash.get(key);
	            
	            //update it to the head of the list;
	            if(aNode!=head)
	            {
	            	
	            	System.out.println("head before"+head.key);
	            	System.out.println("aNode before"+aNode.key);
	            	System.out.println("end before"+end.key);
	            	if(aNode==end)
	            	{
	            		end=aNode.prev;
	            	}
	            	aNode.prev.next=aNode.next;
	                if(aNode.next!=null){
	                    aNode.next.prev=aNode.prev;
	                }
	                
	                aNode.next=head;
	                head.prev=aNode;
	                head=aNode;
	            	System.out.println("head after"+head.key);
	            	System.out.println("aNode after"+aNode.key);
	            	System.out.println("end after"+end.key);
	            	
	            }
	            
	            
	            //get the value;
	            int iValue=aNode.val;
	            return iValue;
	        }
	        else return -1;
	    }
	    
	    //should be O(1)
	    public void set(int key, int value) {
	        
	        if (!aHash.containsKey(key)) 
	        {
	            if(iNoofElements==iCapacity)//overflow
	            {
	               //remove from hash
	            	System.out.println("remove end"+end.key);
	                aHash.remove(end.key);
	                
	                // remove least used node from double linked list 
	                if(iCapacity==1)
	                {
	                    end=null;
	                    head=null;
	                }
	                else
	                {
	                    end=end.prev;
	                    end.next=null;
	                    end.prev=null;
	                }
	                
	                iNoofElements--;
	            }
	            
	            //add new node
	            DoubleLinkedListNode aNode=new DoubleLinkedListNode(key, value);
	            aHash.put(key, aNode);
	            
	            if(iNoofElements==0){
	                head=aNode;
	                end=aNode;
	            }else
	            {
	                aNode.next=head;
	                head.prev=aNode;
	                head=aNode;
	            }
	        
	            iNoofElements++;
	        }else
	        {
	        	 //get the node from hashtable 
	            DoubleLinkedListNode aNode=(DoubleLinkedListNode)aHash.get(key);
	            aNode.val=value;
	            
	          //update it to the head of the list;
	            if(aNode!=head)
	            {
	            	System.out.println("head before"+head.key);
	            	System.out.println("aNode before"+aNode.key);
	             	
	            	if(aNode==end)
	            	{
	            		end=aNode.prev;
	            	}
	             	
	                aNode.prev.next=aNode.next;
	                if(aNode.next!=null){
	                    aNode.next.prev=aNode.prev;
	                }
	                
	                aNode.next=head;
	                head=aNode;
	            	System.out.println("head after"+head.key);
	            	System.out.println("aNode after"+aNode.key);
	            }
	            
	        }
	    }
	    
	    
	    class DoubleLinkedListNode
	    {
	        int val;
	        int key;
	        DoubleLinkedListNode prev;
	        DoubleLinkedListNode next;
	        
	        DoubleLinkedListNode(int x, int y) {
	            key=x;
	            val=y;
	        }
	    }
    
    public static void main(String[] args) {
    	LRUCache aLRU=new LRUCache(2);
    	aLRU.set(2, 1);
    	aLRU.set(1,1);
    	aLRU.get(2);
    	aLRU.set(4,1);
    	aLRU.get(1);
    	aLRU.get(2);
    	aLRU.get(3);
    }
    

}
