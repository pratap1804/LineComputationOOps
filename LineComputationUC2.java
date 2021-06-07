package com.PractiseHereBoy;

import java.util.Scanner;

public class LineComputationUC2 {


		public static void main(String args[]) {
		System.out.println("Welcome To Line Computaion");
		Scanner sc = new Scanner(System.in);
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		int x2= sc.nextInt();
		int y2= sc.nextInt();
		int x3= sc.nextInt();
		int y3= sc.nextInt();
		int x4= sc.nextInt();
		int y4= sc.nextInt();
		
		LineComputation obj1 = new LineComputation(x1); 
		LineComputation obj2 = new LineComputation(y1); 
		LineComputation obj3 = new LineComputation(x2); 
		LineComputation obj4 = new LineComputation(y2); 
		LineComputation obj5 = new LineComputation(x3); 
		LineComputation obj6 = new LineComputation(y3); 
		LineComputation obj7 = new LineComputation(x4); 
		LineComputation obj8 = new LineComputation(y4); 
		
		if(obj1.equals(obj5) || obj1.equals(obj7) && obj2.equals(obj6) || obj2.equals(obj8) && obj3.equals(obj5) || obj3.equals(obj7) && obj4.equals(obj6) || obj4.equals(obj8)) {
			System.out.println("Lines Are Equal");
		}
	}
}

