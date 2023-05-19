import java.util.*;


public class BQ1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner so=new Scanner (System.in);
		LinkedList <Integer> l = new LinkedList<>();
		l.add(1);
		l.addLast(3);
		l.addLast(2);
		l.addLast(4);
		l.addLast(6);
		l.addLast(5);
		l.addLast(9);
		l.addLast(6);
		l.sort(null);
		for (int i=0;i<l.size();i++)
			System.out.println(l.get(i));
		System.out.println("next");
		int j=0;
		for (int i=l.size()-1;i>=0 && j<i;i--)
		{
			int temp=l.get(j);
			l.set(j, l.get(i));
			l.set(i, temp);
			j++;
		}
		for (int i=0;i<l.size();i++)
			System.out.println(l.get(i));
		l.sort(null);
		System.out.println("Enter the value");
		int v=so.nextInt();
		int i=0;
		for (;i<l.size();i++)
			if(v<l.get(i))
				break;
		if(i<l.size())
		{
			int temp=l.get(i);
			l.set(i,v);
			i++;
			while(i<l.size())
			{
				temp=l.get(i);
				l.set(i,temp);
			}
			l.addLast(temp);
		}
		else
			l.addLast(v);
		for (int k=0;k<l.size();k++)
			System.out.println(l.get(k));
		
		

	}

}
