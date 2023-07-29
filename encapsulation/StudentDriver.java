package com.tnsif.encapsulation;

public class StudentDriver {

	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.rollNo=01;
		s1.Name="Hrutika";
		s1.sub1=90;
		s1.sub2=67;
		s1.sub3=99;
		s1.show();
		
		Student s2=new Student(02,"Srushti",85,65,75);
		s2.show();
		
	}

}
