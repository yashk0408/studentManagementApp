package com.smaapp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
	  System.out.println("Welcome to Student Management App");
	  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	   while (true){
		   System.out.println("PRESS 1 TO ADD STUDENT");
		   System.out.println("PRESS 2 TO DELETE STUDENT");
		   System.out.println("PRESS 3 TO DISPLAY");
		   System.out.println("PRESS 4 TO EXIT APP");
		   int c = Integer.parseInt(br.readLine());
		   
		 if(c==1) {
			 System.out.println("ENTER USER NAME :");
			 String name=br.readLine();
			 
			 System.out.println("ENTER USER PHONE :");
			 String phone=br.readLine();
			 
			 System.out.println("ENTER USER CITY :");
			 String city=br.readLine();
			 
			 Student st = new Student(name,phone,city);
			 boolean answer=StudentDao.insertStudentToDB(st);{
				 if(answer) {
					 System.out.println("student is added successfully");
				 }else {
					 System.out.println("something went wrong");
				 }
			 }
			 System.out.println(st);
			 
		 }else if(c==2) {
			 System.out.println("Enter student id to delete");
			 int userId=Integer.parseInt(br.readLine());
			 boolean f=StudentDao.deleteStudent(userId);
			 if(f) {
				 System.out.println("Deleted...");
			 }else {
				 System.out.println("something went wrong");
			 } 
		 }else if(c==3) {
			StudentDao.showAllStudent();
		 }else if(c==4) {
			 break;
		 }else {
			System.out.println("\n"+"Please select a valid input!!"+"\n");
	   }
	    System.out.println("Thank you for using my application...");
	    System.out.println("see you soon...");
		
}
}}