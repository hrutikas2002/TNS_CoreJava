//Demonstrating a program foe encapsulation in Java

package com.tnsif.encapsulation;

public class Student
{
	
	int rollNo;
	String Name;
	int sub1,sub2,sub3;
	float result;
	
	Student()
	{
		System.out.println("Default Constructor");
	}

	Student(int rollNo, String Name, int sub1, int sub2, int sub3)
	{
		this.rollNo=rollNo;
		this.Name=Name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	
	void show()
	{
		result=sub1+sub2+sub3/0.3f;
		System.out.println("*******Student Result*******");
		System.out.println("Roll no= "+rollNo+"\nName= "+Name+"\nSubject1= "+sub1+"\nSubject2= "+sub2+"\nSubject3= "+sub3+"\nResult= "+result+"\n");
	}

}


