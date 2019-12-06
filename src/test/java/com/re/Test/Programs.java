package com.re.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class Programs {

	
	public static void main(String[] args)
	{
	
//		String[] values= {"abc","abc","xyz","xyz","xyut"};
//		HashMap<String, Integer> hm= new HashMap<String,Integer>();
//		int lenght=values.length;
//		
//		for(int i=0;i<=lenght;i++)
//		{
//			if(hm(i).equals(null))
//			{
//				
//			}
//		}
//		
		
		
//		
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for(int i=0; i<5;i++) {
//               if(i%2 == 0) {
//                     list.add(0);
//               }
//               else {
//                     list.add(1);
//               }
//        }
//        System.out.println(list);
		
		
//		// Declare two strings 
//        String a = "Hello"; 
//        String b = "World"; 
//          
//        // Print String before swapping 
//        System.out.println("Strings before swap: a = " +  
//                                       a + " and b = "+b); 
//          
//        // append 2nd string to 1st 
//        a = a + b; 
//          
//        // store intial string a in string b 
//        b = a.substring(0,a.length()-b.length()); 
//          
//        // store initial string b in string a 
//        a = a.substring(b.length()); 
//          
//        // print String after swapping 
//        System.out.println("Strings after swap: a = " +  
//                                     a + " and b = " + b); 
		
		
//	
		
		
		for(int i=1;i<=4;i++)
		{
			
			for(int j=4;j<=i;j++)
			{
				
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------------------------------");
		
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("----------------------------------------------");
		
		
		
		
		
	}
		
	
}
