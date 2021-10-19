package Line_Comparision;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparision Computation Program ");
		System.out.println("Enter the value for Line1 ");
		float x1,x2,x3,x4,y1,y2,y3,y4;
		Scanner o=new Scanner(System.in);
		x1=o.nextFloat();
		System.out.println("x1 = "+x1);
		y1=o.nextFloat();
		System.out.println("y1 = "+y1);
		x2=o.nextFloat();
		System.out.println("x2 = "+x2);
		y2=o.nextFloat();
		System.out.println("y2 = "+y2);
		
		double Line1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Length of Line1 = "+Line1);
		
		System.out.println("Enter the value for Line2");
		x3=o.nextFloat();
		System.out.println("x3 = "+x3);
		y3=o.nextFloat();
		System.out.println("y3 = "+y3);
		x4=o.nextFloat();
		System.out.println("x4 = "+x4);
		y4=o.nextFloat();
		System.out.println("y4 = "+y4);
		
		double Line2=Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		System.out.println("Length of Line2 = "+Line2);
		
		// to Check Weather the lines are equal are not by using equals(); method 
		// to check this we have to convert the datatype double to string 
		
		String str1 = Double.toString(Line1);
		String str2 = Double.toString(Line2);
		System.out.println("Is both the lines Line1 and Line2 are equal "+str1.equals(str2));
		
		//comparing both the lines 
		
		int a = str1.compareTo(str2);
		if(a<0)
		{
			System.out.println("Line1 is Smaller then Line2 ");
			
		}
		else if(a>0)
		{
			System.out.println("Line1 is Greater then Line2 ");
		}
		else 
		{
			System.out.println("Both the lines Line1 and Line2 are equal");
		}
		

	}

}
