import java.util.Scanner;

public class Link {
	
	static Node head=null;
	
	static void InsSort(int a)
	{
		Node curr=head;
		Node curr1=head.next;
		Node temp=new Node(a);
		while (curr1!=null)
		{
			if(curr.data<=a && curr1.data>a)
			{
				temp.next=curr1;
				curr.next=temp;
				break;
			}
			curr=curr.next;
			curr1=curr1.next;
		}
		if (curr1==null)
			curr.next=temp;
	}
	
	static void print(Node a)
	{
		Node curr=a;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

	static void search(int a)
	{
		Node curr=head;
		int c=0;
		while(curr!=null)
		{
			if (curr.data==a)
			{
				System.out.println("Found");
				c++;
				break;
			}
			curr=curr.next;
		}
		if(c==0)
			System.out.println("Not Found");
	}
	
	static void DelHead()
	{
		if (head==null)
		{
			System.out.println("No element is present");
			return;
		}
		if (head.next==null)
		{
			head=null;
			return;
		}
		head=head.next;
		System.out.println("Head Deleted");
	}
	
	static void Del(int a)
	{
		Node curr1=head.next;;
		Node curr=head;
		int c=0;
		while (curr1!=null)
		{
			if (head.data==a)
			{
				head=head.next;
				c++;
				break;
			}
			if(curr1.data==a)
			{
				curr.next=curr1.next;
				c++;
				break;
			}
			curr1=curr1.next;
			curr=curr.next;
		}
		if(curr1==null && c<1)
			System.out.println("Element not there");
	}

	static void DelAll(int a)
	{
		Node curr1=head.next;;
		Node curr=head;
		int c=0;
		while (curr1!=null)
		{
			if (head.data==a)
			{
				head=head.next;
				c++;
			}
			if(curr1.data==a)
			{
				Node t=curr1;
				curr1=curr1.next;
				curr.next=t.next;
				c++;
			}
			curr1=curr1.next;
			curr=curr.next;
		}
		if(curr1==null && c<1)
			System.out.println("Element not there");
	}

	static void DelLL()
	{
		head=null;
		System.out.println("Linked List Deleted");
	}

	static void Rev()
	{
		Node temp=head.next.next;
		Node temp1=head.next;
		Node temp2=head;
		temp2.next=null;
		while (temp.next!=null)
		{
			temp1.next=temp2;
			temp2=temp1;
			temp1=temp;
			temp=temp.next;
		}
		temp1.next=temp2;
		temp.next=temp1;
		head=temp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner (System.in);
		Node curr=head;
		System.out.println("Enter no of element");
		int n=so.nextInt();
		while (n>0)
		{
			if(head==null)
			{
				System.out.println("Enter the element");
				head=new Node(so.nextInt());
				curr=head;
				n--;
			}
			else
			{
				System.out.println("Enter the element");
				curr.next=new Node(so.nextInt());
				curr=curr.next;
				n--;
			}
		}
		System.out.println("Enter the Choice");
		System.out.println("1.Print");
		System.out.println("2.Insert to sort LL");
		System.out.println("3.Search");
		System.out.println("4.Delete Head");
		System.out.println("5.Delete Node");
		System.out.println("6.Delete All Occurrence of Node");
		System.out.println("7.Delete Linked List");
		System.out.println("8.Reverse");
		int c=so.nextInt();
		while(c!=0)
		{
			switch(c) {
				case 1:
					print(head);
					break;
				case 2:
					System.out.println("Enter The Element");
					InsSort(so.nextInt());
					break;
				case 3:
					System.out.println("Enter The Element");
					search(so.nextInt());
					break;	
				case 4:
					DelHead();
					break;
				case 5:
					System.out.println("Enter the Element");
					Del(so.nextInt());
					break;
				case 6:
					System.out.println("Enter the Element");
					DelAll(so.nextInt());
					break;
				case 7:
					DelLL();
					break;
				case 8:
					Rev();
					break;
			}
			System.out.println("Enter the Choice");
			System.out.println("1.Print");
			System.out.println("2.Insert to sort LL");
			System.out.println("3.Search");
			System.out.println("4.Delete Head");
			System.out.println("5.Delete Node");
			System.out.println("6.Delete All Occurrence of Node");
			System.out.println("7.Delete Linked List");
			System.out.println("8.Reverse");
			c=so.nextInt();
		}
	

	}

}
