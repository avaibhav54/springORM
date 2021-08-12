package com.spring.orm.springorm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.studentDao;
import com.spring.orm.entities.student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	studentDao sd=(studentDao) context.getBean("studentDao");
    //insert object

    	Scanner sc=new Scanner(System.in);
    	
    	while(true)
    	{
    		System.out.println("Press 1 to insert \n press 2 to delete student\n press 3 to update student \n press 4 to get single student \n press 5 to get all students\n press 0 to exit\n");
    	try {
			
    		int inp=sc.nextInt();
    		if(inp==0)break;
    		if(inp==1)
    		{
    			System.out.println("Enter the id of student::: ");
			int id=sc.nextInt();
    			System.out.println("Enter the name of student::: ");
    			String name=sc.next();
    			System.out.println("Enter the city of student::: ");
    	    		String addr=sc.next();
    	    	student stud=new student(id,name,addr);
    	    	int r=sd.insert(stud);
    	    	System.out.println("done !! record inserted successfully");
    		}
    		else if(inp==2)
    		{
    			System.out.println("Enter the id of student::: ");
			int id=sc.nextInt();
			sd.deleteStudent(id);
	    	System.out.println("done !! record deleted successfully");
    		}
    		else if(inp==3)
    		{
    			System.out.println("Enter the id of student::: ");
    			int id=sc.nextInt();
    	
    			System.out.println("Enter the name of student::: ");
    			String name=sc.next();
    			System.out.println("Enter the city of student::: ");
    	    		String addr=sc.next();
    	    	student stud=new student(id,name,addr);
    	    	sd.updateStudent(stud);
    	    	System.out.println("done !! record updated successfully");
    
    		}
    		else if(inp==4)
    		{
    			System.out.println("Enter the id of student::: ");
    			int id=sc.nextInt();
    			student std=sd.getStudent(id);
    	
    			System.out.println("Id ::"+std.getStudentId()+"\n Name:: "+std.getsName()+"\n City"+std.getsCity());
    		}
    		else if(inp==5)
    		{
    			List<student>lis=sd.getAllStudent();
    			for(student std:lis)
        			System.out.println("Id ::"+std.getStudentId()+"\n Name:: "+std.getsName()+"\n City"+std.getsCity());
    		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			e.printStackTrace();
		}
    	}
    	System.out.println("thank you-----------------------------");
    }
}
