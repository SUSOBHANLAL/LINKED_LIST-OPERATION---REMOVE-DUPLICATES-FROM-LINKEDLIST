package removeDuplicatefromlinkedList;
import java.util.*;

	
		
		class node{
			int data;
			node next;
			node(int data){
			  
				this.data= data;
				next = null;
				
			}
		}
		
		class linkedllist{
			node head;
		
		void removeduplicates() {
			HashSet<Integer> set = new HashSet<Integer>(); 
			node  current = head;
			node prev = null;
			
			
			while(current!=null) {
				int val = current.data;
				//akhana jodi aga o oi val present thaka thoola link kai kata daya hoab
				if(set.contains(val)) {//if yes
					//current node ka prev ta dia dita hoab
					prev.next = current.next;//akhna ami prev next ar satha current next lik kora dilam aand current ka hatiya dilam
					
					
				}else {
					set.add(val);
					prev = current;
				}
				current = current.next;
				
			}
		}
		
		void printlist() {
			node curr = head;
			while(curr!=null) {
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
		}
	}
	public class susobhan {
		public static void main(String args[]) {
			linkedllist l =new linkedllist();
			l.head= new node(9);
			l.head.next = new node(12);
			l.head.next.next = new node(12);
			l.head.next.next.next= new node(15);
			
			
			//the origional link list 
			System.out.println("the original linked list will be");
			l.printlist();
			
			l.removeduplicates();
			
			
			System.out.println();
			
			//  after the removal of duplicate
			System.out.println("after the removal it will be like");
			l.printlist();
			
		}

}
