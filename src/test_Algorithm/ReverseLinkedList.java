package test_Algorithm;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;

public class ReverseLinkedList {
	
	  public ListNode reverseBetween(ListNode head, int m, int n) {
	        
	        if (head==null) return null;//If head is null, return null
		    if (m==n) return  head;// if m==n, then no reverse needed. return head.
		
		    
		    //m=1 is head node, assume 1<=m<=n<=Length of list
		    ListNode current=head;
	 	    ListNode nodeBeforeM;
	        ListNode nodeM;
	        int i=1;
	        	    
		    ListNode prev;
		    ListNode next;
		    
		    //part 1
		    //if m=1, then revserse from m
		    //if m!=1, then find the node m and record the node before m.
	        if (m==1){
	            nodeM=head;
	            nodeBeforeM=head;
		        prev=current;
		        current=current.next;
		        i++;
		        prev.next=null;
	        }else
	        {
	        	nodeBeforeM=current;
	        	nodeM=current.next;
		        while(i<m){
		            nodeBeforeM=current;
			        current=current.next;
		            nodeM=current;
			        i++	;
		        }
	           
	        }
            prev=current;
	        current=current.next;
	        i++;
	        prev.next=null;

	        //Part 2
	        //start from m+1
	        //if node m is know. 1. get m+1 
	        //2. set m.next to previous node,
	        //3. previous node current 
	        //4. current node point to m+1, 
	        
		    while(i<=n)
		    {	
			    next=current.next;
			    current.next=prev;
			    prev=current;
			    current=next;
			    i++;
		    }
		    
		   
		    //Part 3  
		    //when i==n, if no node after n, then n must be the last node, Current not should be null
		    // or if any node after n, current is the node after n, 
		    // we need to point m.next to this node. 
		    if (current==null)	{
			    //return prev;   
		    }
		    else
		    {
		        nodeM.next=current;
		    }
		    
		    //if m!=1, we return head because head is not been changed. 
		    // if m==1, we return node n as head node. 
	        if (m!=1) 
	        {
	            nodeBeforeM.next=prev;
	            System.out.println("nodeBeforeM:"+nodeBeforeM.val+" ");
	            //new java.util.Scanner(System.in).nextLine();
	            return head;
	        }else
	        {
	        	System.out.println("nodeBeforeM:"+nodeBeforeM.val+" ");
	            return prev;
	        }   

		        
	    }
	    
	    public static void printList(ListNode head)
	    {
	    	if (head==null)
	    		System.out.println("empty");
	    	
	    	ListNode current=head;
	    	while(current!=null)
	    	{
	    		System.out.println(current.val+" ");
	    		current=current.next;
	    	}
	    }
	    
	    
	    public void reorderList(ListNode head) {
	        //reverse the second half list, and merge with the first half. 
	        //suppose n nodes, revers from n/2+2 to end
	        
	        int count=0;
	        ListNode current=head;
	    
	        while(current!=null)
	        {
	            current=current.next;
	            count++;
	        }
	        
	        if(count<3) return;
	        
	        /////////////////////////////
	        current=head;
	        ListNode prev=head;
	        int i=1;
	        while(i<count/2+2)
	        {
	            prev=current;
	            current=current.next;
	            i++;
	        }
	        
	        prev.next=null;
	        //reverse currrent
	        prev=null;
	        
	       
	        ListNode Next=current;
	        while(current!=null)
	        {
	            Next=current.next;
	            current.next=prev;
	            prev=current;
	            current=Next;
	        }
	        System.out.println("====");
	        printList(prev);
	        //now prev is the head of reversed second list. 
	        //
	        //merge with head;
	        ListNode head2=prev;
	        ListNode head1=head.next;
	        prev=head;
	        ListNode tail=head;
	        while(true)
	        {
	            if(head1==null)
	            {
	                tail.next=head2;
	                break;
	            }
	            
	            if(head2==null)
	            {
	                tail.next=head1;
	                break;
	            }
	            
	            if(tail.next==head1)
	            {
	                tail.next=head2;
	                tail=tail.next;
	                head2=head2.next;
	            }
	            else
	            {
	                tail.next=head1;
	                tail=tail.next;
	                head1=head1.next;
	            }
	        }
	        
	    }
	    
	    public static void main(String[] args) {
	    	//ReverseLinkedList A=new ReverseLinkedList();
	    	
	    	//ListNode a=new ListNode(3);
	    	//a.next=new ListNode(5);
	    	//printList(A.reverseBetween(a, 1, 2));
	    	
//	    	ListNode a=new ListNode(1);
//	    	a.next=new ListNode(2);
//	    	a.next.next=new ListNode(3);
//	    	printList(a);
//	    	printList(A.reverseBetween(a, 2, 3));
	    	
//	    	ListNode a=new ListNode(1);
//	    	Hashtable aHash=new Hashtable();
//	    	aHash.put("a",a);
//	    	
//	    	ListNode b=(ListNode)aHash.get("a");
	    	int[][] A=new int[1][3];
	    	//ArrayList A=new ArrayList();
	    	//A.add(1);
	    	//A.add(1);
	    	//int c=(int)A.get(0)+(int)A.get(1);
	    	String s="test";
	    	System.out.println(s.charAt(5));
	    	
	    	
//	    	a.next=new ListNode(2);
//	    	a.next.next=new ListNode(3);
//	    	a.next.next.next=new ListNode(4);
//	    	a.next.next.next.next=new ListNode(5);
	    	//printList(a);
	    	//A.reorderList(a);
	    	//PrintList(a);
	    	//printList(A.reverseBetween(a, 2, 4));
	    		
		}
}
