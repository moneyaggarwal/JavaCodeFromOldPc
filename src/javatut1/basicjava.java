

package javatut1;

	
	/*static
	{
          System.out.println("hello");
	}
public final static void main(String... args)
{
	System.out.println("World");
}*/

	
	/*class test
}


package javatut1;

import java.util.ArrayList;


public class practiceifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    char a='g';
		    char b='y';
		    System.out.println(a+"+"+b);
		
		int i=10;
		int j=10;
		if (i<j) {
			System.out.println("smaller");
		}
		else if (i>j) {
			System.out.println("larger");
		}
		else if (i=j) {
			System.out.println(equal");
		}
		else
		{
			System.out.println("dont know");
		}
	
	String color="green";
	switch (color) {
	case "red":
		System.out.println("Its red");
		break;

	default:
		System.out.println("its green");
		break;
		
//		//for (int i = 0; i < 5;) 
//		int i=0;
//		while(i<5){
//			System.out.println("its green");
//			i++;
//		}
//		
//	do 
//	{
//		System.out.println("its red");
//	i++;
//	}	while(i<5);
		
	//arrays
		//String name[]= new String[10];
	     String petname[]= {"agg","gupta","dylon"};
	     for (String string : petname) {
	    	 System.out.println("last name is "+string);
		}
	     int nos[]=new int[10];
	     for(int i=0;i<nos.length;i++) {
	    	 nos[i]=(10*i);
	    	 System.out.println("array" +i+ "is" +nos[i]);
	     }
	String str="Hello";
	String str1=str;
	for (int j = 0; j <str.length(); j++) {
		
		str1=str1+1;
		System.out.println(str1);
	}
	
		ArrayList<String> carmake= new ArrayList<String>();
		carmake.add("Honda");
		carmake.add("toyota");
		System.out.println(carmake);
		for(String a:carmake)
		{
			System.out.println(a);
		}
		ArrayList<Integer> model=new ArrayList<Integer>();
		model.add(100);
		model.add(200);
		for(int i:model)
		{
			System.out.println(i);
		}
		model.forEach((a)->System.out.println(a));
		
		
		int z,j;
		Sum a1=new Sum();
		a1.fiboseries();
		
		
		z=a1.multiply(4, 6);
		System.out.println(z);
		a1.show();
		j=a1.sum();
		System.out.println(j);
		double z;
		z=division(14,5);
		System.out.println(z);
		Object obj[]=new Object[5];
		obj[0]="nj";
		obj[1]=100;
		System.out.println(obj);
		
		
	}
}
	
public static double division(double a,double b) {
	
	System.out.println("division is " +a/b);
	return(a%b);
	
}
}
	  class Sum
	  {
	
		int x;
		int y;
		
		public int sum()
		{
			System.out.println("inside sum method");
			return (x+y);
		}
		void show()
		{
			System.out.println("inside show function");
			System.out.println(sum());
		}
		public int multiply(int a,int b)
		{
			//this.x=a;
			//this.y=b;
			System.out.println("inside multiply");
			return(a*b);
			
		}
		void fiboseries()
		{
			int x,y,sum;
			x=0;
			y=1;
			System.out.println(x);
			System.out.println(y);
			for(int i=0;i<10;i++)
			{
				
			sum=x+y;
			x=y;
			y=sum;
			System.out.println(sum);
		}
	}
		
	 }

		

	
	


*/