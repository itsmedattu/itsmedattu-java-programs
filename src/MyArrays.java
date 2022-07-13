

import java.util.ArrayList;
import java.util.List;

public class MyArrays {

	public static void main(String[] args) {
		
		String s1="Dattatreya";
		String s2=new String("Dattatreya");
		String s3=s2;
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		// TODO Auto-generated method stub
	    MyArrays ma=new MyArrays();
	    
		Employee e1=new Employee("Dattu", 24, 200);
		Employee e2=new Employee("Pranavi", 22, 2100);
		Employee e3=new Employee("Prem", 25, 3200);
		Employee e4=new Employee("Prashanth", 4, 2001);
		Employee e5=new Employee("Mahesh", 2, 100);
	
		Employee[] emps=new Employee[5];
		for(int i=0;i<emps.length; )
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e4;
		emps[3]=e3;
		emps[4]=e5;
		
		
		Employee e=ma.getHiestSal(emps);
		System.out.println("highest salary employee details are ");
		System.out.println("name: "+e.name+" id: "+e.id+" sal: "+e.sal);
		
		//return the employe with highest sal
		
		
        System.exit(0);		
		int i;
		int[] numbers= {2,3,4,1,7};
		String[] strs=new String[10];
		int[] nums=new int[10];
		
		strs[0]="dattu";
		strs[1]="prem";
		strs[2]="pranavi";
		
		
		System.out.println(numbers[2]);
        System.out.println();
		for(String str:strs)
		{
			System.out.print(str+" ");
		
		}
		System.out.println();
		for(int n:nums)
		{
			System.out.print(n+" ");
		}
		
		Integer myint=new Integer(2);
		int x=2;
	
		Integer[] myints=new Integer[5];
		
		System.out.println("my int is "+myint);
		System.out.println(myints[0]);
	

	}

	private Employee getHiestSal(Employee[] emps) {
        //we have array of employee
		// we need to return the employee with highest salary
		Employee hs=null;
		long sal=0;
		
		for(Employee e:emps)
		{			
			System.out.println(e);
			if(e.sal>sal)
			{
				sal=e.sal;
				hs=e;
			}	
		}
		return hs;
	}
	
   List<Employee> EmployeeswithCondi(Employee[] emps,long condsal){
	String str="dattu";
	
	   //our list should contain all employees whose salary is greater than condsal
	   
	   //create emplist
	   //read emps 
	      //add employee into emplist when employee sal is greater than condsal
	   //return emplist;
	   
	   return null;
   }
}

class Employee {
	String name;
	int id;
	long sal;
	
	Employee(String name,int id,long sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
}