package com.wp.Collection;
import java.util.*;

public class CollectionTask {
	
	
	static CollectionTask t=new CollectionTask();
	static ArrayList <Employee> list= new ArrayList<Employee>();
	static Scanner input = new Scanner(System. in);
	private static String c;
	
	 public static void addEmployee()
	 {
		 System.out.println("Enter ENO");
		 int eno = input. nextInt();
		 System.out.println("Enter ENAME");
		 String ename = input. next();
		 System.out.println("Enter DEPT");
		 String dept = input. next();
		 System.out.println("Enter DESG");
		 String desg = input. next();
		 System.out.println("Enter SAl");
		 int sal = input. nextInt();
		 Employee e =new Employee(eno,ename,dept,desg,sal);
		 list.add(e);
 
		 
		 
	 }
	
	public static void viewAll()
				 
	{
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println("ENO"+list.get(i).eno);
			System.out.println("Ename"+list.get(i).ename);
			System.out.println("DEPT"+list.get(i).dept);
			System.out.println("DESG"+list.get(i).des);
			System.out.println("Sal"+list.get(i).sal);
			
			
		}
		
	}
	public static void searchEmp()
	{
		
		
		System.out.println("Enter Eno of employee whom you want to search");
	   	int srch=input.nextInt();
	   	for(int i=0;i<list.size();i++)
	   	{ 
	   	if(list.get(i).eno==srch)
	   	{System.out.println("Employee no is "+list.get(i).eno);
	       System.out.println("Employee name is "+list.get(i).ename);
	       System.out.println("Employee department is "+list.get(i).dept);
	       System.out.println("Employee salary is "+list.get(i).sal);
	       System.out.println("Employee designation is "+list.get(i).des);}
	   	}
		
	}
	public static void removeEmp(){
		
		System.out.println("Enter Eno of employee whom you want to delete");
	   	int del=input.nextInt();
	   	for(int i=0;i<list.size();i++)
	   	{ 
	   	if(list.get(i).eno==del)
	   	   list.remove(list.get(i));
	   	System.out.println("Employee Deleted");
	   	}
		
	}
	public static void clearData(){
		list.clear();
	}
	public static void changeSal(){
		
		System.out.println("Enter Eno of employee whom you want to change salary");
	   	int chgsal=input.nextInt();
	   	for(int i=0;i<list.size();i++)
	   	{ 
	   	if(list.get(i).eno==chgsal)
	   	{
	   	System.out.println("Insert the new salary you want");
	   	int newsal=input.nextInt();
	   	list.get(i).sal=newsal;
	   	System.out.println("salary Changed");
	   	}
	   	}
		
	}
	public  void viewDeptWise(){
		 
  c = input. next();
		
for (int i = 0; i < list.size(); i++) {
	if(list.get(i).dept.equals(c))
	{
	
			System.out.println("ENO"+list.get(i).eno);
			System.out.println("Ename"+list.get(i).ename);
			System.out.println("DEPT"+list.get(i).dept);
			System.out.println("DESG"+list.get(i).des);
			System.out.println("Sal"+list.get(i).sal);
}
		
		
}	
	}
	
	public static void viewSortedEmployee(){
		Collections.sort(list);
		System.out.println(list);	
	}
	public static void SortEmployee(){
	   // System.out.println(list);
		System.out.println("DEFAULT SORTING ON EMPLOYEE NUMBER GIVE YOUR CHOICE TO SORT ON DIFFERENT ASPECTS");
		viewSortedEmployee();
	    System.out.println("SORT ON THE BASIS OF:");
	    System.out.println("1.EMPLOYEE NO");
	    System.out.println("2.SALARY");
	    System.out.println("3.EMPLOYEE NAME");
	    System.out.println("4.EMPLOYEE DEPARTMENT");
	    
		int sortBasis=input.nextInt();
		
		if(sortBasis==1){
			Collections.sort(list, new Comparator<Employee>(){
		          @Override
					public int compare(Employee e1, Employee e2) {
						return e1.getEno()-e2.getEno();
						
					}});
		}
		else if(sortBasis==2){
			Collections.sort(list, new Comparator<Employee>(){
		          @Override
					public int compare(Employee e1, Employee e2) {
						return e1.getSal()-e2.getSal();
					
						
					}});
		}
		else if(sortBasis==3){
			Collections.sort(list, new Comparator<Employee>(){
		          @Override
					public int compare(Employee e1, Employee e2) {
		        		int n=e1.getEname().compareTo(e2.getEname());
		      			return n;
						
					}});
		}
		else if(sortBasis==4){
			Collections.sort(list, new Comparator<Employee>(){
		          @Override
					public int compare(Employee e1, Employee e2) {
		        	  int n=e1.getDept().compareTo(e2.getDept());
		      			return n;
						
					}});
		}
			else System.out.println("INVALID ENTRY");
			
			
		for(Employee emp:list){
			System.out.println(emp);
			}	
	
	
	}
	
	
	
	public static void main(String[] args) {
		
	
		System.out.println("Enter YOur CHOICE");
		System.out.println("1. Add Employee ");
		System.out.println("2. view All: ");
		System.out.println("3. Search Employee");
		System.out.println("4.Remove Employee ");
		System.out.println("5.Clear Data ");
		System.out.println("6.Change Salary ");
		System.out.println("7.View Dept Wise ");
		System.out.println("8.viewSortedEmployee");
		System.out.println("9. EXIT");

		 while(true){  
		int choice = input. nextInt();
	      
	       
		switch (choice) {
		
		case 1: addEmployee();
			  break;
	     
		case 2: viewAll();
		  break;
		  
		case 3: searchEmp();
		  break;
		  
		case 4: removeEmp();
		  break;
		  
		case 5: clearData();
		  break;
		  
		case 6: changeSal();
		  break;
		  
		case 7: t.viewDeptWise();
		  break;
		  
		 case 8: SortEmployee();
		  break;
		  
		case 9: System.exit(1);
		  break;
		default:
			break;
		}
		
	  }     
	}
	
	
	
	
}
