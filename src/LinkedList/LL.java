/**
 * 
 */
package LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author virat
 *
 */
public class LL {

	/**
	 * @param args
	 * @return 
	 */
	public static Node<Integer> AddTwoNumber(Node<Integer> l1, Node<Integer> l2){
		if(l1== null) {
			return null;
		}
		if(l2==null) {
			return null;
		}
		
		Node<Integer> ans = l1;
		Node<Integer> prev = null;
		int c = 0;
		while(l1!=null && l2!=null) {
			int sum = l1.data + l2.data + c;
			int num = sum % 10;
			ans.data = num;
			ans.next = prev;
			prev = ans;
			c = sum/10;
			l1 = l1.next;
			l2 = l2.next;
		}
		while(l1!=null) {
			int sum = l1.data + c;
			int num = sum % 10;
			ans.data = num;
			ans.next = prev;
			prev = ans;
			c = sum /10;
			l1 = l1.next;
		}
		while(l2!=null) {
			int sum = l2.data + c;
			int num = sum % 10;
			ans.data = num;
			ans.next = prev;
			prev = ans;
			c = sum/10;
			l2 = l2.next;
		}
		return ans;
	}
	public static void print(Node<Integer> head){
	    Node<Integer> temp = head;

	    while(temp != null){
	        System.out.print(temp.data +" ");
	        temp = temp.next;
	    }
	    System.out.println();
	}
	static void removeDuplicate(Node head)  
    { 
        // Hash to store seen values 
        HashSet<Integer> hs = new HashSet<>(); 
      
        /* Pick elements one by one */
        Node<Integer> current = head; 
        Node<Integer> prev = null; 
        while (current != null)  
        { 
            int curval = current.data; 
              
             // If current value is seen before 
            if (hs.contains(curval)) { 
                prev.next = current.next; 
            } else { 
                hs.add(curval); 
                prev = current; 
            } 
            current = current.next; 
        } 
  
    }
	public static int len(Node<Integer> head){
        int count = 0;
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;
        
    }
 
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
		
        int l1 = len(head1);
        int l2 = len(head2);
        Node<Integer> ans= new Node<>(0);
        Node<Integer> prev=ans;
        int i = 0;
        int k = 0;
        while(i<l1 && k<l2){
            if(head1.data<head2.data){
                prev.next = head1;
                head1 = head1.next;
                prev = prev.next;
                i++;
            }else{
                prev.next = head2;
                head2 = head2.next;
                prev = prev.next;
                k++;
            }
        }
		while(i<l1){
            prev.next = head1;
            head1 = head1.next;
            prev = prev.next;
            i++;
        }
        while(k<l2){
            prev.next = head2;
            head2 = head2.next;
            prev = prev.next;
            k++;
        }
        
        return ans.next;
	}


public static Node<Integer> AlterList(Node<Integer> head1,  Node<Integer> head2) {
		 Node<Integer> ans = new Node(0);  
			Node<Integer> temp = ans;
	        HashMap<Integer,Integer> map = new HashMap();
	            while(head2!=null){
	                if(map.containsKey(head2.data)){
	                    int val = map.get(head2.data);
	                    map.put(head2.data,val+1);
	                    head2 = head2.next;
	                    continue;
	                }
	                map.put(head2.data,1);
	                head2 = head2.next;
	            }
	            Node<Integer> temp1 = head1;
	            System.out.println(map);
				while (temp1 != null)
				{	
					if(map.containsKey(temp1.data)){
	                    int val = map.get(temp1.data);
	                     if((temp1.data & 1) !=0){
	                          if(val>1){
	                        temp.next = temp1;
	                        temp = temp.next;
	                        map.put(temp1.data,val-1);
	                    }else if(val==1){
	                    	map.remove(temp1.data);
	                    }
	                     }
	                }
					temp1 = temp1.next;
				}
				System.out.println(ans.next.data);
				System.out.println(map);
				//System.out.println(temp1.next.data);
	        while(head1 !=null){
//	        	System.out.println(head1.data);
	        	
	            if(map.containsKey(head1.data)){
	            		//System.out.println(head1.data);
	                    int val = map.get(head1.data);
	                    if(val>=1) {
	                    	if((head1.data)%2==0){  
		                        temp.next = head1;
		                        temp = temp.next;
		                     }
	                    	map.put(head1.data,val-1);
	                    }else {
	                    	map.remove(head1.data);
	              
	                    }
	                }
	            head1 = head1.next;
	        }
	        	
	        	System.out.println("8888");
				return ans.next;

	    }
	 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node<Integer> l1 = new Node<Integer>(0);
		 Node<Integer> l2 = new Node<Integer>(0);
		 	int arr[] = {1,2,3,4,5,6,7};
		    Node<Integer>head1=l1;
		    for(int i=0;i<arr.length;i++)
		    {
		        Node<Integer> node2 = new Node<Integer>(arr[i]);
		        l1.next = node2;
		        l1=node2;
		    }
		    int arr1[] = {2,4,4,7,8,10};
		    Node<Integer> head2 = l2;
		    	for(int i=0;i<arr1.length;i++)
			    {
			        Node<Integer> node2 = new Node<Integer>(arr1[i]);
			        l2.next = node2;
			        l2=node2;
			    }
		    
		    
//		Node<Integer> ans =  AddTwoNumber(l1,l2);
//	while(head2.next!=null) {
//		System.out.println(head2.next.data);
//		head2 = head2.next;
//	}
		 
		Node<Integer> ans = AlterList(head1.next,head2.next);
		while(ans!=null) {
			System.out.println(ans.data);
			ans = ans.next;
		}
		    

	}

}
