import java.util.*;
public class Passenger
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    ArrayList<Integer>list1=new ArrayList<>();
	    ArrayList<String>list2=new ArrayList<>();
	    ArrayList<String>list3=new ArrayList<>();
	    ArrayList<String>list4=new ArrayList<>();
	    ArrayList<String>list5=new ArrayList<>();
	    ArrayList<String>list6=new ArrayList<>();
	     ArrayList<String>list7=new ArrayList<>();
	    for(int i=0;i<n;i++)
	    {
	        list1.add(sc.nextInt());
	    }
	    for(int i=0;i<n;i++)
	    {
	        list2.add(sc.next());
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(list1.get(i)==0||list1.get(i)<10)
	        {
	             list3.add(list2.get(i));
	        }
	        else if(list1.get(i)==10||list1.get(i)<20)
	        {
	            list4.add(list2.get(i));
	        }
	        else if(list1.get(i)==20||list1.get(i)<30)
	            list5.add(list2.get(i));
	       else if(list1.get(i)==30||list1.get(i)<40)
	            list6.add(list2.get(i));
	       else
	       {
	           list7.add(list2.get(i));
	       }
	    }
	    System.out.print("0-10:");
	    System.out.println(list3);
	    System.out.print("10-20:");
	    System.out.println(list4);
	    System.out.print("20-30:");
	    System.out.println(list5);
	    System.out.print("30-40:");
	    System.out.println(list6);
	    System.out.print("40+:");
	    System.out.print(list7);
	}
}